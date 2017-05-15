package com.peter.base.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Project Name: sbdemo
 * Created by peter on 17/4/5.
 * 北京链商电子商务有限公司
 * Package
 * desc:
 */
@Service
public class AsyncService {

    @Async
    public void sendSMS(String message){

        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(message);

    }
}
