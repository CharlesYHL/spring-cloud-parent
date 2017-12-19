package com.yhs.springcloudserviceB.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

/**
 * @author Charles
 * @Title: ServiceHelloAController
 * @Package com.yhs.springcloudserviceB.controller
 * @Description: TODO
 * @date 2017/12/19 16:39
 */
@RestController
public class ServiceHelloAController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/getHelloA")
    public String getHelloA(@RequestParam String name) {
        return "["+name+"@"+port+"], "+new Date();
    }


    @RequestMapping(value="postHelloA",method = RequestMethod.POST)
    public String postHelloA(@RequestBody Map map){
        StringBuilder sb = new StringBuilder();
        if(map != null){
            sb.append("[欢迎"+map.get("name").toString()+"@"+port+"进入POST请求],"+new Date());
        }
        return sb.toString();
    }

    @RequestMapping(value="putHelloA",method = RequestMethod.PUT)
    public String putHelloA(@RequestBody Map map){
        StringBuilder sb = new StringBuilder();
        if(map != null){
            sb.append("[欢迎"+map.get("name").toString()+"@"+port+"进入PUT请求],"+new Date());
        }
        return sb.toString();
    }

    @RequestMapping(value="deleteHelloA",method = RequestMethod.DELETE)
    public String deleteHelloA(@RequestBody Map map){
        StringBuilder sb = new StringBuilder();
        if(map != null){
            sb.append("[欢迎"+map.get("name").toString()+"@"+port+"进入DELETE请求],"+new Date());
        }
        return sb.toString();
    }
}
