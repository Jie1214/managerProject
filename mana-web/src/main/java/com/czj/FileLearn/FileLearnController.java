package com.czj.FileLearn;

import com.alibaba.fastjson.JSON;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jie on 2019/2/13.
 *
 * @AUTHOR JIE
 * @date 2019/2/13
 */
public class FileLearnController {

    /**
     * 打印某一目录下的文件名
     *
     * @param file
     * @param deep
     */
    public static void resultFileName(File file, int deep) {
        for (int i = 0; i <= deep; i++) {
            System.out.print(" ");
        }
        System.out.println(file.getName());
        if (null == file || !file.exists()) {
            return;
        } else if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                resultFileName(f, deep + 1);
            }
        }
    }

    /**
     * 统计文件夹的大小
     * @param file
     */
    private static Long len = 0L;
    public static void countFile(File file) {
        if (file != null && file.exists()) {
            if (file.isFile()) {
                len += file.length();
            } else {
                for (File f : file.listFiles()) {
                    countFile(f);
                }
            }
        }
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String path = "/Users/caozhengjie/Downloads/test";
        File file = new File(path);
//        resultFileName(file, 0);
        countFile(file);
        System.out.print(len);

//        String url = "/author/login.json";
//        String url = "/location/precise_locations.json";
//        String str = "{\"name\":\"zlzk\",\"password\":\"123456\"}";
//        String str = "{\"trackTime\":\"2018-12-19\",\"vehicleId\":\"90000000032\"}";
//        String header = "0LT=SvU#a18zMMb9VbFMMJS9Wg4Suom6AkPxygb1HtdS#vHUKug=";
//        HttpUtils.post(url, str, header);

//        打印当前项目路径
//        System.out.print(System.getProperty("user.dir"));
//        System.out.print("\n");


//        recursive(file);


        // 展示下一级
//        String[] fileArray = file.list();
//        for (String s : fileArray) {
//            System.out.print(s + " ");
//        }

//        File[] files = file.listFiles();
//        for(File dir:files){
//
//        }


//        try {
//            // 创建新文件
//            file.createNewFile();
//        } catch (IOException e) {
//            throw new ParamException("请检查目录的正确性");
//        }

        // 创建文件夹
//        boolean b = file.mkdir();
//        if(b){
//            System.out.print("创建成功");
//        } else {
//            System.out.print("创建失败");
//        }


//        System.out.print(file.getAbsolutePath());
//        System.out.print("\n");
//        System.out.print(file.getName());
//        System.out.print(file.getAbsoluteFile());

        //TOU I 文件基本判断
//        if(null == file || !file.exists()){
//            // 文件不存在
//            System.out.print("文件不存在");
//        } else {
//            // 文件存在
//            System.out.print("文件存在");
//            if(file.isFile()){
//                // 是文件
//                System.out.print("文件操作");
//            } else {
//                // 是文件夹
//                System.out.print("目录操作");
//            }
//        }


//
//        System.out.print("\n");
//        String s="好好学习ABC";
//
//        //这是把字符串转换成字符数组，转换成的字节序列用的是项目默认的编码（这里为UTF-8）
//        byte[] bytes1=s.getBytes();
//        for (byte b : bytes1) {
//            //把字节（转换成了int）以16进制的方式显示
//            //& 0xff是为了把前面的24个0去掉只留下后八位
//            System.out.print(Integer.toHexString(b & 0xff)+" ");
//        }
//        System.out.println();
//        /*utf-8编码中中文占用3个字节，英文占用1个字节*/
//        //这里会有异常展示，我们就throw这个异常
//        byte[] bytes2 = s.getBytes("utf-8");
//        for (byte b : bytes2) {
//            System.out.print(Integer.toHexString(b & 0xff)+" ");
//        }
//        System.out.println();
//        /*gbk编码中文占用2个字节，英文占用1个字节*/
//        //这里会有异常展示，我们就throw这个异常
//        byte[] bytes3 = s.getBytes("gbk");
//        for (byte b : bytes3) {
//            System.out.print(Integer.toHexString(b & 0xff)+" ");
//        }
//
//        System.out.println();
//        /*utf-16be编码中文占用2个字节，英文占用2个字节*/
//        //这里会有异常展示，我们就throw这个异常
//        byte[] bytes4 = s.getBytes("utf-16be");
//        for (byte b : bytes4) {
//            System.out.print(Integer.toHexString(b & 0xff)+" ");
//        }
//
//        System.out.println();
//        /*当你的字节序列是某种编码时，这个时候想把字节序列变成字符串，也需要用这种编码方式，否则会出现乱码*/
//        //这时会使用项目默认的编码来转换，可能出现乱码
//        String str1=new String(bytes4);
//        System.out.println(str1);
//        //要使用字节序列的编码来进行转换
//        String str2=new String(bytes4,"utf-16be");
//        System.out.println(str2);
    }

    public static void recursive(File file) {
        System.out.println("开始");
        Map<String, Integer> fileMap = new HashMap<String, Integer>();
        // 获取文件下一级
        File[] files = file.listFiles();
        // 记录文件夹的数量
        int j = 0;

        for (File f : files) {
            if (f.isFile()) {
                // 获取文件扩展名
                String fileName = f.getName();
                String fileType = fileName.substring(fileName.lastIndexOf("."), fileName.length());
                // 记录文件总数
                int i = 0;
                // 将名字放入map中
                if (null == fileMap || fileMap.size() < 1) {
                    fileMap.put(fileType, ++i);
                } else {
                    // map 不是空的现遍历将拥有同样的扩展名的加一
                    for (Map.Entry<String, Integer> entry : fileMap.entrySet()) {
                        // 判断这个扩展名是否已经存在
                        if (entry.getKey().equals(fileType)) {
                            // 存在将数字加一
                            Integer i1 = entry.getValue();
                            i1++;
                            fileMap.remove(fileType);
                            fileMap.put(fileType, i1);
                        } else {
                            // 不存在新put
                            fileMap.put(fileType, ++i);
                            break;
                        }
                    }
                }
            }
//            else {
//                folder
//                fileMap.put("文件夹",++j);
//                continue;
//            }
        }
        System.out.println(JSON.toJSONString(fileMap));
        System.out.print("结束");
    }

    public void convenientMap(Map<Object, Object> map) {
        // 第三种：推荐，尤其是容量大时
        /*
         * Map.entry<Integer,String> 映射项（键-值对）  有几个方法：用上面的名字entry
         * entry.getKey() ;entry.getValue(); entry.setValue();
         * map.entrySet()  返回此映射中包含的映射关系的 Set视图。
         */

        System.out.println("第三种：通过Map.entrySet遍历key和value");
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
    }
}
