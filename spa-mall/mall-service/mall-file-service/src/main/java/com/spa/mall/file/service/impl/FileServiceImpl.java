package com.spa.mall.file.service.impl;

import com.spa.mall.file.property.FileProperties;
import com.spa.mall.file.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * @Author: doutzen@163.com
 * @Date: 2021/4/30 16:40
 * @Description:Spring Cloud Alibaba 商城
 */
@Service
public class FileServiceImpl implements FileService {
    // 文件在本地存储的地址
    private final Path fileLocation;

    @Autowired
    public FileServiceImpl(FileProperties fileProperties) {
        fileLocation = Paths.get(fileProperties.getUploadPath()).toAbsolutePath().normalize();
        try {
            Files.createDirectories(this.fileLocation);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String saveFile(MultipartFile file) {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        Path targetLocation = this.fileLocation.resolve(fileName);
        try {
            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileName;
    }

    @Override
    public boolean loadFile(String fileName, HttpServletResponse response) throws IOException {
        Path filePath = this.fileLocation.resolve(fileName).normalize();
        File file=new File(filePath.toUri());
        FileInputStream fs=new FileInputStream(file);
        OutputStream os=response.getOutputStream();
        byte [] buffe = new byte[1024];
        int len =0;
        while ((len =fs.read(buffe))>0){
            os.write(buffe,0,len);
        }
        fs.close();
        os.flush();
        os.close();
        return true;
    }

}
