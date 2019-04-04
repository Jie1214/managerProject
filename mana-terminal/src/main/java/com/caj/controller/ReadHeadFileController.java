package com.caj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;


import java.io.*;

/**
 * Created by Jie on 2019/4/2.
 *
 * @AUTHOR JIE
 * @date 2019/4/2
 */
public class ReadHeadFileController {


    private static Logger logger = LoggerFactory.getLogger(ReadHeadFileController.class);
    /**
     * 文件路径
     */
//    private static String newPath = "/Users/caozhengjie/Downloads/600G";
    private static String newPath = "/Users/caozhengjie/Downloads/test/xs";

    public static void WriteStringToFile2(String filePath, String endoceing, String str) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            OutputStreamWriter osw = new OutputStreamWriter(fos, endoceing);
            osw.write(str);
            osw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static void WriteStringToFile2(String filePath, String str) {
//        try {
//            FileWriter fw = new FileWriter(filePath, true);
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.append(str);
//            // 往已有的文件上添加字符串
////            bw.write("abc\r\n ");
////            bw.write("def\r\n ");
////            bw.write("hijk ");
//            bw.close();
//            fw.close();
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }

    public static String read(String path, String encoding) throws IOException {
        StringBuilder content = new StringBuilder();
        File file = new File(path);
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(file), encoding));
        String line = null;
        while ((line = reader.readLine()) != null) {
            content.append(line + "\n");
        }
        reader.close();
        return content.toString();
    }

    public static void main(String[] args) throws IOException {
        String content = "中文内容";
        String path = newPath + "/淫男乱女1925章作者笨蛋英子(www.jimixs.com).txt";
        String encoding = "gbk";
        String str = read(path, encoding);
        System.out.println(str);
        String newPathWrite = newPath + "/13559-1-qwe.txt";

        File file = new File(newPathWrite);
        if(file.exists()){
            file.createNewFile();
        }
        WriteStringToFile2(newPathWrite, "utf-8", str);
    }





    /**
     * 读取硬盘文件
     * @return
     */
//    public static void readFile() throws IOException {

//        // 旧文件
//        String fileStr = newPath + "/第二部分.txt";
//        // 新文件
//        String filePathStr = newPath + "ten.txt";
//
//        File file = new File(fileStr);
//
//        BufferedReader bufStr = codeReading(file, "GBK");
//        System.out.println(bufStr);



//        FileOutputStream fos = new FileOutputStream(fileStr);
//        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
//        osw.write(filePathStr);
//
//        FileInputStream fis = new FileInputStream(fileStr);
//        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
//        BufferedReader br = new BufferedReader(isr);
//        String line = null;
//        while ((line = br.readLine()) != null) {
//            filePathStr += line;
//            filePathStr += "\r\n"; // 补上换行符
//
//        }

//    }

//    /**
//     * 按照一定的编码方式进行读取文件
//     * @param file
//     */
//    private static BufferedReader codeReading(File file, String encoding) {
//        InputStream fis = null;
////        String line = null;
//        BufferedReader br = null;
//        try {
//            fis = new FileInputStream(file);
//            //最后的"GBK"根据文件属性而定，如果不行，改成"UTF-8"试试
//            InputStreamReader reader = new InputStreamReader(fis, encoding);
//            br = new BufferedReader(reader);
////            while ((line = br.readLine()) != null) {
////                line += line;
////            }
////            br.close();
//            reader.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (fis != null) {
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return br;
//    }


}
