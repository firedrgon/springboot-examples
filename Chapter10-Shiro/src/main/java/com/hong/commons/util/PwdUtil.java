package com.hong.commons.util;

import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * Created by hong on 2017/5/6.
 * 密码md5加密
 */
public class PwdUtil {

    public static SimpleHash createMD5(String password,String salt){
        String hashAlgorithmName ="MD5";
        Object credentials =password;
        int hashIterations=1024;
        return new SimpleHash(hashAlgorithmName, credentials, salt, hashIterations);
    }
}
