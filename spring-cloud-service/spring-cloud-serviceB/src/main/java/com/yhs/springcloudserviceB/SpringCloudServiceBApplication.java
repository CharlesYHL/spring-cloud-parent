package com.yhs.springcloudserviceB;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudServiceBApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringCloudServiceBApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(SpringCloudServiceBApplication.class, args);

		logger.info("============SpringCloudServiceBApplication========启动成功!====================");
	}
}
