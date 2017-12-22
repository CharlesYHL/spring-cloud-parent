package com.yhs.springcloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Charles
 * @Title: TestController
 * @Package com.yhs.springcloudconfigclient.controller
 * @Description: TODO
 * @date 2017/12/22 10:46
 */
@RefreshScope
@RestController
public class TestController {

    @Value("${foo}")
    String foo;


    /*@RequestMapping(value = "/configHi")
    public String hi(){
        return foo;
    }*/
    @RequestMapping("/foo")
    public String from() {
        return this.foo;
    }


    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }
}
