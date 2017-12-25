package com.yhs.springcloudkafka.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * @author Charles
 * @Title: Service
 * @Package com.yhs.springcloudkafkaserver.config
 * @Description: TODO
 * @date 2017/12/25 16:16
 */
public class Service {
    private static final Logger LOGGER = LoggerFactory.getLogger(Service.class);

    private Producer producer;

    private Random random = new Random();

    public Service(Producer producer) {
        this.producer = producer;
    }

    public void sendMessages() throws InterruptedException {
        int numberMessages = random.nextInt(5);
        for (int i = 0; i < numberMessages; i++) {
            Thread.sleep(random.nextInt(1000));
            Message message = new Message(numberMessages + "", "Message " + i + " from producer " + LocalDateTime.now());
            LOGGER.info(message.toString());
            producer.send(message);
        }
    }

    public void sendMessagesCharles(){
        String message = "发送消息======测试Charles==:"+VeDate.getNowDate();
        LOGGER.info(message);
        producer.send(message);
    }
}
