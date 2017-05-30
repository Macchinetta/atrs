/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * 空港情報。
 * 
 * @author NTT 電電太郎
 */
public class Airport implements Serializable {

    /**
     * serialVersionUID。
     */
    private static final long serialVersionUID = -6766420294658404176L;

    /**
     * 空港コード。
     */
    private String code;

    /**
     * 空港名。
     */
    private String name;

    /**
     * 表示順。
     */
    private Integer displayOrder;

    /**
     *  空港コードを取得する。
     *  
     * @return 空港コード
     */
    public String getCode() {
        return code;
    }

    /**
     * 空港コードを設定する。
     * 
     * @param code 空港コード
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 空港名を取得する。
     * 
     * @return 空港名
     */
    public String getName() {
        return name;
    }

    /**
     * 空港名を設定する。
     * 
     * @param name 空港名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 表示順を取得する。
     * 
     * @return 空港名
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * 表示順を設定する。
     * 
     * @param displayOrder 表示順
     */
    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}

