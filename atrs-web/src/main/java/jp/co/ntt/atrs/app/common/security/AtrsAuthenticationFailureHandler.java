/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.app.common.security;

import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;
import org.terasoluna.gfw.common.exception.SystemException;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ユーザーログイン失敗ハンドラ。
 * 
 * @author NTT 電電太郎
 */
@Component
public class AtrsAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {

    /**
     * {@inheritDoc}
     */
    @Override
    public void onAuthenticationFailure(HttpServletRequest request,
        HttpServletResponse response, AuthenticationException exception)
        throws IOException, ServletException {

        // AuthenticationServiceExceptionの場合はシステム例外とする
        if (exception instanceof AuthenticationServiceException) {
            throw new SystemException("authentication service error.", exception);
        }

        // for Ajax request
        if ("XMLHttpRequest".equals(request.getHeader("X-Requested-With"))) {

            response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
            return;
        }

        super.onAuthenticationFailure(request, response, exception);
    }

}
