package com.peter.base.kafka;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

@Component
public class KafkaSender {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    private Gson gson = new GsonBuilder().create();

    @Async
    public void sendMessage(){
        Message m = new Message();
        m.setId(System.currentTimeMillis());
        m.setMsg(UUID.randomUUID().toString());
        m.setSendTime(new Date());
        kafkaTemplate.send("order", gson.toJson(m));

        MessageReturn mr = new MessageReturn();
        mr.setId(System.currentTimeMillis());
        mr.setMsg(UUID.randomUUID().toString());
        mr.setSendTime(new Date());
        mr.setName("return");

        kafkaTemplate.send("return", gson.toJson(mr));

    }
}
