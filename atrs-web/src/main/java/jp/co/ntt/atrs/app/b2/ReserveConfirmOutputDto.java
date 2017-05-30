/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.app.b2;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * 申し込み内容確認画面出力用DTO。
 * 
 * @author NTT 電電三郎
 */
public class ReserveConfirmOutputDto implements Serializable {

    /**
     * serialVersionUID。
     */
    private static final long serialVersionUID = -1286295554938724418L;

    /**
     * 予約チケットの合計金額。
     */
    private Integer totalFare;

    /**
     * 予約チケットの合計金額 を取得する。
     *
     * @return 予約チケットの合計金額
     */
    public Integer getTotalFare() {
        return totalFare;
    }

    /**
     * 予約チケットの合計金額 を設定する。
     *
     * @param totalFare 予約チケットの合計金額
     */
    public void setTotalFare(Integer totalFare) {
        this.totalFare = totalFare;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
