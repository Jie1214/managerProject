package com.caj.controller;

import com.caj.server.FileUploadServer;
import com.caj.utils.AssertUtil;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by Jie on 2019/3/1.
 *
 * @AUTHOR JIE
 * @date 2019/3/1
 */
@RestController
@RequestMapping("file_upload")
public class FileController {

    @Value("${upload.img-path}")
    private String imgPath;

    private Logger logger = LoggerFactory.getLogger(FileUploadServer.class);

    /**
     * 基于用户标识的头像上传
     * @param file 图片
     * @return
     */
    @PostMapping(value = "/image_upload.json", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String fileUpload(HttpServletRequest request, @RequestParam("file") MultipartFile file) {
        AssertUtil.isTrue(file.isEmpty(), "上传失败，请选择要上传的图片!");
        try {
            int length = file.getBytes().length;
            logger.info("file.length:{}", length);
            AssertUtil.isTrue(length > 5 * 1024 * 1024, "文件过大!");
        } catch (IOException e) {
            AssertUtil.isTrue(true, "文件长度有误");
        }
        logger.info("file.getContentType:{}", file.getContentType());
        AssertUtil.isTrue(!file.getContentType().contains("image"), "上传的文件不是图片类型，请重新上传!");
        String imageUrl = "";
        try {
            String temp = "image/upload/";
            logger.info("temp:{}", temp);
            // 获取图片的文件名
            String fileName = file.getOriginalFilename();
            logger.info("获取图片的文件名 fileName:{}", fileName);
            // 获取图片的扩展名
            String extensionName = StringUtils.substringAfter(fileName, ".");
            logger.info("获取图片的扩展名 extensionName:{}", extensionName);
            // 新的图片文件名 = 获取时间戳+"."图片扩展名
            String newFileName = String.valueOf(System.currentTimeMillis()) + "." + extensionName;
            // 数据库保存的目录
            // 文件路径
            String filePath = imgPath + temp;
            logger.info("文件路径 filePath:{}", filePath);
            File dest = new File(filePath, newFileName);
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();
            }
            // 将反斜杠转换为正斜杠
            imageUrl = temp + newFileName;
            logger.info("返回前端的url:{}", imageUrl);
            // 上传到指定目录
            file.transferTo(dest);
        } catch (IOException e) {
            AssertUtil.isTrue(true, "上传失败");
        }
        return imageUrl;
    }
}
