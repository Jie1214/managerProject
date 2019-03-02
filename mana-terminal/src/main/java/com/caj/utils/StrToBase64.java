package com.caj.utils;

//import org.apache.commons.codec.binary.Base64;
import org.apache.tomcat.util.codec.binary.Base64;

public class StrToBase64 {


    /**
     * userID解密
     * @param encodedID 加密后的用户id
     * @return
     */
	public static String decoderID(String encodedID)  {
		if (StringUtils.isBlank(encodedID)) {
			return null;
		}
		try {
			String reversedString = new StringBuffer(encodedID).reverse().toString();
			String base64String = reversedString.replaceAll("#", "=");
			int userIDPos = base64String.indexOf("==") + 6;
			String realBase64UserID = base64String.substring(userIDPos);
			String base64Encoded = new String(Base64.decodeBase64(realBase64UserID.getBytes("UTF-8")),"UTF-8");
			return base64Encoded;
		} catch (Exception e) {
			return null;
		}
	}

    /**
     * 用户id加密
     * @param decodeId 用户id
     * @return
     */
	public static String encoderID(String decodeId){
		String base64UserIDEncoded = new String(Base64.encodeBase64(decodeId.getBytes()));
		String currentStringBase64Encoded = new String(Base64.encodeBase64((System.currentTimeMillis() + "").getBytes()));
		String keyString = currentStringBase64Encoded  
				+ currentStringBase64Encoded.substring(4, 8) + base64UserIDEncoded;
		byte[] codeBytes = keyString.getBytes();
		byte[] ordedBytes = new byte[codeBytes.length];
		for(int i=0; i<codeBytes.length; i++){
			ordedBytes[i] = codeBytes[codeBytes.length-i-1];
		}
		return new String(ordedBytes).replaceAll("=", "#");
	}

	public static void main(String[] args) {
		System.out.println(StrToBase64.decoderID("#MGZlNDezdnM4ADN##QN3UDM0kDM4ADN0UTM"));
		System.out.println(StrToBase64.decoderID("2UDNzITMwczN##ANwQTMwQzNwczN0UTM"));
		System.out.println(StrToBase64.decoderID("##ANyIDM##gMzgTO1ATMyIDM1UTM"));
		System.out.println(StrToBase64.encoderID("4"));
	}

}
