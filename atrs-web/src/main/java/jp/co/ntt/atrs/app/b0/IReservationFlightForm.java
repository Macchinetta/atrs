/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.app.b0;

import jp.co.ntt.atrs.domain.model.FlightType;

import java.util.List;

/**
 * 予約フライトフォームインタフェース。
 * 予約フライト共通入力値チェックで使用するメソッドを定義する。
 * 
 * @author NTT 電電次郎
 * @see ReservationFlightValidator#validate(Object, org.springframework.validation.Errors)
 */
public interface IReservationFlightForm {

    /**
     * フライト種別を取得する。
     * 
     * @return フライト種別
     */
    FlightType getFlightType();

    /**
     * 選択フライト情報フォームのリストを取得する。
     * 
     * @return 選択フライト情報フォームのリスト
     */
    List<SelectFlightForm> getSelectFlightFormList();

}
