/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.app.b1;

import jp.co.ntt.atrs.domain.model.FlightType;
import jp.co.ntt.atrs.domain.service.b1.TicketSearchErrorCode;

import org.joda.time.DateTime;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * 空席照会フォームのバリデータ。
 * <p>下記の場合をエラーとする。</p>
 * <ul>
 * <li>出発空港と到着空港が同じ場合。</li>
 * <li>フライト種別が往復の場合に復路搭乗日が入力されていない場合。</li>
 * <li>復路搭乗日が往路搭乗日以降ではない場合。</li>
 * </ul>
 * 
 * @author NTT 電電次郎
 */
@Component
public class TicketSearchValidator implements Validator {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean supports(Class<?> clazz) {
        return (TicketSearchForm.class).isAssignableFrom(clazz);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void validate(Object target, Errors errors) {

        TicketSearchForm form = (TicketSearchForm) target;

        // 出発空港と到着空港が同じでないかチェック
        if (!errors.hasFieldErrors("depAirportCd")
            && !errors.hasFieldErrors("arrAirportCd")) {
            String depAirport = form.getDepAirportCd();
            String arrAirport = form.getArrAirportCd();
            if (depAirport.equals(arrAirport)) {
                errors.reject(TicketSearchErrorCode.E_AR_B1_5001.code());
            }
        }

        // フライト種別が往復の場合
        if (FlightType.RT.equals(form.getFlightType())) {

            // 復路搭乗日必須チェック
            if (form.getHomewardDate() == null) {

                ValidationUtils.rejectIfEmpty(errors, "homewardDate", "NotNull",
                    new Object[] { new DefaultMessageSourceResolvable("homewardDate") });
            }

            // 復路搭乗日が往路搭乗日以降かチェック
            if (!errors.hasFieldErrors("outwardDate")
                && !errors.hasFieldErrors("homewardDate")) {

                DateTime outwardDate = new DateTime(form.getOutwardDate());
                DateTime homewardDate = new DateTime(form.getHomewardDate());
                if (homewardDate.isBefore(outwardDate)) {
                    errors.reject(TicketSearchErrorCode.E_AR_B1_5002.code());
                }
            }
        }

    }

}
