/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.common.security;

import org.springframework.security.authentication.event.AbstractAuthenticationEvent;
import org.springframework.security.core.Authentication;

/**
 * ログアウト成功イベントクラス。
 * 
 * @author NTT 電電太郎
 */
public class AtrsLogoutSuccessEvent extends AbstractAuthenticationEvent {

    /**
     * serialVersionUID。
     */
    private static final long serialVersionUID = 1024168737113170485L;

    /**
     * コンストラクタ。
     * 
     * @param authentication 認証情報
     */
    public AtrsLogoutSuccessEvent(Authentication authentication) {
        super(authentication);
    }
}
