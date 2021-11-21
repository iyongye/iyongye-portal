package com.iyongye.mybatis.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 功能描述：封装的查询注解
 *
 * @author wangbencheng
 * @version 1.0
 * @claaName QueryPlus
 * @since 2021/3/17 下午2:03
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface QueryPlus {

    // 基本对象的属性名
    String propName() default "";

    // 查询方式
    Type type() default Type.EQUAL;

    /**
     * 多字段模糊搜索，仅支持String类型字段，多个用逗号隔开, 如@QueryPlus(blurry = "email,username")
     */
    String blurry() default "";

    /**
     * 按照传入字段进行升序 多个用逗号隔开, 如@QueryPlus(asc = "email,username")
     * @return
     */
    String asc() default "";

    /**
     * 按照传入字段倒序 多个用逗号隔开, 如@QueryPlus(desc = "email,username")
     * @return
     */
    String desc() default "";

    enum Type {
        // jie 2019/6/4 相等
        EQUAL
        // 大于等于
        , GREATER_THAN
        // 小于等于
        , LESS_THAN
        // 中模糊查询
        , INNER_LIKE
        // 左模糊查询
        , LEFT_LIKE
        // 右模糊查询
        , RIGHT_LIKE
        // 小于
        , LESS_THAN_NQ
        // 包含
        , IN
        // 不等于
        , NOT_EQUAL
        // between
        , BETWEEN
        // 不为空
        , NOT_NULL
        // 查询时间
        , UNIX_TIMESTAMP
    }
}
