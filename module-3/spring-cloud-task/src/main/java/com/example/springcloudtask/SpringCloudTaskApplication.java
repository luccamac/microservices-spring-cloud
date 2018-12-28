package com.example.springcloudtask;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class SpringCloudTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTaskApplication.class, args);
	}

	@Bean
	public TollProcessingTask tollProcessingTask() {
		return new TollProcessingTask();
	}

	public class TollProcessingTask implements CommandLineRunner {

		@Override
		public void run(String... strings) throws Exception {

			if (strings != null){
				System.out.println("parameter length is " + strings.length);
			}

			String stationId = strings[0];
			String licensePlate = strings[1];
			String timestamp = strings[2];

			System.out.println("Station id is " + stationId + ", license plate is "
			+ licensePlate + ", timestamp is " + timestamp);

		}
	}

}

