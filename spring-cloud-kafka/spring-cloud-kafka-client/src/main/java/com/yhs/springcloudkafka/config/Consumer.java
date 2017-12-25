package com.yhs.springcloudkafka.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.annotation.ServiceActivator;

/**
 * @author Charles
 * @Title: Consumer
 * @Package com.yhs.springcloudkafkaclient.config
 * @Description: TODO
 * @date 2017/12/25 16:31
 */


@EnableBinding(value={Topic.class})
public class Consumer {
    private Service service;

    public Consumer(Service service) {
        this.service = service;
    }

    @ServiceActivator(inputChannel = Topic.INPUT_TOPIC)
    public void consume(Message message) {
        try {
            service.consume(message);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @ServiceActivator(inputChannel = Topic.INPUT_TOPIC1)
    public void conCharles(String message) {
        service.conCharles(message);
    }

}
