package com.myparking.configclientservice.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "parking-service")
public class ConfigData {

	private String floors;

	public ConfigData() {
	}
	
	public String getFloors() {
		return floors;
	}

	public void setFloors(String floors) {
		this.floors = floors;
	}
	
	
}
