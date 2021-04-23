package com.spa.mall.spa101.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spa.mall.spa101.gameType.model.GameType;
import com.spa.mall.spa101.dao.GameTypeDao;
import com.spa.mall.spa101.service.GameTypeService;
import org.springframework.stereotype.Service;

/**
 * @Author: doutzen@163.com
 * @Date: 2021/4/23 12:28
 * @Description:Spring Cloud Alibaba 商城
 */
@Service
public class GameTypeServiceImpl extends ServiceImpl<GameTypeDao, GameType> implements GameTypeService {
}
