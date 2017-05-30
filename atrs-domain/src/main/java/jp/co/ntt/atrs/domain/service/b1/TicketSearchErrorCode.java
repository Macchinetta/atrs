/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.service.b1;

import jp.co.ntt.atrs.domain.common.exception.AtrsErrorCode;

/**
 * 空席照会サービスエラーコードを表す列挙型。
 * 
 * @author NTT 電電次郎
 */
public enum TicketSearchErrorCode implements AtrsErrorCode {

    /**
     * 空席照会の対象期間外の搭乗日が指定された事を通知するためのエラーコード。
     */
    E_AR_B1_2001("e.ar.b1.2001"),

    /**
     * 運行区間外の空港が指定された事を通知するためのエラーコード。
     */
    E_AR_B1_2002("e.ar.b1.2002"),

    /**
     * 条件に一致するフライトがない事を通知するためのエラーコード。
     */
    E_AR_B1_2003("e.ar.b1.2003"),

    /**
     * 出発空港と到着空港に同じ空港が指定された事を通知するためのエラーコード。
     */
    E_AR_B1_5001("e.ar.b1.5001"),

    /**
     * 復路搭乗日に往路搭乗日より前の日付が指定された事を通知するためのエラーコード。
     */
    E_AR_B1_5002("e.ar.b1.5002");

    /**
     * エラーコード。
     */
    private final String code;

    /**
     * コンストラクタ。
     * 
     * @param code エラーコード。
     */
    private TicketSearchErrorCode(String code) {
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
