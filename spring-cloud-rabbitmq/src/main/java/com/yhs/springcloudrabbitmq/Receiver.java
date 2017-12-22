package com.yhs.springcloudrabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author Charles
 * @Title: Receiver
 * @Package com.yhs.springcloudrabbitmq
 * @Description: TODO
 * @date 2017/12/22 11:36
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {

    @RabbitHandler
    public void process(String str) {
        System.out.println("Receiver:" + str+"-----"+new Date());
    }

}
