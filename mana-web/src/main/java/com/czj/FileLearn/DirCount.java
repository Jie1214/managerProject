package com.czj.FileLearn;

import java.io.File;

/**
 *  使用面向对象: 统计文件夹的大小
 * @author 裴新
 *
 */
public class DirCount {
	/**
	 * 	大小
	 */
	private long len;
	/**
	 * 文件夹路径
	 */
	private String path;
	/**
	 * 文件的个数
	 */
	private int fileSize;
	/**
	 * 文件夹的个数
	 */
	private int dirSize;
	/**
	 * 构建源文件
	 */
	private File src;
	public DirCount(String path) {
		this.path = path;
		this.src = new File(path);
		count(this.src);
	}

	/**
	 * 统计数量
	 */
	private  void count(File src) {
		//获取大小
		if(null!=src && src.exists()) {
			//大小
			if(src.isFile()) {
				len+=src.length();
				this.fileSize++;
			}else { //子孙级
				this.dirSize++;
				for(File s:src.listFiles()) {
						count(s);
				}
			}
		}
	}
	public long getLen() {
		return len;
	}

	public int getFileSize() {
		return fileSize;
	}

	public int getDirSize() {
		return dirSize;
	}
	
	public static void main(String[] args) {
		DirCount dir = new DirCount("/Users/caozhengjie/Downloads/test");
		System.out.println("文件大小-->"+dir.getLen()+" 文件数量-->"+dir.getFileSize()+" 文件夹数量-->"+dir.getDirSize());

	}	
}
