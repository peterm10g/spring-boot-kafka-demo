package com.peter.base.kafka;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaReceiver {

    private static Logger logger = LoggerFactory.getLogger(KafkaReceiver.class);

    private Gson gson = new GsonBuilder().create();

    @KafkaListener(topics = {"order","return"})
    public void processMessage(String content) {

//        Message meg = gson.fromJson(content, Message.class);
//        AsyncListenableTaskExecutor

        logger.info("message is " + content);
    }
}
