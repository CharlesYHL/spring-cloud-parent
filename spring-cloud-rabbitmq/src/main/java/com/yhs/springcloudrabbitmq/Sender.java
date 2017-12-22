package com.yhs.springcloudrabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author Charles
 * @Title: Sender
 * @Package com.yhs.springcloudrabbitmq
 * @Description: TODO
 * @date 2017/12/22 11:36
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(String msg){
        System.out.println("sender:" + msg+"-----"+new Date());
        this.rabbitTemplate.convertAndSend("hello",msg);
    }
}
