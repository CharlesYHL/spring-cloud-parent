package com.yhs.springcloudkafka.config;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

/**
 * @author Charles
 * @Title: Producer
 * @Package com.yhs.springcloudkafkaserver.config
 * @Description: TODO
 * @date 2017/12/25 16:15
 */

@EnableBinding(value={Topic.class})
public class Producer {

    private Topic topic;

    public Producer(Topic topic) {
        this.topic = topic;
    }

    public void send(Message message) {
        topic.send().send(MessageBuilder.withPayload(message).build());
    }

    public void send(String message){
        topic.send1().send(MessageBuilder.withPayload(message).build());
    }

}
