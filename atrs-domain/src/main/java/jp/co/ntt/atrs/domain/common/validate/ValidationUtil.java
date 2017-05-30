/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.common.validate;


/**
 * 入力値チェックの共通ユーティリティ。
 * 
 * @author NTT 電電太郎
 */
public class ValidationUtil {

    /**
     * 電話番号1と電話番号2の最大合計桁数。
     */
    public static final int TEL1_AND_TEL2_MAX_LENGTH = 7;

    /**
     * 電話番号1と電話番号2の最小合計桁数。
     */
    public static final int TEL1_AND_TEL2_MIN_LENGTH = 6;

    /**
     * コンストラクタ。
     */
    private ValidationUtil() {
        // 実装必要なし
    }

    /**
     * 電話番号の市外局番＋市内局番の合計桁数が6-7桁になるかをチェックする。
     * 
     * @param tel1 市外局番
     * @param tel2 市内局番
     * @return 6-7桁:true それ以外:false
     */
    public static boolean isValidTelNum(String tel1, String tel2) {
        int telLength = tel1.length() + tel2.length();
        return TEL1_AND_TEL2_MIN_LENGTH <= telLength
            && telLength <= TEL1_AND_TEL2_MAX_LENGTH;
    }

}
