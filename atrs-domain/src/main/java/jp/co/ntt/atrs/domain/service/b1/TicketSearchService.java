/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.service.b1;

import org.terasoluna.gfw.common.exception.BusinessException;

import java.util.List;

/**
 * 空席照会サービスインタフェース。
 * 
 * @author NTT 電電次郎
 */
public interface TicketSearchService {

    /**
     * 空席照会を行う。
     * <p>
     * 検索条件に合致する便と、その便の運賃種別ごとの運賃・空席数を返却する。
     * 便は出発時刻の昇順でソートされる。
     * </p>
     * 
     * @param searchCriteria 空席照会の検索条件
     * @return 空席照会の検索結果
     * @throws BusinessException 該当する空席情報が存在しない場合の業務例外
     */
    List<FlightVacantInfoDto> searchFlight(TicketSearchCriteriaDto searchCriteria)
            throws BusinessException;
}
