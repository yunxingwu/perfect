package com.star.perfect.common.annotation;

import java.lang.annotation.*;

/**
 * Created by  伍运星  on   2016/1/29.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface PhoneName {
    public String value() default "";
}
