package com.kenfo.aopguide.security;

/**
 * @author kenfo
 * @version V1.0
 * @Package com.kenfo.aopguide.security
 * @Description: 模拟用户登陆状态
 * @date 2018/3/9 下午10:29
 */
public class CurrentSetHolder {

    private static final ThreadLocal<String> holder = new ThreadLocal<>();

    public static String get(){
        return holder.get() == null ? "unknown" : holder.get();
    }

    public static void set(String user){
        holder.set(user);
    }
}
