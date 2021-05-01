package com.spa.mall.spa101.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spa.mall.spa101.gameType.model.GameType;
import com.spa.mall.spa101.dao.GameTypeDao;
import com.spa.mall.spa101.service.GameTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: doutzen@163.com
 * @Date: 2021/4/23 12:28
 * @Description:Spring Cloud Alibaba 商城
 */
@Service
public class GameTypeServiceImpl extends ServiceImpl<GameTypeDao, GameType> implements GameTypeService {
    @Autowired
    GameTypeDao gameTypeDao;
    /**
     * 条件查询
     * return List<GameType>
     * */
    @Override
    public List<GameType> queryList(GameType gameType) {
        //条件包装对象
        QueryWrapper<GameType> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("name",gameType.getName());
        queryWrapper.eq("initial",gameType.getInitial());
        return gameTypeDao.selectList(queryWrapper);
    }

    /**
     * 分页查询
     * return Page<GameType>
     * */
    @Override
    public Page<GameType> queryListPage(GameType gameType, Long currentPage, Long pageSize) {
        QueryWrapper<GameType> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("name",gameType.getName());
        return gameTypeDao.selectPage(new Page<GameType>(currentPage,pageSize),queryWrapper);
    }
}
