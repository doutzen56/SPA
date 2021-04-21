package com.spa.mall.spa101;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: doutzen@163.com
 * @Date: 2021/4/21 17:45
 * @Description:Spring Cloud Alibaba 商城
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "platform")
public class Paltform {
    @TableId(type = IdType.AUTO,value = "id")
    private Integer id;
    private String name;
    private String image;
    private String initial;
    private Integer sort;
}
