package com.czj.decode;

//import com.youbang.terminal.pojo.Record2012;
//import com.youbang.utils.BCD8421Operater;
//import com.youbang.utils.BitOperator;
//import com.youbang.utils.MsgParseUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;

public class Record2012Decoder {

    private static final Logger logger = LoggerFactory.getLogger(Record2012Decoder.class);

//    public static Record2012 bytesToRecord(byte[] data){
//        Record2012 recoder2012 = new Record2012();
//        //数据在GB/T 19056-2012 中的 A 1.6.1章节中
//        //起始字头 55
//        recoder2012.setFristCode(MsgParseUtils.parseIntFromBytes(data, 0, 1));
//        //起始字头 7A
//        recoder2012.setSecondCode(MsgParseUtils.parseIntFromBytes(data, 1, 1));
//        //命令字
//        recoder2012.setCommandWord(MsgParseUtils.parseIntFromBytes(data, 2, 1));
//        if(recoder2012.getCommandWord()==0xFA){
//            return recoder2012;
//        }
//        //数据块长度 2byte
//        recoder2012.setBodyLength(MsgParseUtils.parseIntFromBytes(data, 3, 2));
//        //保留位
//        recoder2012.setKeepWord(MsgParseUtils.parseIntFromBytes(data, 5, 1));
//        //数据块
//        byte[] tmp = new byte[recoder2012.getBodyLength()];
//        System.arraycopy(data, 6, tmp, 0, tmp.length);
//        recoder2012.setBody(tmp);
//        //校验码
//        int checkSumInPkg = data[data.length - 1];
//        recoder2012.setCheckNumber(checkSumInPkg);
//        int calculatedCheckSum = BitOperator.getCheckSum4JT808(data, 0, data.length - 1);
//        if (checkSumInPkg != calculatedCheckSum) {
//            logger.warn("命令字:{}中检验码不一致,解析后:{},转化后:{}", recoder2012.getCommandWord(), checkSumInPkg, calculatedCheckSum);
//        }
//        return recoder2012;
//    }
//
//    public static void parseRecordByWord(Record2012 recoder2012){
//        byte[] body = recoder2012.getBody();
//        switch (recoder2012.getCommandWord()){
//            case 0x00:
//                //1.年号  BCD码
//                byte[] one = new byte[1];
//                System.arraycopy(body, 0, one, 0, 1);
//                String year = BCD8421Operater.bcd2String(one);
//                //2.修改单据
//                byte[] two = new byte[1];
//                System.arraycopy(body, 1, two, 0, 1);
//                String document = BCD8421Operater.bcd2String(two);
//                logger.info("采集记录仪执行标准版本(00H),年号:{},单据:{}", year, document);
//                break;
//            case 0x01:
//                String temp = null;
//                try {
//                    temp = new String(body,"ascii");
//                } catch (UnsupportedEncodingException e) {
//                    logger.error("解析ASCII码出错:{}", e.getMessage());
//                }
//                logger.info("采集当前驾驶人信息(01H),ASCII:{},机动车驾驶证号码:{}", temp);
//                break;
//            case 0x02:
//                break;
//            case 0x03:
//                break;
//            case 0x04:
//                break;
//            case 0x05:
//                break;
//            case 0x06:
//                break;
//            default:
//                logger.info("接收错误时的应答,secondCode:{}",recoder2012.getSecondCode());
//                break;
//        }
//
//
//    }



}
