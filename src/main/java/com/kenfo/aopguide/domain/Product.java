package com.kenfo.aopguide.domain;

/**
 * @author kenfo
 * @version V1.0
 * @Package com.kenfo.aopguide.domain
 * @Description: 测试实例
 * @date 2018/3/9 下午10:28
 */
public class Product {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
