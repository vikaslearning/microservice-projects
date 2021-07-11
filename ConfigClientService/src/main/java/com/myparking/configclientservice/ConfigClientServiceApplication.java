package com.myparking.configclientservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myparking.configclientservice.beans.ConfigData;

@SpringBootApplication
@RestController
public class ConfigClientServiceApplication {

	@Autowired
	Environment environment;
	
	@Autowired
	private ConfigData configData;
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientServiceApplication.class, args);
		
	}

	@GetMapping(path = "/config-client/NoOfFloors")
	public String getNumberOfFloors() {
		return environment.getProperty("spring.profiles.active")+" "+configData.getFloors();
	}
}
