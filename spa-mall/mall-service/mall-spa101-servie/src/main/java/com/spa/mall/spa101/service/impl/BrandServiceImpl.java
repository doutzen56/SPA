package com.spa.mall.spa101.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spa.mall.spa101.model.Brand;
import com.spa.mall.spa101.dao.BrandDao;
import com.spa.mall.spa101.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: doutzen@163.com
 * @Date: 2021/4/23 12:28
 * @Description:Spring Cloud Alibaba 商城
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandDao, Brand> implements BrandService {
    @Autowired
    BrandDao brandDao;
    /**
     * 条件查询
     * return List<GameType>
     * */
    @Override
    public List<Brand> queryList(Brand brand) {
        //条件包装对象
        QueryWrapper<Brand> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("name", brand.getName());
        queryWrapper.eq("initial", brand.getInitial());
        return brandDao.selectList(queryWrapper);
    }

    /**
     * 分页查询
     * @param brand
     * @param currentPage
     * @param pageSize
     * @return
     */
    @Override
    public Page<Brand> queryListPage(Brand brand, Long currentPage, Long pageSize) {
        QueryWrapper<Brand> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("name", brand.getName());
        return brandDao.selectPage(new Page<Brand>(currentPage,pageSize),queryWrapper);
    }

    /**
     * 根据分类ID查询品牌集合
     * @param id 分类ID
     * @return 品牌集合
     */
    @Override
    public List<Brand> queryByCategory(Integer id) {
        //1.根据分类id查询品牌ID集合
        List<Integer> brandIds = brandDao.queryBrandIds(id);
        //2.分局品牌ID集合查询品牌集合
        if(brandIds!=null&&brandIds.size()>0){
            return brandDao.selectList(new QueryWrapper<Brand>().in("id",brandIds));
        }
        return null;
    }
}
