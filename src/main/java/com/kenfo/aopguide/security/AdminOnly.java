package com.kenfo.aopguide.security;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author kenfo
 * @version V1.0
 * @Package com.kenfo.aopguide.security
 * @Description: AdminOnly注解
 * @date 2018/3/9 下午11:06
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AdminOnly {
}
