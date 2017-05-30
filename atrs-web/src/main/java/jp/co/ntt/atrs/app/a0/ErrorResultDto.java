/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.app.a0;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * エラー情報DTOクラス。
 * 
 * @author NTT 電電太郎
 */
public class ErrorResultDto implements Serializable {

    /**
     * serialVersionUID。
     */
    private static final long serialVersionUID = 5765200265354207181L;

    /**
     * メッセージリスト。
     */
    private List<String> messages = new ArrayList<>();

    /**
     * メッセージリストを取得する。
     * 
     * @return 処理結果
     */
    public List<String> getMessages() {
        return messages;
    }

    /**
     * メッセージを追加する。
     * 
     * @param message メッセージ
     */
    public void add(String message) {
        this.messages.add(message);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
