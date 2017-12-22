package com.yhs.springcloudconfigclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudConfigClientApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringCloudConfigClientApplication.class);

	public static void main(String[] args) {
		//SpringApplication.run(SpringCloudConfigClientApplication.class, args);
		new SpringApplicationBuilder(SpringCloudConfigClientApplication.class).web(true).run(args);

		logger.info("====================启动成功!====================");
	}


}
