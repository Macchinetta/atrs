/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.service.a1;

import jp.co.ntt.atrs.domain.common.logging.LogMessages;
import jp.co.ntt.atrs.domain.model.Member;
import jp.co.ntt.atrs.domain.model.MemberLogin;
import jp.co.ntt.atrs.domain.repository.member.MemberRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.terasoluna.gfw.common.date.jodatime.JodaTimeDateFactory;
import org.terasoluna.gfw.common.exception.SystemException;

import javax.inject.Inject;

/**
 * 会員ログインサービス実装クラス。
 * 
 * @author NTT 電電太郎
 */
@Service
@Transactional
public class AuthLoginServiceImpl implements AuthLoginService {

    /**
     * ロガー。
     */
    private static final Logger LOGGER =
            LoggerFactory.getLogger(AuthLoginServiceImpl.class);

    /**
     * 日付生成インターフェース。
     */
    @Inject
    JodaTimeDateFactory dateFactory;

    /**
     * カード会員情報リポジトリ。
     */
    @Inject
    MemberRepository memberRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public void login(Member member) {

        // パラメータチェック
        Assert.notNull(member);

        // ログインフラグ、ログイン日時を更新
        MemberLogin memberLogin = member.getMemberLogin();
        memberLogin.setLoginDateTime(dateFactory.newDate());
        memberLogin.setLoginFlg(true);
        int updateCount = memberRepository.updateToLoginStatus(member);
        if (updateCount != 1) {
            throw new SystemException(LogMessages.E_AR_A0_L9002.getCode(),
                    LogMessages.E_AR_A0_L9002.getMessage(updateCount, 1));
        }

        LOGGER.info(LogMessages.I_AR_A1_L0001.getMessage(member.getMembershipNumber()));
    }

}
