package com.peter.base.event;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Project Name: sbdemo
 * Created by peter on 17/4/11.
 * 北京链商电子商务有限公司
 * Package
 * desc:
 */
@Component
public class PayListener implements ApplicationListener<DemoPayEvent> {

    @Override
    @Async
    public void onApplicationEvent(DemoPayEvent demoPayEvent) {

        String msg = demoPayEvent.getMsg();
        System.out.println("this is new Meg " + msg);
        for (int i = 0; i < 200; i++) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("i == " + i);

        }

        System.out.println("this is new Meg " + msg + " end");

    }
}
