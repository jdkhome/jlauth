package com.xhuabu.source.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * Created by lee on 17/12/25.
 * ${DESCRIPTION}
 *
 * @CreatedBy lee
 * @Date 17/12/25
 */
@Component
@ConfigurationProperties(prefix = "com.xhuabu.source.auth")
public class PropertiesConfiguration {

    /**
     * IP白名单，用逗号隔开
     */
    private String ipWhiteList;


    public String getIpWhiteList() {
        return ipWhiteList;
    }

    public void setIpWhiteList(String ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
    }
}
