/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.service.a1;

import jp.co.ntt.atrs.domain.common.exception.AtrsErrorCode;

/**
 * ログインサービスエラーコードを表す列挙型。
 * 
 * @author NTT 電電太郎
 */
public enum AuthLoginErrorCode implements AtrsErrorCode {

    /**
     * 会員番号から会員情報を取得できない事を通知するためのエラーコード。
     */
    E_AR_A1_2001("e.ar.a1.2001");

    /**
     * エラーコード。
     */
    private final String code;

    /**
     * コンストラクタ。
     * 
     * @param code エラーコード。
     */
    private AuthLoginErrorCode(String code) {
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
