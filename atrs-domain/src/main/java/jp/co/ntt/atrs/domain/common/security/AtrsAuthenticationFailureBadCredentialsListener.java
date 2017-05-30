/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.common.security;

import jp.co.ntt.atrs.domain.common.logging.LogMessages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.stereotype.Component;

/**
 * パスワード不正が原因で認証が失敗した事をハンドリングするための認証イベントリスナクラス。
 * 
 * @author NTT 電電太郎
 */
@Component
public class AtrsAuthenticationFailureBadCredentialsListener implements
        ApplicationListener<AuthenticationFailureBadCredentialsEvent> {

    /**
     * ロガー。
     */
    private static final Logger LOGGER = LoggerFactory
            .getLogger(AtrsAuthenticationFailureBadCredentialsListener.class);

    /**
     * {@inheritDoc}
     * 
     * <p>
     * パスワード不一致を通知するログを出力する。
     * </p>
     */
    @Override
    public void onApplicationEvent(AuthenticationFailureBadCredentialsEvent event) {
        if (!(event.getException() instanceof BadCredentialsException)) {
            return;
        }
        LOGGER.info(LogMessages.I_AR_A1_L2003.getMessage(
                event.getAuthentication().getName()), event.getException());
    }

}
