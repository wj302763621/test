package com.example.demo.threads;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.*;

/**
 * Created by wangjian on 2017/8/28.
 */
@Service
public class AsyncTaskService {

    static int a = 1;
    @Async
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务: " + i);

        for(int j= 0;j<200000;j++) {
            String str = "38567071 13801783144 18917565379 20170621183115 20170621183118 10" + a++;

            try {
                UdpClient.run(str);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("执行异步任务+1: " + (i + 1));
    }
}