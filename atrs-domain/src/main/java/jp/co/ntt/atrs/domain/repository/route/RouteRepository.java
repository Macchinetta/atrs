/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.repository.route;

import jp.co.ntt.atrs.domain.model.Route;

import java.util.List;

/**
 * 区間テーブルにアクセスするリポジトリインターフェース。
 * 
 * @author NTT 電電太郎
 */
public interface RouteRepository {

    /**
     * 全ての区間情報を取得する。
     * 
     * @return 区間情報リスト
     */
    List<Route> findAll();
}
