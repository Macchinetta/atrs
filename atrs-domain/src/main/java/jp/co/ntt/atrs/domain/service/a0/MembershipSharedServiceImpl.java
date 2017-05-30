/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.service.a0;

import jp.co.ntt.atrs.domain.repository.member.MemberRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.inject.Inject;

/**
 * 会員共通サービス実装クラス。
 * 
 * @author NTT 電電太郎
 */
@Service
public class MembershipSharedServiceImpl implements MembershipSharedService {

    /**
     * カード会員情報リポジトリ。
     */
    @Inject
    MemberRepository memberRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    @Transactional(readOnly = true)
    public boolean isMember(String membershipNumber) {

        Assert.hasText(membershipNumber);

        // 該当する会員情報が存在するか判定
        return (memberRepository.findOne(membershipNumber) != null);
    }

}
