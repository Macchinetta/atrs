/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.service.b1;

import jp.co.ntt.atrs.domain.common.exception.AtrsBusinessException;

/**
 * フライト情報非存在業務例外クラス。
 * 
 * @author NTT 電電次郎
 */
public class FlightNotFoundException extends AtrsBusinessException {

    /**
     * serialVersionUID。
     */
    private static final long serialVersionUID = -7145777012040116550L;

    /**
     * コンストラクタ。
     */
    public FlightNotFoundException() {
        super(TicketSearchErrorCode.E_AR_B1_2003);
    }

}
