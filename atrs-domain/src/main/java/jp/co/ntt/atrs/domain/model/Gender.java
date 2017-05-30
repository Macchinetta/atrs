/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.model;


/**
 * 性別の列挙型。
 * 
 * @author NTT 電電太郎
 */
public enum Gender {

    /**
     * 女性のコード値。
     */
    F,

    /**
     * 男性のコード値。
     */
    M;

    /**
     * 性別コードを取得する。
     * 
     * @return 性別コード
     */
    public String getCode() {
        return name();
    }
}
