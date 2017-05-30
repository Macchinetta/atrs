/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.app.common.exception;

import jp.co.ntt.atrs.domain.common.logging.LogMessages;

import org.springframework.validation.Errors;
import org.terasoluna.gfw.common.exception.ExceptionCodeProvider;

/**
 * 不正リクエスト例外。
 * 
 * @author NTT 電電太郎
 */
public class BadRequestException extends RuntimeException implements
    ExceptionCodeProvider {

    /**
     * serialVersionUID。
     */
    private static final long serialVersionUID = -6131511074347102729L;

    /**
     * コンストラクタ。
     * 
     * @param causeMessage エラーメッセージ
     */
    public BadRequestException(String causeMessage) {
        super(LogMessages.E_AR_A0_L9001.getMessage(causeMessage));
    }

    /**
     * コンストラクタ。
     * 
     * @param errors エラーオブジェクト
     */
    public BadRequestException(Errors errors) {
        super(LogMessages.E_AR_A0_L9001.getMessage(errors.toString()));
    }

    /**
     * コンストラクタ。
     * 
     * @param e 例外オブジェクト
     */
    public BadRequestException(Exception e) {
        super(LogMessages.E_AR_A0_L9001.getMessage(e.getMessage()), e);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getCode() {
        return LogMessages.E_AR_A0_L9001.getCode();
    }

}
