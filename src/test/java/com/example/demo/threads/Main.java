package com.example.demo.threads;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wangjian on 2017/8/28.
 */
public class Main {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskExecutorConfig.class);

        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);

        for (int i = 0; i < 5; i++) {
            asyncTaskService.executeAsyncTask(i);
//            asyncTaskService.executeAsyncTaskPlus(i);
        }
        context.close();
    }
}