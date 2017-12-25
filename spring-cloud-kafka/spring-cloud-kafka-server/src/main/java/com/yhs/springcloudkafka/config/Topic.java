package com.yhs.springcloudkafka.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author Charles
 * @Title: Topic
 * @Package com.yhs.springcloudkafkaserver.config
 * @Description: TODO
 * @date 2017/12/25 16:11
 */
public interface Topic {
    String OUTPUT_TOPIC = "topic_out";

    String OUTPUT_TOPIC1 = "charles";

    @Output(OUTPUT_TOPIC)
    MessageChannel send();

    @Output(OUTPUT_TOPIC1)
    MessageChannel send1();

}
