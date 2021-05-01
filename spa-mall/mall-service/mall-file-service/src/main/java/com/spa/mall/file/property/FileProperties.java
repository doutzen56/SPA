package com.spa.mall.file.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: doutzen@163.com
 * @Date: 2021/4/30 16:26
 * @Description:Spring Cloud Alibaba 商城
 */
@Configuration
@ConfigurationProperties(prefix = "file")
public class FileProperties {
    public String getUploadPath() {
        return uploadPath;
    }

    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath;
    }

    private String uploadPath;
}
