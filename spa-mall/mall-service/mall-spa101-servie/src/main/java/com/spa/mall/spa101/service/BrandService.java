package com.spa.mall.spa101.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.spa.mall.spa101.model.Brand;

import java.util.List;

/**
 * @Author: doutzen@163.com
 * @Date: 2021/4/23 12:27
 * @Description:Spring Cloud Alibaba 商城
 */
public interface BrandService extends IService<Brand> {
    /**
     * 条件查询
     * return List<GameType>
     * */
    List<Brand> queryList(Brand brand);
    /**
     * 分页查询
     * return List<GameType>
     * */
    Page<Brand> queryListPage(Brand brand, Long currentPage, Long pageSize);

    /**
     * 根据分类ID查询品牌集合
     * @param id 分类ID
     * @return 品牌集合
     */
    List<Brand> queryByCategory(Integer id);
}
