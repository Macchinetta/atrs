/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.app.a0;

import org.springframework.stereotype.Component;

import jp.co.ntt.atrs.domain.service.a1.AtrsUserDetails;

/**
 * 認証情報を扱うためのヘルパークラス。
 * 
 * @author NTT 電電太郎
 */
@Component
public class AuthenticationHelper {

    /**
     * 認証済みのユーザか確認する。
     * 
     * @param principal 認証情報を保持するオブジェクト
     * @return 認証済みのユーザの場合は<code>true</code>を返却。
     */
    public boolean isAuthenticatedPrincipal(AtrsUserDetails userDetails) {
        return (userDetails != null) ;
    }

}
