/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.common.message;

/**
 * メッセージキーを表す列挙型。
 * 
 * @author NTT 電電太郎
 */
public enum MessageKeys {

    /**
     * 会員情報の更新が成功したことを通知するためのメッセージキー。
     */
    I_AR_C2_2001("i.ar.c2.2001");

    /**
     * メッセージキー。
     */
    private final String key;

    /**
     * コンストラクタ。
     * 
     * @param key メッセージキー。
     */
    private MessageKeys(String key) {
        this.key = key;
    }

    /**
     * メッセージキーを取得する。
     * 
     * @return メッセージキー
     */
    public String key() {
        return key;
    }

}
