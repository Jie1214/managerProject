package com.caj.server;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Jie on 2019/4/3.
 *
 * @AUTHOR JIE
 * @date 2019/4/3
 */
@Service
public class SmsServer {

    @Autowired
    RestTemplate restTemplate;
    @Value("${sms.username}")
    String username;
    @Value("${sms.password}")
    String password;
    @Value("${sms.url}")
    String url;

    public String sendMsg(String phoneNum,String text){
        if (text.getBytes().length<=500){
            String postUrl = url + "xxxx";

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

            MultiValueMap<String,String> p = new LinkedMultiValueMap<>();
            p.add("userId",username);
            p.add("password",password);
            p.add("pszMobis",phoneNum);
            p.add("pszMsg",text);

            HttpEntity< MultiValueMap<String,String>> entity = new HttpEntity< MultiValueMap<String,String>>(p,headers);

            String result = restTemplate.postForObject(postUrl,entity,String.class);

            return result;
        }else {
            String result = "短信内容过长，请重新编辑";
            return result;
        }
    }
}
