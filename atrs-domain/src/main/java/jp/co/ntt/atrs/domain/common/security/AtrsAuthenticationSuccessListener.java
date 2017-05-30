/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.common.security;

import jp.co.ntt.atrs.domain.service.a1.AtrsUserDetails;
import jp.co.ntt.atrs.domain.service.a1.AuthLoginService;

import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * ログイン成功イベントハンドリングクラス。
 * 
 * @author NTT 電電太郎
 */
@Component
public class AtrsAuthenticationSuccessListener implements
    ApplicationListener<AuthenticationSuccessEvent> {

    /**
     * 会員ログインサービス。
     */
    @Inject
    AuthLoginService authLoginService;

    /**
     * {@inheritDoc}
     * 
     * <p>ログイン処理成功後に会員ログインステータスを更新する。</p>
     */
    @Override
    public void onApplicationEvent(AuthenticationSuccessEvent event) {
        Authentication authentication = event.getAuthentication();

        AtrsUserDetails userDetails = (AtrsUserDetails) authentication.getPrincipal();
        authLoginService.login(userDetails.getMember());

    }
}
