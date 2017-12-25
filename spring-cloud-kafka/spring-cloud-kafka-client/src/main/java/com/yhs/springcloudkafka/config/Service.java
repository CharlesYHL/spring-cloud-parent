package com.yhs.springcloudkafka.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Charles
 * @Title: Service
 * @Package com.yhs.springcloudkafkaclient.config
 * @Description: TODO
 * @date 2017/12/25 16:30
 */
public class Service {
    private static final Logger LOGGER = LoggerFactory.getLogger(Service.class);

    public void consume(Message message) throws InterruptedException {
        LOGGER.info("message received '{}'", message);
    }

    public void conCharles(String message){
        LOGGER.info("message received '{}'",message);
    }

}
