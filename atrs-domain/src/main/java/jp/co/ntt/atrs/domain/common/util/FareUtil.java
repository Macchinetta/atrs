/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.common.util;

import java.math.BigDecimal;

/**
 * 運賃に関するユーティリティクラス。
 * 
 * @author NTT 電電太郎
 */
public class FareUtil {

    /**
     * 運賃切り上げに使用するスケール値。
     */
    private static final int CEIL_FARE_SCALE = -2;

    /**
     * コンストラクタ。
     */
    private FareUtil() {
        // 処理なし
    }

    /**
     * 運賃の100円未満の値を切上げる。
     * 
     * @param fare 運賃
     * @return 100円未満を切上げた運賃
     */
    public static int ceilFare(int fare) {
        return new BigDecimal(fare)
                .setScale(CEIL_FARE_SCALE, BigDecimal.ROUND_UP)
                .intValue();
    }
}
