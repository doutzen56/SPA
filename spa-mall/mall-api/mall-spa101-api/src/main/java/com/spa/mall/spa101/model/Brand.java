package com.spa.mall.spa101.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.List;

/**
 * @Author: doutzen@163.com
 * @Date: 2021/4/21 18:00
 * @Description:Spring Cloud Alibaba 商城
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//MyBatisPlus表映射注解
@TableName(value = "brand")
public class Brand implements Serializable {
    //    品牌ID
    //    MyBatisPlus主键策略注解
    @TableId(type= IdType.AUTO)
    private Integer id;
    //    品牌名字
    private String name;
    //    品牌图片
    private String image;
    //    品牌首字母
    private String initial;
    //    品牌排序
    private Integer sort;

    //分类
    @TableField(exist = false)
    private List<Category> categories;
}
