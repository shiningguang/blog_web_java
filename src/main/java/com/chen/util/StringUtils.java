package com.chen.util;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Author ： chen
 * Date ： 16/9/3
 * Time : 下午4:40
 */
public class StringUtils {

    public static String randomString(){
        return RandomStringUtils.random(6);
    }
}
