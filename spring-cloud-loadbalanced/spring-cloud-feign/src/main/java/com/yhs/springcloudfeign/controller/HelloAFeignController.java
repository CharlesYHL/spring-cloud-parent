package com.yhs.springcloudfeign.controller;

import com.yhs.springcloudfeign.service.HelloAFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author Charles
 * @Title: HelloAFeignController
 * @Package com.yhs.springcloudfeign.controller
 * @Description: TODO
 * @date 2017/12/19 17:02
 */
@RestController
public class HelloAFeignController {

    @Autowired
    HelloAFeignService feignService;

    @RequestMapping(value = "/getHelloAFeign")
    public String getHelloAFeign(@RequestParam String name){
        return feignService.getHelloA(name);
    }

    @RequestMapping(value = "/postHelloAFeign",method = RequestMethod.POST)
    public String postHelloAFeign(@RequestBody Map map){
        return feignService.postHelloA(map);
    }

    @RequestMapping(value = "/putHelloAFeign",method = RequestMethod.PUT)
    public String putHelloAFeign(@RequestBody Map map){
        return feignService.putHelloA(map);
    }

    @RequestMapping(value = "/deleteHelloAFeign",method = RequestMethod.DELETE)
    public String deleteHelloAFeign(@RequestBody Map map){
        return feignService.deleteHelloA(map);
    }

}
