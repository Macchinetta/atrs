/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.model;

/**
 * 搭乗クラスコードの列挙型。
 * 
 * @author NTT 電電太郎
 */
public enum BoardingClassCd {

    /**
     * 一般席の搭乗クラスコード。
     */
    N,

    /**
     * 特別席の搭乗クラスコード。
     */
    S;

    /**
     * 搭乗クラスコードを取得する。
     *
     * @return 搭乗クラスコード
     */
    public String getCode() {
        return this.name();
    }

}
