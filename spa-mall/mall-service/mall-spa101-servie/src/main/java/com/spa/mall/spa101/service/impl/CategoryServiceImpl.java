package com.spa.mall.spa101.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spa.mall.spa101.dao.CategoryDao;
import com.spa.mall.spa101.model.Category;
import com.spa.mall.spa101.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品类目(Category)表服务实现类
 *
 * @Author: doutzen@163.com
 * @Date: 2021/4/21 18:00
 * @Description:Spring Cloud Alibaba 商城
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, Category> implements CategoryService {

    @Override
    public List<Category> findByParentId(Integer pid) {
        //条件封装对象
        QueryWrapper<Category> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("parent_id",pid);
        return super.baseMapper.selectList(queryWrapper);
    }
}
