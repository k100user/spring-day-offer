package com.onedayoffer.taskdistribution;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TaskDistributionApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(TaskDistributionApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception { }
}
