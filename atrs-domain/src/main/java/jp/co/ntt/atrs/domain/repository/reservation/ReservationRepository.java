/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.repository.reservation;

import jp.co.ntt.atrs.domain.model.Passenger;
import jp.co.ntt.atrs.domain.model.Reservation;
import jp.co.ntt.atrs.domain.model.ReserveFlight;

/**
 * 予約テーブルにアクセスするリポジトリインターフェース。
 * 
 * @author NTT 電電太郎
 */
public interface ReservationRepository {

    /**
     * 予約情報を登録する。
     * <p>登録時に発出された予約番号が引数の予約情報に格納される。</p>
     * 
     * @param reservation 予約情報
     * @return 登録件数
     */
    int insert(Reservation reservation);

    /**
     * 予約フライト情報を登録する。
     * 
     * @param reserveFlight 予約フライト情報
     * @return 登録件数
     */
    int insertReserveFlight(ReserveFlight reserveFlight);

    /**
     * 搭乗者情報を登録する。
     * 
     * @param passenger 搭乗者情報
     * @return 登録件数
     */
    int insertPassenger(Passenger passenger);

}
