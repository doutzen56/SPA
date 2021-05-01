package com.spa.mall.file.controller;

import com.spa.mall.file.service.FileService;
import com.spa.mall.util.RespResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: doutzen@163.com
 * @Date: 2021/4/30 16:29
 * @Description:Spring Cloud Alibaba 商城
 */
@RestController
@RequestMapping(value = "/file")
public class FileController {
    @Autowired
    private FileService fileService;
    /**
     * 文件上传
     * */
    @PostMapping(value = "/upload")
    public RespResult upload(@RequestParam("file") MultipartFile file){
       String rs= fileService.saveFile(file);
       return RespResult.ok(rs);
    }
    /**
     * 文件上传
     * */
    @GetMapping(value = "/download/{filename}")
    public RespResult download(@PathVariable String filename, HttpServletResponse response) throws IOException {
        return RespResult.ok(fileService.loadFile(filename,response));
    }
}
