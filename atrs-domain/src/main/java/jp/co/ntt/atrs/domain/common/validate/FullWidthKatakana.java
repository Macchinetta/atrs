/*
 * Copyright(c) 2015 NTT Corporation.
 */
package jp.co.ntt.atrs.domain.common.validate;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Pattern;

/**
 * 全角カタカナチェックアノテーション
 * 
 * @author NTT 電電太郎
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
@Constraint(validatedBy = {})
@Documented
@Pattern(regexp = "^[\\u30A0-\\u30FF]+$")
@ReportAsSingleViolation
public @interface FullWidthKatakana {

    String message() default "{jp.co.ntt.atrs.domain.common.validate.FullWidthKatakana.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    /**
     * 複数設定用リスト
     */
    @Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
    @Retention(RUNTIME)
    @Documented
    @interface List {
        FullWidthKatakana[] value();
    }
}
