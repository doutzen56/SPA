package com.spa.mall.spa101.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.spa.mall.spa101.model.Category;

import java.util.List;

/**
 * 商品类目(Category)表服务接口
 *
 * @Author: doutzen@163.com
 * @Date: 2021/4/21 18:00
 * @Description:Spring Cloud Alibaba 商城
 */
public interface CategoryService extends IService<Category> {
    List<Category> findByParentId(Integer pid);

}
