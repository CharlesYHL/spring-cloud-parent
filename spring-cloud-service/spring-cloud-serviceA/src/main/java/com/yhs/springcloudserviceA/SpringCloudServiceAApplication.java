package com.yhs.springcloudserviceA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudServiceAApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringCloudServiceAApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServiceAApplication.class, args);

		logger.info("============SpringCloudServiceA========启动成功!====================");
	}
}
