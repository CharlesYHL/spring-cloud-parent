package com.yhs.springcloudribbon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudRibbonApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringCloudRibbonApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudRibbonApplication.class, args);

		logger.info("=========SpringCloudRibbonApplication===========启动成功!====================");
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
