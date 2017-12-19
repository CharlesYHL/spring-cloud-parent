package com.yhs.springcloudfeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author Charles
 * @Title: HelloAFeignService
 * @Package com.yhs.springcloudfeign.service
 * @Description: TODO
 * @date 2017/12/19 17:01
 */
@FeignClient(value = "SPRING-CLOUD-SERVICEA")
public interface HelloAFeignService {

    @RequestMapping(value = "/getHelloA",method = RequestMethod.GET)
    String getHelloA(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/postHelloA",method = RequestMethod.POST)
    String postHelloA(@RequestBody Map map);

    @RequestMapping(value = "/putHelloA",method = RequestMethod.PUT)
    String putHelloA(@RequestBody Map map);

    @RequestMapping(value = "/deleteHelloA",method = RequestMethod.DELETE)
    String deleteHelloA(@RequestBody Map map);
}
