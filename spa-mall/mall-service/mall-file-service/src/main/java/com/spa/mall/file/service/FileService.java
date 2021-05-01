package com.spa.mall.file.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author: doutzen@163.com
 * @Date: 2021/4/30 16:36
 * @Description:Spring Cloud Alibaba 商城
 */
public interface FileService {
    String saveFile(MultipartFile file);
    boolean loadFile(String fileName, HttpServletResponse response) throws IOException;
}
