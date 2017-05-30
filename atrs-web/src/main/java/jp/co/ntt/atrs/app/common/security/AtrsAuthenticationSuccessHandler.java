/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.app.common.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

/**
 * ユーザーログイン成功ハンドラ。
 * 
 * @author NTT 電電太郎
 */
@Component
public class AtrsAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

    /**
     * {@inheritDoc}
     */
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
        HttpServletResponse response, Authentication authentication)
        throws IOException, ServletException {

        // for Ajax request
        if ("XMLHttpRequest".equals(request.getHeader("X-Requested-With"))) {

            clearAuthenticationAttributes(request);
            return;
        }

        super.onAuthenticationSuccess(request, response, authentication);
    }

}
