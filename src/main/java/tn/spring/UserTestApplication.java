package tn.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.List;

@EnableScheduling
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })




public class UserTestApplication<Static> {


	public static void main(String[] args) {
		SpringApplication.run(UserTestApplication.class, args);
	}

}
