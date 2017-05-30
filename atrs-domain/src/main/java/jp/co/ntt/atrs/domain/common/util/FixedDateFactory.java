/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.common.util;

import org.joda.time.DateTime;
import org.terasoluna.gfw.common.date.jodatime.AbstractJodaTimeDateFactory;

/**
 * 現在日付を固定するための日付生成クラス。
 * 
 * @author NTT 電電太郎
 */
public class FixedDateFactory extends AbstractJodaTimeDateFactory {

    /**
     * 年。
     */
    private int year;

    /**
     * 月。
     */
    private int month = 1;

    /**
     * 日。
     */
    private int dayOfMonth = 1;

    /**
     * 時。
     */
    private int hour;

    /**
     * 分。
     */
    private int minute;

    /**
     * {@inheritDoc}
     */
    @Override
    public DateTime newDateTime() {
        return new DateTime(year, month, dayOfMonth, hour, minute);
    }

    /**
     * 年を設定する。
     * 
     * @param year 年
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * 月を設定する。
     * 
     * @param month 月
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * 日を設定する。
     * 
     * @param dayOfMonth 日
     */
    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    /**
     * 時を設定する。
     * 
     * @param hour 時
     */
    public void setHour(int hour) {
        this.hour = hour;
    }

    /**
     * 分を設定する。
     * 
     * @param minute 分
     */
    public void setMinute(int minute) {
        this.minute = minute;
    }

}
