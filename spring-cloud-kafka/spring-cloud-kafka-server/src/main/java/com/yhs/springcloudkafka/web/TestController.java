package com.yhs.springcloudkafka.web;

import com.yhs.springcloudkafka.util.KafkaUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

/**
 * @author Charles
 * @Title: TestController
 * @Package com.yhs.springcloudkafkaserver.web
 * @Description: TODO
 * @date 2017/12/22 16:11
 */
@RestController
public class TestController {

    @RequestMapping(value = "testUrl",method = RequestMethod.GET)
    public void testUrl(){
        String jon = "小开心";
        try {
            byte[] bf = jon.getBytes("utf8");
            KafkaUtil.send("shuaige",bf);
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }

    }



}
