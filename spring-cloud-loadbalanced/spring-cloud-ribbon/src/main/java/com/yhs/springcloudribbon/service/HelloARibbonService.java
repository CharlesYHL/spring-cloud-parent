package com.yhs.springcloudribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Charles
 * @Title: HelloARibbonService
 * @Package com.yhs.springcloudribbon.service
 * @Description: TODO
 * @date 2017/12/19 17:14
 */
@Service
public class HelloARibbonService {

    @Autowired
    RestTemplate restTemplate;


    public String getHelloA(String name) {
        return restTemplate.getForObject("http://SPRING-CLOUD-SERVICEA/HelloA?name="+name,String.class);
    }
}
