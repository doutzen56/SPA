package com.spa.mall.spa101.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: doutzen@163.com
 * @Date: 2021/4/21 18:00
 * @Description:Spring Cloud Alibaba 商城
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    // Spu
    private Spu spu;
    // Sku
    private List<Sku> skus;
}
