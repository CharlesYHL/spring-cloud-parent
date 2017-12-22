package com.yhs.springcloudrabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Charles
 * @Title: RabbitController
 * @Package com.yhs.springcloudrabbitmq
 * @Description: TODO
 * @date 2017/12/22 11:35
 */
@RestController
public class RabbitController {
    @Autowired
    private Sender sender;


    @GetMapping("/hello")
    public String hello(@RequestParam String msg) {
        sender.send(msg);
        return "send msg:" + msg;
    }
}
