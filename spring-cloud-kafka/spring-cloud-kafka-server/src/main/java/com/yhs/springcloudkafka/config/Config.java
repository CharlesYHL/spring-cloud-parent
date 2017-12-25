package com.yhs.springcloudkafka.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Random;

/**
 * @author Charles
 * @Title: Config
 * @Package com.yhs.springcloudkafkaserver.config
 * @Description: TODO
 * @date 2017/12/25 16:10
 */
@Configuration
@EnableScheduling
public class Config {

    private static final Logger LOGGER = LoggerFactory.getLogger(Config.class);

    @Autowired
    private Topic topic;

    private Random random = new Random();

    Producer producer() {
        return new Producer(topic);
    }

    Service service() {
        return new Service(producer());
    }

    //@Scheduled(fixedRate = 6000)
    public void keepAlive() throws InterruptedException {
        service().sendMessages();
    }

    @Scheduled(fixedDelay = 60000 )
    public void keepCharles(){
        service().sendMessagesCharles();
    }

}