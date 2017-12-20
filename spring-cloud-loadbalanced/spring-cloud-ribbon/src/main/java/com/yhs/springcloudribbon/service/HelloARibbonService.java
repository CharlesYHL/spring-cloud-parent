package com.yhs.springcloudribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

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
        Map<String,String> params = new HashMap<>();
        params.put("name",name);
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://SPRING-CLOUD-SERVICEA/getHelloA?name={name}",String.class,params);
        String body = responseEntity.getBody();
        return body;

        //2.getForEntity String
        /*ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://SPRING-CLOUD-SERVICEA/getHelloA?name={1}",String.class,name);
        String body = responseEntity.getBody();
        return body;*/

        //1.getForObject
        //return restTemplate.getForObject("http://SPRING-CLOUD-SERVICEA/getHelloA?name="+name,String.class);
    }


}
