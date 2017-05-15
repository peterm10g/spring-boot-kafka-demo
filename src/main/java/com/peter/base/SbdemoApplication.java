package com.peter.base;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SbdemoApplication {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(SbdemoApplication.class);

		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
//		SpringApplication.run(SbdemoApplication.class, args);
	}
}
