/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.app.b0;

/**
 * 路線種別の列挙型。
 * 
 * @author NTT 電電次郎
 */
public enum LineType {

    /**
     * 往路。
     */
    OUTWARD("outward", "往路"),

    /**
     * 復路。
     */
    HOMEWARD("homeward", "復路");

    /**
     * 路線種別コード。
     */
    private final String code;

    /**
     * 路線種別名称。
     */
    private final String name;

    /**
     * コンストラクタ。
     *
     * @param code 路線種別コード
     * @param name 路線種別名称
     */
    private LineType(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * 路線種別コードを取得する。
     *
     * @return 路線種別コード
     */
    public String getCode() {
        return code;
    }

    /**
     * 路線種別名称を取得する。
     *
     * @return 路線種別名称
     */
    public String getName() {
        return name;
    }

}
