package com.czj.controller;

import com.czj.bean.PersonModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jie on 2019/4/1.
 * Grpc 类
 * @AUTHOR JIE
 * @date 2019/4/1
 */
@RestController
@RequestMapping("Grpc")
public class GrpcController {


    public void testGrpc(){
        PersonModel.person forezp = PersonModel.person.newBuilder()
                .setId(1)
                .setName("bzb")
                .setEmail("15851485932@163.com")
                .build();

        for (byte b : forezp.toByteArray()){
            System.out.print(b);
        }

        System.out.println("\n bytes长度" + forezp.toByteString().size());

        System.out.println("forezp byte结束==============");

        System.out.println("forezp 反序列化对象开始================");
        PersonModel.person forezpCopy = null;

        try {
            forezpCopy = PersonModel.person.parseFrom(forezp.toByteArray());
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }

        System.out.println(forezpCopy.toString());
        System.out.println("forezp 反序列化对象结束================");


    }




}
