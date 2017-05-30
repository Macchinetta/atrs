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
import javax.validation.OverridesAttribute;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Size;

/**
 * 指定サイズチェックアノテーション
 * 
 * @author NTT 電電太郎
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
@Retention(RUNTIME)
@Constraint(validatedBy = {})
@Documented
// 0はダミー。内部で置き換える
@Size(min = 0, max = 0)
@ReportAsSingleViolation
public @interface FixedLength {

    String message() default "{jp.co.ntt.atrs.domain.common.validate.FixedLength.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @OverridesAttribute.List({
            @OverridesAttribute(constraint = Size.class, name = "min"),
            @OverridesAttribute(constraint = Size.class, name = "max")
    })
    int value();

    /**
     * 複数設定用リスト
     */
    @Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER })
    @Retention(RUNTIME)
    @Documented
    @interface List {
        FixedLength[] value();
    }

}
