package com.example.demo;

import com.example.demo.mod.ResultRes;
import com.example.demo.mod.VoiceRecognitionMsg;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wangjian on 2017/8/22.
 */
public class TestPostForObject {

    public static void main(String[] args){

        VoiceRecognitionMsg req = new VoiceRecognitionMsg();
        req.setCallingNumber("123123123");
        req.setCalledNumber("123456123456");
        req.setStartTime("111111111");
        req.setRecognitionTime("22222222");
        req.setResourceNumber("15874254444");
        req.setResultMsgCode("10");

        RestTemplate template = new RestTemplate();

        String url = "http://10.18.3.162:8080/test/test";
//        String url = "http://localhost:8080/test";

        ResultRes resp = template.postForObject(url, req, ResultRes.class);
        System.out.println(resp.getResultMsg());
    }
}
