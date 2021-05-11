package com.spa.mall.spa101.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.spa.mall.spa101.dao.SkuAttributeDao;
import com.spa.mall.spa101.model.SkuAttribute;
import com.spa.mall.spa101.service.SkuAttributeService;
import org.springframework.stereotype.Service;

/**
 * (SkuAttribute)表服务实现类
 *
 * @Author: doutzen@163.com
 * @Date: 2021/4/21 18:00
 * @Description:Spring Cloud Alibaba 商城
 */
@Service("skuAttributeService")
public class SkuAttributeServiceImpl extends ServiceImpl<SkuAttributeDao, SkuAttribute> implements SkuAttributeService {

}
