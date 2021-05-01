package com.spa.mall.spa101.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.spa.mall.spa101.gameType.model.GameType;
import com.spa.mall.spa101.service.GameTypeService;
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
@RequestMapping(value = "/gameType")
public class GameTypeController {
    @Autowired
    private GameTypeService gameTypeService;
    /**
     * 增加
     * */
    @PostMapping
    public RespResult add(@RequestBody GameType gameType){
        gameTypeService.save(gameType);
        return RespResult.ok();
    }

    /**
     * 修改
     * */
    @PutMapping
    public RespResult update(@RequestBody GameType gameType){
        gameTypeService.updateById(gameType);
        return RespResult.ok();
    }

    /**
     * 修改
     * */
    @DeleteMapping("/{id}")
    public RespResult update(@PathVariable(value = "id") String id){
        gameTypeService.removeById(id);
        return RespResult.ok();
    }

    /**
     * 条件查询
     * */
    @PostMapping("/search")
    public RespResult<List<GameType>> queryList(@RequestBody GameType gameType){
       List<GameType> result= gameTypeService.queryList(gameType);
        return RespResult.ok(result);
    }

    /**
     * 分页查询
     * */
    @PostMapping("/search/{page}/{size}")
    public RespResult<Page<GameType>> queryList(
            @RequestBody GameType gameType,
            @PathVariable(value = "page")Long page,
            @PathVariable(value ="size")Long size){
        Page<GameType> result= gameTypeService.queryListPage(gameType,page,size);
        return RespResult.ok(result);
    }
}
