/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.app.common.security;

import jp.co.ntt.atrs.domain.common.security.AtrsLogoutSuccessEvent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ユーザーログアウト成功ハンドラ。
 * 
 * @author NTT 電電太郎
 */
@Component
public class AtrsLogoutSuccessHandler extends SimpleUrlLogoutSuccessHandler {

    /**
     * イベント発行Publisher。
     */
    @Inject
    ApplicationEventPublisher eventPublisher;

    /**
     * {@inheritDoc}
     */
    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response,
        Authentication authentication)
        throws IOException, ServletException {

        if (authentication != null) {
            // ログアウト成功イベントを発行
            eventPublisher.publishEvent(new AtrsLogoutSuccessEvent(authentication));
        }
        super.handle(request, response, authentication);
    }

}
