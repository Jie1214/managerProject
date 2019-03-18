package com.caj.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * 文件上传的工具类
 *
 * @ClassName FileUtils
 * @Author jie
 */
public class FileUtils {

    private static Logger logger = LoggerFactory.getLogger(FileUtils.class);

    /**
     * <p>写文件</p>
     * @param path
     * @param fileName
     * @param src
     */
    public static void write(String path, String fileName, byte[] src){
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(new File(path, fileName), true);
            fos.write(src);
        }catch(FileNotFoundException e){
            logger.error("文件不存在");
        }catch(IOException e){
            logger.error("写文件失败");
        } finally {
            if (fos != null) {
                try {
                    fos.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /**
     * <p>字节数组转为字符串</p>
     * @param bytes
     */
    public static String bytesToStr(byte[] bytes){
        String data = "";
        try {
            data = new String(bytes, "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return data;
    }

    /**
     * <p>字节数组转为字符串</p>
     * @param string
     */
    public static byte[] strToBytes(String string){
        byte[] bytes = new byte[0];
        try {
            bytes = string.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return bytes;
    }

    public static String getFileName(File file){
        return file.getName();
    }

    /**
     * MultipartFile类型文件转File类型文件
     * @param muLtFile
     * @return
     * @throws Exception
     */
    public static File multipartFileToFile(MultipartFile muLtFile) throws Exception {
        // 获取文件名
        String fileName = muLtFile.getOriginalFilename();
        // 获取文件后缀
        String prefix=fileName.substring(fileName.lastIndexOf("."));
        // 用uuid作为文件名，防止生成的临时文件重复

        final File file = File.createTempFile(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()), prefix);
        // MultipartFile to File
        muLtFile.transferTo(file);
        return file;
    }

    /**
     * 创建文件时间文件夹
     * @param path
     * @return
     */
    public static String getJustNowTime(String path, String type) {
        // 创建日期对象
        Date date = new Date();
        // 格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String time = sdf.format(date.getTime());
        path += "/file/" + type;
        File file = new File(path, time);
        if (!file.exists() && !file.isDirectory()) {
            file.mkdirs();
        }
        path += "/" + time;
        return path;
    }

    /**
     * 删除 临时文件
     *
     * @param files
     */
    private static void deleteFile(File... files) {
        for (File file : files) {
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /**
     * 将文件转为byte[]
     * @param filePath 文件路径
     * @return
     */
    public static byte[] getBytes(String filePath){
        File file = new File(filePath);
        ByteArrayOutputStream out = null;
        try {
            FileInputStream in = new FileInputStream(file);
            out = new ByteArrayOutputStream();
            byte[] b = new byte[1024];
            int i = 0;
            while ((i = in.read(b)) != -1) {
                out.write(b, 0, b.length);
            }
            out.close();
            in.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        byte[] s = out.toByteArray();
        return s;

    }


//    /**
//     * bitmap转为base64
//     *
//     * @param bitmap
//     * @return
//     */
//    public static String bitmapToBase64(Bitmap bitmap) {
//
//        String result = null;
//        ByteArrayOutputStream baos = null;
//        try {
//            if (bitmap != null) {
//                baos = new ByteArrayOutputStream();
//                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos);
//
//                baos.flush();
//                baos.close();
//
//                byte[] bitmapBytes = baos.toByteArray();
//                result = Base64.encodeToString(bitmapBytes, Base64.DEFAULT);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (baos != null) {
//                    baos.flush();
//                    baos.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        return result;
//    }

    /**
     * Mapped File  way
     * MappedByteBuffer 可以在处理大文件时，提升性能
     * @param filename
     * @return
     * @throws IOException
     */
    public static byte[] toByteArray3(String filename)throws IOException{
        FileChannel fc = null;
        try{
            fc = new RandomAccessFile(filename,"r").getChannel();
            MappedByteBuffer byteBuffer = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size()).load();
            System.out.println(byteBuffer.isLoaded());
            byte[] result = new byte[(int)fc.size()];
            if (byteBuffer.remaining() > 0) {
                byteBuffer.get(result, 0, byteBuffer.remaining());
            }
            return result;
        }catch (IOException e) {
            e.printStackTrace();
            throw e;
        }finally{
            try{
                fc.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



    /**
     * 文件转化为字节数组
     *
     * @param file
     * @return
     */
    public static byte[] getBytesFromFile(File file) {
        byte[] ret = null;
        try {
            if (file == null) {
                // log.error("helper:the file is null!");
                return null;
            }
            FileInputStream in = new FileInputStream(file);
            ByteArrayOutputStream out = new ByteArrayOutputStream(4096);
            byte[] b = new byte[4096];
            int n;

//            Scanner sc = null;
//            try {
//                sc = new Scanner(in, "UTF-8");
//                while (sc.hasNextLine()) {
//                    String line = sc.nextLine();
//
//                }
//            }finally {
//                if (in != null) {
//                    try {
//                        in.close();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//                if (sc != null) {
//                    sc.close();
//                }
//            }
            while ((n = in.read(b)) != -1) {
                out.write(b, 0, n);
            }
            in.close();
            out.close();
            ret = out.toByteArray();
        } catch (IOException e) {
            logger.error("helper:get bytes from file process error!");
            e.printStackTrace();
        }
        return ret;
    }

    /**
     * 文件复制
     * @param soure
     * @param aim
     * @throws FileNotFoundException
     */
    public static void copyFile(File soure,File aim) throws FileNotFoundException {
        InputStream is=new FileInputStream(soure);
        OutputStream os=new FileOutputStream(aim);

        byte[] flush=new byte[1024];
        int len=0;
        try {
            while(-1!=(len=is.read(flush))) {
                os.write(flush, 0, len);
            }
            os.flush();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            try {
                os.close();
                is.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

    }





}
