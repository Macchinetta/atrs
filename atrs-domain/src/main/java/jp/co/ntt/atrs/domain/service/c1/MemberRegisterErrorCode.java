/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.service.c1;

import jp.co.ntt.atrs.domain.common.exception.AtrsErrorCode;

/**
 * 会員情報登録サービスでのエラーコードを表す列挙型。
 * 
 * @author NTT 電電花子
 */
public enum MemberRegisterErrorCode implements AtrsErrorCode {

    /**
     * パスワードと再入力したパスワードが一致しない事を通知するためのエラーコード。
     */
    E_AR_C1_5001("e.ar.c1.5001");

    /**
     * エラーコード。
     */
    private final String code;

    /**
     * コンストラクタ。
     *
     * @param code エラーコード。
     */
    private MemberRegisterErrorCode(String code) {
        this.code = code;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String code() {
        return code;
    }

}
