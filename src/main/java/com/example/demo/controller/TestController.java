package com.example.demo.controller;

import com.example.demo.mod.ResultRes;
import com.example.demo.mod.VoiceRecognitionMsg;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangjian on 2017/8/22.
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public @ResponseBody
    ResultRes GetUdpAnalysisResult(@RequestBody VoiceRecognitionMsg req){

        ResultRes res = new ResultRes();
        System.out.println("=========>" + req.toString());
        res.setResultMsg("Now Test Something Successed!");

        System.out.println(res.getResultMsg());

        return res;
    }
}
