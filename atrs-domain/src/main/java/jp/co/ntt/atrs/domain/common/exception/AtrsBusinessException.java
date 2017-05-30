/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.common.exception;

import org.terasoluna.gfw.common.exception.BusinessException;
import org.terasoluna.gfw.common.message.ResultMessage;
import org.terasoluna.gfw.common.message.ResultMessages;

/**
 * 共通業務例外クラス。
 * 
 * @author NTT 電電太郎
 */
public class AtrsBusinessException extends BusinessException {

    /**
     * serialVersionUID。
     */
    private static final long serialVersionUID = -2040908618794475089L;

    /**
     * コンストラクタ。
     * 
     * @param errorCode エラーコード
     * @param args 置き換え文字列
     */
    public AtrsBusinessException(AtrsErrorCode errorCode, Object... args) {
        super(ResultMessages.danger().add(ResultMessage.fromCode(errorCode.code(), args)));
    }

}
