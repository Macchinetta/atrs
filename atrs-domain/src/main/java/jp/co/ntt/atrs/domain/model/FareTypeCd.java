/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.model;

/**
 * 運賃種別コードの列挙型。
 * 
 * @author NTT 電電太郎
 */
public enum FareTypeCd {

    /**
     * 片道運賃の運賃種別コード。
     */
    OW,

    /**
     * 往復運賃の運賃種別コード。
     */
    RT,

    /**
     * 予約割1の運賃種別コード。
     */
    RD1,

    /**
     * 予約割7の運賃種別コード。
     */
    RD7,

    /**
     * 早期割の運賃種別コード。
     */
    ED,

    /**
     * レディース割の運賃種別コード。
     */
    LD,

    /**
     * グループ割の運賃種別コード。
     */
    GD,

    /**
     * 特別片道運賃の運賃種別コード。
     */
    SOW,

    /**
     * 特別往復運賃の運賃種別コード。
     */
    SRT,

    /**
     * 特別予約割の運賃種別コード。
     */
    SRD;

    /**
     * 運賃種別コードを取得する。
     *
     * @return 運賃種別コード
     */
    public String getCode() {
        return this.name();
    }

}
