package com.spa.mall.spa101.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.spa.mall.spa101.gameType.model.GameType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @Author: doutzen@163.com
 * @Date: 2021/4/21 18:00
 * @Description:Spring Cloud Alibaba 商城
 */
@Mapper
public interface GameTypeDao extends BaseMapper<GameType> {
}
