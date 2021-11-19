package com.iyongye.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 功能描述：用于标记匿名访问方法
 *
 * @author wangbencheng
 * @version 1.0
 * @claaName AnonymousAccess
 * @since 2021/3/17 下午2:57
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnonymousAccess {


}
