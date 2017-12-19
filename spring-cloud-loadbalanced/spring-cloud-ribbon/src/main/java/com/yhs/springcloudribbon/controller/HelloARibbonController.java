package com.yhs.springcloudribbon.controller;

import com.yhs.springcloudribbon.service.HelloARibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value = "/HelloARibbon")
    public String hi(@RequestParam String name){
        return ribbonService.getHelloA(name);
    }

}
