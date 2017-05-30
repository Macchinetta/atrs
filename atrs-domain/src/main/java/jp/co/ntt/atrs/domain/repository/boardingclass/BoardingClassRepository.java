/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.repository.boardingclass;

import jp.co.ntt.atrs.domain.model.BoardingClass;

import java.util.List;

/**
 * 搭乗クラステーブルにアクセスするリポジトリインターフェース。
 * 
 * @author NTT 電電太郎
 */
public interface BoardingClassRepository {
    /**
     * 全ての搭乗クラスを取得する。
     * 
     * @return 搭乗クラスリスト
     */
    List<BoardingClass> findAll();
}
