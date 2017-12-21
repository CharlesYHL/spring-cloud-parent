package com.yhs.springcloudribbon.controller;

import com.yhs.springcloudribbon.service.HelloARibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author Charles
 * @Title: HelloARibbonController
 * @Package com.yhs.springcloudribbon.controller
 * @Description: TODO
 * @date 2017/12/19 17:15
 */
@RestController
public class HelloARibbonController {

    @Autowired
    HelloARibbonService ribbonService;

    @RequestMapping(value = "/getHelloARibbon")
    public String getHelloARibbon(@RequestParam String name){
        return ribbonService.getHelloA(name);
    }

    @RequestMapping(value = "postHelloARibbon",method = RequestMethod.POST)
    public String postHelloARibbon(@RequestBody Map map){
        return ribbonService.postHelloA(map);
    }

}
