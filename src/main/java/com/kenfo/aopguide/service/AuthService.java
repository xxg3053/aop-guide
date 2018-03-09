package com.kenfo.aopguide.service;

import com.kenfo.aopguide.security.CurrentSetHolder;
import org.springframework.stereotype.Component;

/**
 * @author kenfo
 * @version V1.0
 * @Package com.kenfo.aopguide.service
 * @Description: 传统的校验方式
 * @date 2018/3/9 下午10:36
 */
@Component
public class AuthService {

    public void checkAccess(){
        String user = CurrentSetHolder.get();
        if(!"admin".equals(user)){
            throw new RuntimeException("operation not allow");
        }
    }
}
