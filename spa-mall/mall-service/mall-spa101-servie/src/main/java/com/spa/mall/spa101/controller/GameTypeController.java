package com.spa.mall.spa101.controller;

import com.spa.mall.spa101.gameType.model.GameType;
import com.spa.mall.spa101.service.GameTypeService;
import com.spa.mall.spa101.util.RespResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
