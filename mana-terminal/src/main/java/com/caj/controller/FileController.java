package com.caj.controller;

import com.caj.server.FileUploadServer;
import com.caj.utils.AssertUtil;
import com.caj.utils.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.List;
import java.util.Scanner;

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

    private final String path = "/Users/caozhengjie/Downloads/test/";

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
            AssertUtil.isTrue(length > 2 * 1024000000 , "文件过大!");
        } catch (IOException e) {
            AssertUtil.isTrue(true, "文件长度有误");
        }
        logger.info("file.getContentType:{}", file.getContentType());
//        AssertUtil.isTrue(!file.getContentType().contains("image"), "上传的文件不是图片类型，请重新上传!");
        String fileUrl = "";
        try {
            String temp = "file/upload/" + file.getContentType();
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
            fileUrl = temp + newFileName;
            logger.info("返回前端的url:{}", fileUrl);
            // 上传到指定目录
            file.transferTo(dest);
        } catch (IOException e) {
            AssertUtil.isTrue(true, "上传失败");
        }
        return fileUrl;
    }

//    /**
//     * 文件上传
//     * @param file 上传的文件
//     * @param path 上传的路径
//     */
//    public void fileUpload(File file, String path){
//        logger.info("上传的文件:{}", FileUtils.getFileName(file));
//    }


    /**
     * 访问路径为：http://ip:port/upload
     */
    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public String upload() {
        return "/fileupload";
    }

    /**
     * 访问路径为：http://ip:port/upload/batch
     */
    @RequestMapping(value = "/upload/batch", method = RequestMethod.GET)
    public String batchUpload() {
        return "/mutifileupload";
    }


    @RequestMapping(value = "/upload_file", method = RequestMethod.POST)
    @ResponseBody
    public void uploadFile(@RequestParam("file") MultipartFile file) {
        long fileSize = file.getSize();
        FileInputStream fileInputStream = null;
        BufferedOutputStream out = null;
        try {
            fileInputStream = (FileInputStream) file.getInputStream();
            // 上传文件路径
            String newPath = FileUtils.getJustNowTime(path, "upload");
            logger.info("File read successfully(文件读取成功)...");
            logger.info("文件大小是:{},文件名字是:{},上传路径是:{}", fileSize,file.getOriginalFilename(),newPath);
            out = new BufferedOutputStream(
                    new FileOutputStream(new File(newPath, file.getOriginalFilename())));
            byte[] byteArray = new byte[1024 * 1024];
            int len = 0;
            logger.info("start write file（开始写入文件）...");
            while ((len = fileInputStream.read(byteArray)) != -1) {
                out.write(byteArray, 0, len);
                if (len % (10 * byteArray.length) == 0) {
                    logger.info("已上传:{}%", len / fileSize);
                }
            }
            out.flush();
        } catch (IOException e) {
            logger.error("", e);
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            logger.info("File upload succeeded(文件上传成功)...");
        }
    }

    /**
     * 获取文件大小
     */
    public int getMultipartFileSize(FileInputStream fis) {
        int i = 0;
        Scanner sc = null;
        sc = new Scanner(fis, "UTF-8");
        while (sc.hasNextLine()) {
            i += sc.nextLine().length();
        }
        return i;
    }


    /**
     * 文件上传具体实现方法（单文件上传）
     *
     * @param file
     * @return
     * @author 单红宇(CSDN CATOOP)
     * @create 2017年3月11日
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                // 这里只是简单例子，文件直接输出到项目路径下。
                // 实际项目中，文件需要输出到指定位置，需要在增加代码处理。
                // file.getOriginalFilename()
                // 还有关于文件格式限制、文件大小限制，详见：中配置。
                String newPath = FileUtils.getJustNowTime(path, "upload");
                BufferedOutputStream out = new BufferedOutputStream(
                        new FileOutputStream(new File(newPath, file.getOriginalFilename())));
                out.write(file.getBytes());
                out.flush();
                out.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return "上传失败," + e.getMessage();
            } catch (IOException e) {
                e.printStackTrace();
                return "上传失败," + e.getMessage();
            }
            return "上传成功";
        } else {
            return "上传失败，因为文件是空的.";
        }
    }

    /**
     * 多文件上传 主要是使用了MultipartHttpServletRequest和MultipartFile
     *
     * @param request
     * @return
     * @author Jie
     */
    @RequestMapping(value = "/upload/batch", method = RequestMethod.POST)
    public @ResponseBody
    String batchUpload(HttpServletRequest request) {
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
        MultipartFile file = null;
        BufferedOutputStream stream = null;
        for (int i = 0; i < files.size(); ++i) {
            file = files.get(i);
            if (!file.isEmpty()) {
                try {
                    byte[] bytes = file.getBytes();
                    stream = new BufferedOutputStream(new FileOutputStream(new File(file.getOriginalFilename())));
                    stream.write(bytes);
                    stream.close();
                } catch (Exception e) {
                    stream = null;
                    return "You failed to upload " + i + " => " + e.getMessage();
                }
            } else {
                return "You failed to upload " + i + " because the file was empty.";
            }
        }
        return "upload successful";
    }


}
