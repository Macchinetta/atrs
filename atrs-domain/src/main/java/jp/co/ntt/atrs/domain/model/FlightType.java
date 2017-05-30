/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.model;

/**
 * フライト種別の列挙型。
 * 
 * @author NTT 電電太郎
 */
public enum FlightType {

    /**
     * 往復のフライト種別。
     */
    RT,

    /**
     * 片道のフライト種別。
     */
    OW;

    /**
     * フライト種別を取得する。
     * 
     * @return フライト種別
     */
    public String getCode() {
        return this.name();
    }

}
