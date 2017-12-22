package com.yhs.springcloudrabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Charles
 * @Title: RabbitConfig
 * @Package com.yhs.springcloudrabbitmq
 * @Description: TODO
 * @date 2017/12/22 11:34
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }
}
