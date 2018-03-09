package com.kenfo.aopguide.service;

import com.kenfo.aopguide.domain.Product;
import com.kenfo.aopguide.security.CurrentSetHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author kenfo
 * @version V1.0
 * @Package com.kenfo.aopguide.service
 * @Description: TODO
 * @date 2018/3/9 下午10:41
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {

    @Autowired
    ProductService productService;

    @Test(expected = Exception.class)
    public void annoInserTest(){
        CurrentSetHolder.set("tom");
        Product p = new Product();
        productService.insert(p);
    }

    @Test
    public void adminInserTest(){
        CurrentSetHolder.set("admin");
        Product p = new Product();
        productService.insert(p);
    }

    @Test(expected = Exception.class)
    public void annoDeleteTest(){
        CurrentSetHolder.set("tom");
        productService.delete(1L);
    }

    @Test
    public void adminDeleteTest(){
        CurrentSetHolder.set("admin");
        productService.delete(1L);
    }
}