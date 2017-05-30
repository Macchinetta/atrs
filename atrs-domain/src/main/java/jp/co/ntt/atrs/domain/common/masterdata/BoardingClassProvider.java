/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.common.masterdata;

import jp.co.ntt.atrs.domain.model.BoardingClass;
import jp.co.ntt.atrs.domain.model.BoardingClassCd;
import jp.co.ntt.atrs.domain.repository.boardingclass.BoardingClassRepository;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

/**
 * 搭乗クラス情報を提供するクラス。
 * 
 * @author NTT 電電太郎
 */
@Component
public class BoardingClassProvider {

    /**
     * 搭乗クラス情報リポジトリ。
     */
    @Inject
    BoardingClassRepository boardingClassRepository;

    /**
     * 搭乗クラスコードと搭乗クラスの関係を保持するマップ。
     */
    private final Map<BoardingClassCd, BoardingClass> boardingClassCodeMap =
            new HashMap<>();

    /**
     * 搭乗クラス情報をロードし、キャッシュする。
     */
    @PostConstruct
    public void load() {
        List<BoardingClass> boardingClassList = boardingClassRepository.findAll();
        for (BoardingClass boardingClass : boardingClassList) {
            boardingClassCodeMap.put(boardingClass.getBoardingClassCd(), boardingClass);
        }
    }

    /**
     * 搭乗クラスコードに該当する搭乗クラス情報を取得する。
     * 
     * @param boardingClassCd 搭乗クラスコード
     * @return 搭乗クラス情報。該当する搭乗クラス情報がない場合はnull。
     */
    public BoardingClass getBoardingClass(BoardingClassCd boardingClassCd) {
        Assert.notNull(boardingClassCd);
        return boardingClassCodeMap.get(boardingClassCd);
    }

}
