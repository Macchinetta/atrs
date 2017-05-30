/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.app.c1;

import jp.co.ntt.atrs.app.c0.MemberValidator;
import jp.co.ntt.atrs.domain.service.c1.MemberRegisterErrorCode;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.inject.Inject;

/**
 * 会員情報登録フォームのバリデータ。
 * 
 * @author NTT 電電花子
 */
@Component
public class MemberRegisterValidator implements Validator {

    /**
     * 会員情報バリデータ。
     */
    @Inject
    MemberValidator memberValidator;

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean supports(Class<?> clazz) {
        return MemberRegisterForm.class.isAssignableFrom(clazz);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void validate(Object target, Errors errors) {

        MemberRegisterForm form = (MemberRegisterForm) target;

        // パスワードチェック
        if (!errors.hasFieldErrors("password")
            && !errors.hasFieldErrors("reEnterPassword")) {

            String password = form.getPassword();
            String reEnterPassword = form.getReEnterPassword();
            if (!password.equals(reEnterPassword)) {

                // パスワードと再入力パスワードが異なる場合エラー
                errors.reject(MemberRegisterErrorCode.E_AR_C1_5001.code());
            }
        }

        // 共通チェック
        ValidationUtils.invokeValidator(memberValidator, form, errors);

    }
}
