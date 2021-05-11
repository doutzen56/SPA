package com.spa.mall.spa101.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.spa.mall.spa101.model.Brand;
import com.spa.mall.spa101.service.BrandService;
import com.spa.mall.util.RespResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: doutzen@163.com
 * @Date: 2021/4/23 13:30
 * @Description:Spring Cloud Alibaba 商城
 */
@RestController
@RequestMapping(value = "/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;
    /**
     * 增加
     * */
    @PostMapping
    public RespResult add(@RequestBody Brand brand){
        brandService.save(brand);
        return RespResult.ok();
    }

    /**
     * 修改
     * */
    @PutMapping
    public RespResult update(@RequestBody Brand brand){
        brandService.updateById(brand);
        return RespResult.ok();
    }

    /**
     * 修改
     * */
    @DeleteMapping("/{id}")
    public RespResult update(@PathVariable(value = "id") String id){
        brandService.removeById(id);
        return RespResult.ok();
    }

    /**
     * 条件查询
     * */
    @PostMapping("/search")
    public RespResult<List<Brand>> queryList(@RequestBody Brand brand){
       List<Brand> result= brandService.queryList(brand);
        return RespResult.ok(result);
    }

    /**
     * 分页查询
     * */
    @PostMapping("/search/{page}/{size}")
    public RespResult<Page<Brand>> queryList(
            @RequestBody Brand brand,
            @PathVariable(value = "page")Long page,
            @PathVariable(value ="size")Long size){
        Page<Brand> result= brandService.queryListPage(brand,page,size);
        return RespResult.ok(result);
    }

    /**
     * 根据分类ID查询品牌集合
     * */
    @GetMapping("/category/{pid}")
    public RespResult<List<Brand>> categoryBrands(@PathVariable("pid") Integer pid){
        List<Brand> brands = brandService.queryByCategory(pid);
        return  RespResult.ok(brands);
    }
}
