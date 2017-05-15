package com.peter.base.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Project Name: sbdemo
 * Created by peter on 17/4/1.
 * 北京链商电子商务有限公司
 * Package
 * desc:
 */
@Component
@ConfigurationProperties(prefix = "pay")
public class PayConfig {

    private String key;

    private String sign;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
