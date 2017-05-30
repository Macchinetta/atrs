/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.app.b2;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

/**
 * チケット予約完了画面出力用DTO。
 * 
 * @author NTT 電電三郎
 */
public class ReserveCompleteOutputDto implements Serializable {

    /**
     * serialVersionUID。
     */
    private static final long serialVersionUID = 3012610148172680335L;

    /**
     * 予約番号。
     */
    private String reserveNo;

    /**
     * 支払期限。
     */
    private Date paymentDate;

    /**
     * 予約チケットの合計金額。
     */
    private Integer totalFare;

    /**
     * 予約番号を取得する。
     * 
     * @return 予約番号
     */
    public String getReserveNo() {
        return reserveNo;
    }

    /**
     * 予約番号を設定する。
     * 
     * @param reserveNo 予約番号
     */
    public void setReserveNo(String reserveNo) {
        this.reserveNo = reserveNo;
    }

    /**
     * 支払期限を取得する。
     * 
     * @return 支払期限
     */
    public Date getPaymentDate() {
        return paymentDate;
    }

    /**
     * 支払期限を設定する。
     * 
     * @param paymentDate 支払期限
     */
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * 予約チケットの合計金額を取得する。
     * 
     * @return 予約チケットの合計金額
     */
    public Integer getTotalFare() {
        return totalFare;
    }

    /**
     * 予約チケットの合計金額を設定する。
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
