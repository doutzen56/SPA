package com.spa.mall.spa101.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.spa.mall.spa101.gameType.model.GameType;

import java.util.List;

/**
 * @Author: doutzen@163.com
 * @Date: 2021/4/23 12:27
 * @Description:Spring Cloud Alibaba 商城
 */
public interface GameTypeService extends IService<GameType> {
    /**
     * 条件查询
     * return List<GameType>
     * */
    List<GameType> queryList(GameType gameType);
    /**
     * 分页查询
     * return List<GameType>
     * */
    Page<GameType> queryListPage(GameType gameType,Long currentPage,Long pageSize);
}
