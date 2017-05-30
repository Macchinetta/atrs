/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.repository.peaktime;

import jp.co.ntt.atrs.domain.model.PeakTime;

import java.util.List;

/**
 * ピーク時期テーブルにアクセスするリポジトリインターフェース。
 * 
 * @author NTT 電電太郎
 */
public interface PeakTimeRepository {

    /**
     * 全てのピーク時期を取得する。
     * 
     * @return ピーク時期リスト
     */
    List<PeakTime> findAll();
}
