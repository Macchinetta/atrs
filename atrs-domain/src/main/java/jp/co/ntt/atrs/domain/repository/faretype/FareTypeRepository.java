/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.repository.faretype;

import jp.co.ntt.atrs.domain.model.FareType;

import java.util.List;

/**
 * 運賃種別テーブルにアクセスするリポジトリインターフェース。
 * 
 * @author NTT 電電太郎
 */
public interface FareTypeRepository {
    /**
     * 全ての運賃種別を取得する。
     * 
     * @return 運賃種別リスト
     */
    List<FareType> findAll();

}
