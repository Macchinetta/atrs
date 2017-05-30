/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.service.b0;


/**
 * フライト情報不正例外。
 * 
 * @author NTT 電電次郎
 */
public class InvalidFlightException extends RuntimeException {

    /**
     * serialVersionUID。
     */
    private static final long serialVersionUID = -8290953295757837929L;

    /**
     * コンストラクタ。
     * 
     * @param message エラーメッセージ
     */
    public InvalidFlightException(String message) {
        super(message);
    }

    /**
     * コンストラクタ。
     * 
     * @param e 例外オブジェクト
     */
    public InvalidFlightException(Exception e) {
        super(e);
    }

}
