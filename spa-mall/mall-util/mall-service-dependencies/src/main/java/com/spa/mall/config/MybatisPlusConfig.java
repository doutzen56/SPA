package com.spa.mall.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;

/**
 * @Author: doutzen@163.com
 * @Date: 2021/4/23 17:02
 * @Description:Spring Cloud Alibaba 商城
 */
public class MybatisPlusConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}
