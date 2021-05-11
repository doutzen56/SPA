package com.spa.mall.spa101.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.spa.mall.spa101.model.Brand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: doutzen@163.com
 * @Date: 2021/4/21 18:00
 * @Description:Spring Cloud Alibaba 商城
 */
//@Mapper
public interface BrandDao extends BaseMapper<Brand> {
    /**
     * 根据分类ID查询对应品牌ID集合
     * */
    @Select("SELECT brand_id FROM category_brand WHERE category_id=#{id}")
    List<Integer> queryBrandIds(Integer id);
}
