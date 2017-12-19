package com.yhs.springcloudconfigclient.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author Charles
 * @Title: EnvConfiguration
 * @Package com.yhs.springcloudconfigclient.config
 * @Description: TODO
 * @date 2017/12/19 9:43
 */
@Configuration
public class EnvConfiguration {

    @Value("${demo.env}")
    public String env;


}
