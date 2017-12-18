package com.yhs.springcloudconfigclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
@RestController
@RefreshScope
public class SpringCloudConfigClientApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringCloudConfigClientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigClientApplication.class, args);


		logger.info("====================启动成功!====================");
	}

	@Value("${foo}")
	String foo;


	@RequestMapping(value = "/configHi")
	public String hi(){
		return foo;
	}

}
