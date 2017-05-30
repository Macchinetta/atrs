/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.service.a1;

import jp.co.ntt.atrs.domain.model.Member;

/**
 * 会員ログインサービスインタフェース。
 * 
 * @author NTT 電電太郎
 */
public interface AuthLoginService {

    /**
     * ログイン時に必要な業務処理を行う。
     * 
     * @param member 会員情報
     */
    void login(Member member);

}
