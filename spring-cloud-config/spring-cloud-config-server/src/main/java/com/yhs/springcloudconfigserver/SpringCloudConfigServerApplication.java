package com.yhs.springcloudconfigserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServerApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringCloudConfigServerApplication.class);

	public static void main(String[] args) {
		//SpringApplication.run(SpringCloudConfigServerApplication.class, args);
		new SpringApplicationBuilder(SpringCloudConfigServerApplication.class).web(true).run(args);
		logger.info("====================启动成功!====================");

	}
}
