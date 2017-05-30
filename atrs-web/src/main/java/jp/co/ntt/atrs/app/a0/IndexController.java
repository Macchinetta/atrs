/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.app.a0;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * インデックスアクセスを制御するコントローラ。
 * 
 * @author NTT 電電太郎
 */
@Controller
@RequestMapping("/")
public class IndexController {

    /**
     * トップ画面を表示する。
     * 
     * @return View論理名
     */
    @RequestMapping
    public String homePage() {
        return "redirect:/ticket/search?topForm";
    }

}
