package com.yhs.springcloudconfigserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServerApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringCloudConfigServerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);

		logger.info("====================启动成功!====================");

	}
}
