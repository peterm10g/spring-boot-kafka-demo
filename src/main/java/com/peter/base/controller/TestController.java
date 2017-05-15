package com.peter.base.controller;

import com.peter.base.async.AsyncService;
import com.peter.base.event.DemoPayEvent;
import com.peter.base.kafka.KafkaSender;
import com.peter.base.model.PayConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project Name: sbdemo
 * Created by peter on 17/4/1.
 * 北京链商电子商务有限公司
 * Package
 * desc:
 */
@RestController
@SpringBootApplication
@RequestMapping("/user")
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private PayConfig payConfig;

    @Autowired
    private AsyncService asyncService;

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private KafkaSender kafkaSender;

    @RequestMapping("/get")
    public String getUser(){

        //异步执行
        asyncService.sendSMS(payConfig.getKey());

        //
        logger.info("get user ok " + payConfig.getKey());

        //发布事件
        applicationContext.publishEvent(new DemoPayEvent(this,payConfig.getKey()));

        logger.info("get user ok " + payConfig.getKey()  + " end");

        return "true test ok";
    }

    @RequestMapping("/kafka")
    public String kafkaSender() throws InterruptedException {

        for (int i = 0; i < 5; i++) {
            kafkaSender.sendMessage();

            logger.info("sendMessage " + i);

            Thread.sleep(500);
        }

        return "ok";
    }


}
