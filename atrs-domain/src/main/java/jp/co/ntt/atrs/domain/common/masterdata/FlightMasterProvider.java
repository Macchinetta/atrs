/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.common.masterdata;

import jp.co.ntt.atrs.domain.model.FlightMaster;
import jp.co.ntt.atrs.domain.repository.flight.FlightRepository;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

/**
 * フライト基本情報を提供するクラス。
 * 
 * @author NTT 電電太郎
 */
@Component
public class FlightMasterProvider {

    /**
     * フライト基本情報リポジトリ。
     */
    @Inject
    FlightRepository flightRepository;

    /**
     * 便名とフライト基本情報の関係を保持するキャッシュ。
     */
    private final Map<String, FlightMaster> flightMasterMap = new HashMap<>();

    /**
     * フライト基本情報をロードし、キャッシュする。
     */
    @PostConstruct
    public void load() {
        List<FlightMaster> flightMasterList = flightRepository.findAllFlightMaster();
        for (FlightMaster flightMaster : flightMasterList) {
            flightMasterMap.put(flightMaster.getFlightName(), flightMaster);
        }
    }

    /**
     * 指定便名に該当するフライト基本情報を取得する。
     * 
     * @param flightName 便名
     * @return フライト基本情報。該当するフライト基本情報がない場合はnull。
     */
    public FlightMaster getFlightMaster(String flightName) {
        Assert.hasText(flightName);
        return this.flightMasterMap.get(flightName);
    }
}
