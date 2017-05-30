/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.service.a2;

import jp.co.ntt.atrs.domain.model.Member;

/**
 * 会員ログアウトサービスインタフェース。
 * 
 * @author NTT 電電太郎
 */
public interface AuthLogoutService {

    /**
     * ログアウト時に必要な業務処理を行う。
     * 
     * @param member 会員情報
     */
    void logout(Member member);
}
