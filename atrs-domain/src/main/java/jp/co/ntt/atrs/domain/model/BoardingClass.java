/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * 搭乗クラス情報。
 * 
 * @author NTT 電電太郎
 */
public class BoardingClass implements Serializable {

    /**
     * serialVersionUID。
     */
    private static final long serialVersionUID = -6948735775882604527L;

    /**
     * 搭乗クラスコード。
     */
    private BoardingClassCd boardingClassCd;

    /**
     * 搭乗クラス名。
     */
    private String boardingClassName;

    /**
     * 加算料金。
     */
    private Integer extraCharge;

    /**
     * 搭乗クラスコードを取得する。
     * 
     * @return 搭乗クラスコード
     */
    public BoardingClassCd getBoardingClassCd() {
        return boardingClassCd;
    }

    /**
     * 搭乗クラスコードを設定する。
     * 
     * @param boardingClassCd 搭乗クラスコード
     */
    public void setBoardingClassCd(BoardingClassCd boardingClassCd) {
        this.boardingClassCd = boardingClassCd;
    }

    /**
     * 搭乗クラス名を取得する。
     * 
     * @return 搭乗クラス名
     */
    public String getBoardingClassName() {
        return boardingClassName;
    }

    /**
     * 搭乗クラス名を設定する。
     * 
     * @param boardingClassName 搭乗クラス名
     */
    public void setBoardingClassName(String boardingClassName) {
        this.boardingClassName = boardingClassName;
    }

    /**
     * 加算料金を取得する。
     * 
     * @return 加算料金
     */
    public Integer getExtraCharge() {
        return extraCharge;
    }

    /**
     * 加算料金を設定する。
     * 
     * @param extraCharge 加算料金
     */
    public void setExtraCharge(Integer extraCharge) {
        this.extraCharge = extraCharge;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
