package com.caj.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * @ClassName FileUtils
 * @Author lee
 * @Time 2019/1/16 20:47.
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

}
