package com.peter.base.kafka;

import java.util.Date;

/**
 * Project Name: sbdemo
 * Created by peter on 17/4/11.
 * 北京链商电子商务有限公司
 * Package
 * desc:
 */
public class MessageReturn {

    private Long id;
    private String name;
    private String msg;
    private Date sendTime;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Date getSendTime() {
        return sendTime;
    }
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
