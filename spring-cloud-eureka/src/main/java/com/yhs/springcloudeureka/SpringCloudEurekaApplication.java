package com.yhs.springcloudeureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringCloudEurekaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaApplication.class, args);

		logger.info("====================启动成功!====================");

	}
}
