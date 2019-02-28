package com.czj.FileLearn;

import java.io.File;

/**
 * Created by Jie on 2019/2/13.
 *
 * @AUTHOR JIE
 * @date 2019/2/13
 */
public class CountFile {

    /**
     * 统计文件大小使用
     */
    private long len;
    /**
     * 文件路径
     */
    private String path;
    /**
     * 文件个数
     */
    private int fileNum;
    /**
     * 文件夹个数
     */
    private int dirNum;
    /**
     * 构建源文件
     */
    private File src;

    public CountFile(String path) {
        this.path = path;
        this.src = new File(path);
        countFileSize(this.src);
    }

    /**
     * 统计数量
     */
    private void countFileSize(File file) {
        if (null != file && file.exists()) {
            if (file.isFile()) {
                len += file.length();
                // 如果是文件这个数量加一
                this.fileNum++;
            } else {
                // 如果是文件夹这个数量加一
                this.dirNum++;
                for (File f : file.listFiles()) {
                    countFileSize(f);
                }
            }
        }
    }

    /**
     * 获取大小使用
     *
     * @return
     */
    public Long getLen() {
        return len;
    }

    /**
     * 获取文件数量大小
     *
     * @return
     */
    public int getFileNum() {
        return fileNum;
    }

    /**
     * 获取文件夹数量大小
     *
     * @return
     */
    public int getDirNum() {
        return dirNum;
    }

    public static void main(String[] args) {
        CountFile dir = new CountFile("/Users/caozhengjie/Downloads/test");
        CountFile dir1 = new CountFile("/Users/caozhengjie/Downloads/迅雷下载");
        System.out.println("文件大小-->"+dir.getLen()+"\n文件数量-->"+dir.getFileNum()+"\n文件夹数量-->"+dir.getDirNum());
        System.out.println("文件大小-->"+dir1.getLen()+"\n文件数量-->"+dir1.getFileNum()+"\n文件夹数量-->"+dir1.getDirNum());
    }

}
