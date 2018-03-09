package com.kenfo.aopguide.service;

import com.kenfo.aopguide.domain.Product;
import com.kenfo.aopguide.security.AdminOnly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kenfo
 * @version V1.0
 * @Package com.kenfo.aopguide.service
 * @Description: 产品服务
 * insert 使用传统方式控制权限
 * delete 使用切面方式进行控制
 * @date 2018/3/9 下午10:28
 */
@Service
public class ProductService {

    @Autowired
    AuthService authService;

    public void insert(Product product){
        authService.checkAccess();//传统方式进行权限校验
        System.out.println("insert product");
    }


    @AdminOnly
    public void delete(Long id){
        System.out.println("delete product");
    }
}
