// main application, where the server runs(on port 8080)

package com.survey.momtrimo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class MomtrimoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MomtrimoApplication.class, args);
	}

}
