package com.yhs.springcloudkafka.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

/**
 * @author Charles
 * @Title: Config
 * @Package com.yhs.springcloudkafkaclient.config
 * @Description: TODO
 * @date 2017/12/25 16:32
 */
@Configuration
public class Config {
    @Autowired
    private Topic topic;

    private Random random = new Random();

    @Bean
    Service service() {
        return new Service();
    }

    @Bean
    Consumer producer() {
        return new Consumer(service());
    }

}
