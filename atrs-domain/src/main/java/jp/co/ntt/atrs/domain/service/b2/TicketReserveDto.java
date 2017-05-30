/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.service.b2;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

/**
 * 予約情報を格納するDTO。
 * 
 * @author NTT 電電三郎
 */
public class TicketReserveDto implements Serializable {

    /**
     * serialVersionUID。
     */
    private static final long serialVersionUID = 2408442812824261775L;

    /**
     * 予約番号。
     */
    private String reserveNo;

    /**
     * 支払期限。
     */
    private Date paymentDate;

    /**
     * コンストラクタ。
     * 
     * @param reserveNo 予約番号
     * @param paymentDate 支払期限
     */
    public TicketReserveDto(String reserveNo, Date paymentDate) {
        this.reserveNo = reserveNo;
        this.paymentDate = paymentDate;
    }

    /**
     * 予約番号を取得する。
     * 
     * @return 予約番号
     */
    public String getReserveNo() {
        return reserveNo;
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
     * 予約番号を設定する。
     * 
     * @param reserveNo 予約番号
     */
    public void setReserveNo(String reserveNo) {
        this.reserveNo = reserveNo;
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
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
