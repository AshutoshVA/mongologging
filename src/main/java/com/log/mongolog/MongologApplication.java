package com.log.mongolog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MongologApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongologApplication.class, args);
	}

}
