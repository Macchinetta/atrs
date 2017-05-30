/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.service.a0;

/**
 * 会員共通サービスインターフェース。
 * 
 * @author NTT 電電太郎
 */
public interface MembershipSharedService {

    /**
     * 会員であるか判定する。
     * 
     * @param membershipNumber 会員番号
     * @return 会員の場合true
     */
    boolean isMember(String membershipNumber);

}
