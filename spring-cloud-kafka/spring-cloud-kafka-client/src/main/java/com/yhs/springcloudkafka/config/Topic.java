package com.yhs.springcloudkafka.config;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author Charles
 * @Title: Topic
 * @Package com.yhs.springcloudkafkaclient.config
 * @Description: TODO
 * @date 2017/12/25 16:29
 */
public interface Topic {
    String INPUT_TOPIC = "topic_out";

    String INPUT_TOPIC1 = "charles";

    @Input(INPUT_TOPIC)
    SubscribableChannel consume();

    @Input(INPUT_TOPIC1)
    SubscribableChannel conCharles();

}
