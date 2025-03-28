/*
 * Copyright(c) 2015 NTT Corporation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package jp.co.ntt.atrs.domain.common.masterdata;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import jp.co.ntt.atrs.domain.common.util.DateTimeUtil;
import jp.co.ntt.atrs.domain.model.PeakTime;
import jp.co.ntt.atrs.domain.repository.peaktime.PeakTimeRepository;

/**
 * ピーク時期情報を提供するクラス。
 * @author NTT 電電太郎
 */
@Component
public class PeakTimeProvider {

    /**
     * ピーク時期情報リポジトリ。
     */
    @Inject
    PeakTimeRepository peakTimeRepository;

    /**
     * ピーク時期リストのリスト。
     */
    private final List<PeakTime> peakTimeList = new ArrayList<>();

    /**
     * ピーク時期情報をロードし、キャッシュする。
     */
    @PostConstruct
    public void load() {
        peakTimeList.addAll(peakTimeRepository.findAll());
    }

    /**
     * 指定搭乗日に該当するピーク時期情報を取得する。
     * @param depDate 搭乗日
     * @return ピーク時期情報。該当するピーク時期情報が存在しない場合null。
     */
    public PeakTime getPeakTime(Date depDate) {
        Assert.notNull(depDate, "depDate must not null.");
        LocalDate depLocalDate = DateTimeUtil.toLocalDate(depDate);

        for (PeakTime peakTime : peakTimeList) {
            LocalDate peakStartDate = DateTimeUtil.toLocalDate(peakTime.getPeakStartDate());
            LocalDate peakEndDate = DateTimeUtil.toLocalDate(peakTime.getPeakEndDate());

            // 搭乗日が該当するピーク時期積算比率を返却
            if (!(depLocalDate.isBefore(peakStartDate) || depLocalDate.isAfter(peakEndDate))) {
                return peakTime;
            }
        }
        return null;
    }

}
