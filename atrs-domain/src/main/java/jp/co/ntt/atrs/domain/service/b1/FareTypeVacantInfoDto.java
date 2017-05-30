/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.service.b1;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * 運賃種別に対応する空席照会結果を格納するDTO。
 * 
 * @author NTT 電電太郎
 */
public class FareTypeVacantInfoDto implements Serializable {

    /**
     * serialVersionUID。
     */
    private static final long serialVersionUID = 4752497736854198465L;

    /**
     * 運賃種別名。
     */
    private final String fareTypeName;

    /**
     * 運賃。
     */
    private final String fare;

    /**
     * 空席数。
     */
    private final Integer vacantNum;

    /**
     * コンストラクタ。
     * 
     * @param fareTypeName 運賃種別名
     * @param fare 運賃
     * @param vacantNum 空席数
     */
    public FareTypeVacantInfoDto(String fareTypeName, String fare, Integer vacantNum) {
        this.fareTypeName = fareTypeName;
        this.fare = fare;
        this.vacantNum = vacantNum;
    }

    /**
     * 運賃種別名を取得する。
     * 
     * @return 運賃種別名
     */
    public String getFareTypeName() {
        return fareTypeName;
    }

    /**
     * 運賃を取得する。
     * 
     * @return 運賃
     */
    public String getFare() {
        return fare;
    }

    /**
     * 空席数を取得する。
     * 
     * @return 空席数
     */
    public Integer getVacantNum() {
        return vacantNum;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
