package org.crazyman;

import org.crazyman.service.AService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class HelloSpringbootApplication {

	@Autowired
	private AService aService;

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringbootApplication.class, args);
	}

	@PostConstruct
	public void init(){
		aService.getString();
	}

}
