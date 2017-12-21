package com.yhs.springcloudtask;

import com.yhs.springcloudtask.dao.IScoreDao;
import com.yhs.springcloudtask.entity.Score;
import com.yhs.springcloudtask.service.IScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableTask
public class SpringCloudTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTaskApplication.class, args);
	}

	@Autowired
	IScoreDao dao;

	@Bean
	public CommandLineRunner commandLineRunner() {
		return new TestCommandLineRunner();
	}

	public  class TestCommandLineRunner implements CommandLineRunner {
		@Override
		public void run(String... strings) throws Exception {
			System.out.println("this is a Test about spring cloud task.");
			try{
				List<Score> list = dao.getList();
				System.out.println(list.get(1).getSubjectName());
			}catch (Exception e){
				System.err.println("Error");
				throw e;
			}
		}
	}
}
