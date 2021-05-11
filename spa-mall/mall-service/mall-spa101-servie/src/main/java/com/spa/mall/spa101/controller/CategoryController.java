package com.spa.mall.spa101.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.spa.mall.spa101.model.Category;
import com.spa.mall.spa101.service.CategoryService;
import com.spa.mall.util.RespResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 商品类目(Category)表控制层
 *
 * @Author: doutzen@163.com
 * @Date: 2021/4/21 18:00
 * @Description:Spring Cloud Alibaba 商城
 */
@RestController
@RequestMapping("/category")
public class CategoryController extends ApiController {
    /**
     * 服务对象
     */
    @Autowired
    private CategoryService categoryService;

    /**
     * 分类查询
     * */
    @GetMapping("/parent/{id}")
    public RespResult<List<Category>> findByParentId(@PathVariable("id") Integer id){
        return RespResult.ok(categoryService.findByParentId(id));
    }

}
