package com.yhs.springcloudkafkaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
//@EnableKafka
public class SpringCloudKafkaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudKafkaServerApplication.class, args);
	}
}
