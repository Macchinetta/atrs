/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.app.c0;

import javax.inject.Inject;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.terasoluna.gfw.common.date.jodatime.JodaTimeDateFactory;

import jp.co.ntt.atrs.domain.common.util.DateTimeUtil;
import jp.co.ntt.atrs.domain.common.validate.ValidationUtil;
import jp.co.ntt.atrs.domain.service.c0.MemberErrorCode;

/**
 * 会員情報フォームの入力チェックを行うバリデータ。
 * 
 * @author NTT 電電花子
 */
@Component
public class MemberValidator implements Validator {

    /**
     * 日付、時刻取得インターフェース。
     */
    @Inject
    JodaTimeDateFactory dateFactory;

    /**
     * 会員登録可能な最小生年月日。
     */
    @Value("${atrs.dateOfBirthMinDate}")
    private String dateOfBirthMinDate;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean supports(Class<?> clazz) {
        return IMemberForm.class.isAssignableFrom(clazz);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void validate(Object target, Errors errors) {

        IMemberForm form = (IMemberForm) target;

        // メールアドレスチェック
        if (!errors.hasFieldErrors("mail") && !errors.hasFieldErrors("reEnterMail")) {
            String mail = form.getMail();
            String reEnterMail = form.getReEnterMail();
            if (!mail.equals(reEnterMail)) {
                // メールアドレスと再入力したメールアドレスが一致しない場合にエラー
                errors.reject(MemberErrorCode.E_AR_C0_5001.code());
            }
        }

        // 電話番号チェック
        if (!errors.hasFieldErrors("tel1") && !errors.hasFieldErrors("tel2")) {

            if (!ValidationUtil.isValidTelNum(form.getTel1(), form.getTel2())) {
                // 市外局番と市内局番の合計桁数が6～7桁でなければエラー
                errors.reject(MemberErrorCode.E_AR_C0_5002.code());
            }
        }

        // 生年月日チェック
        if (!errors.hasFieldErrors("dateOfBirth")) {

            DateTime dateOfBirthMin = DateTimeUtil.toDateTime(dateOfBirthMinDate);
            DateTime dateOfBirthMax = dateFactory.newDateTime();
            DateTime dateOfBirth = new DateTime(form.getDateOfBirth());

            Interval interval = new Interval(dateOfBirthMin, dateOfBirthMax);
            if (!interval.contains(dateOfBirth)) {
                // 生年月日の入力許容範囲(1900年1月1日から現在まで)でなければエラー
                errors.reject(
                    MemberErrorCode.E_AR_C0_5003.code(),
                    new Object[] { dateOfBirthMinDate,
                            DateTimeUtil.toFormatDateString(dateOfBirthMax) }, "");
            }
        }

    }
}
