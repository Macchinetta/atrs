/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.app.b1;

import jp.co.ntt.atrs.domain.service.b1.TicketSearchErrorCode;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * 空席照会条件フォームのバリデータ。
 * <p>下記の場合をエラーとする。</p>
 * <ul>
 * <li>出発空港と到着空港が同じ場合。</li>
 * </ul>
 * 
 * @author NTT 電電次郎
 */
@Component
public class FlightSearchCriteriaValidator implements Validator {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean supports(Class<?> clazz) {
        return (FlightSearchCriteriaForm.class).isAssignableFrom(clazz);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void validate(Object target, Errors errors) {

        FlightSearchCriteriaForm form = (FlightSearchCriteriaForm) target;

        // 出発空港と到着空港が同じでないかチェック
        if (!errors.hasFieldErrors("depAirportCd")
            && !errors.hasFieldErrors("arrAirportCd")) {
            String depAirport = form.getDepAirportCd();
            String arrAirport = form.getArrAirportCd();
            if (depAirport.equals(arrAirport)) {
                errors.reject(TicketSearchErrorCode.E_AR_B1_5001.code());
            }
        }

    }

}
