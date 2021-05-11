package com.spa.mall.spa101.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: doutzen@163.com
 * @Date: 2021/4/21 18:00
 * @Description:Spring Cloud Alibaba 商城
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//MyBatisPlus表映射注解
@TableName(value = "category_brand")
public class CategoryBrand {

    @TableField
    private Integer categoryId;

    @TableField
    private Integer brandId;
}
