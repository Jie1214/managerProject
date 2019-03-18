package com.czj.utils;


import java.math.BigDecimal;

public class StringUtils {
	
	/**
	 * 编号升序001 -->002
	 * @param number
	 * @return
	 */
	public static String toChangeStr(String number){
		//001 -->002
		String tem = String.valueOf(Integer.parseInt(number)+1);
		//判断长度，进行填充补充
		if(tem.length()==1){
			tem = "00"+tem;
		}else if(tem.length()==2){
			tem = "0"+tem;
		}
		return tem;
		
	}
	
	
	//判断金额非空，并且不为0
	public static Boolean isNotBlankAndNotZero(Object str){
		if(isNotBlank(str)&& ((BigDecimal) str).compareTo(new BigDecimal("0")) != 0){
			return true;
		}
		return false;
	}
	

	public static Boolean isNotBlank(Object str){
		if(!"".equals(str)&&null!=str){
			return true;
		}
		return false;
	}
	
	public static Boolean isBlank(Object str){
		if(!isNotBlank(str)){
			return true;
		}
		return false;
	}
	
	public static Boolean isEqualZero(BigDecimal b){
		if(StringUtils.isBlank(b)||b.compareTo(new BigDecimal("0")) == 0){
			return true;
		}
		return false;
	}
	
	public static int compareTo(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int lim = Math.min(len1, len2);
        char[] charS1 = s1.toCharArray();
        char[] charS2 = s2.toCharArray();
        int k = 0;
        while (k < lim) {
            char c1 = charS1[k];
            char c2 = charS2[k];
            if (c1 != c2)
                return c1 - c2;
            k++;
        }
        return len1 - len2;
    }
	
	/**
	 * 字符串数字取相反数
	 * @return
	 */
	public static String getOppositeNum(String num){
		Integer j = 0-Integer.parseInt(num);
		return String.valueOf(j);
		
	}


	public static void main(String[] args) {
//		System.out.println(StringUtil.compareTo("1002", "1001001001"));
//		System.out.println("1001".compareTo("1002"));
		BigDecimal a = new BigDecimal("10");
		BigDecimal b = new BigDecimal("0");
//		BigDecimal c = new BigDecimal("1");
		System.err.println(b.divide(a));
	}
}
