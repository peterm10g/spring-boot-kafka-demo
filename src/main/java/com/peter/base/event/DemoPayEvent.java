package com.peter.base.event;

import org.springframework.context.ApplicationEvent;

/**
 * Project Name: sbdemo
 * Created by peter on 17/4/11.
 * 北京链商电子商务有限公司
 * Package
 * desc:
 */
public class DemoPayEvent extends ApplicationEvent {

    private static final long serialVersionUID = 5516075349620653342L;
    private String msg;

    public DemoPayEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
