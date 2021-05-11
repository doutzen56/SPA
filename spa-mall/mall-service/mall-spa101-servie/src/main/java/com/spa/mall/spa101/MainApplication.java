package com.spa.mall.spa101;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: doutzen@163.com
 * @Date: 2021/4/21 17:58
 * @Description:Spring Cloud Alibaba 商城
 */
@SpringBootApplication
//配置dao文件扫描路径,作用等价于@mapper
@MapperScan(basePackages = {"com.spa.mall.spa101.dao"})
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
