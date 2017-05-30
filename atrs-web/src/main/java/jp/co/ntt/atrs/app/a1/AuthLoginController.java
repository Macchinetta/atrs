/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.app.a1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ログイン認証コントローラ。
 * 
 * @author NTT 電電太郎
 */
@Controller
@RequestMapping("auth/login")
public class AuthLoginController {

    /**
     * ログイン画面を表示する。
     * 
     * @return View論理名
     */
    @RequestMapping
    public String loginForm() {
        return "A1/loginForm";
    }

}
