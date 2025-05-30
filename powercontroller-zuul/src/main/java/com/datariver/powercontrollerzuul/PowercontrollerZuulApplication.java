package com.datariver.powercontrollerzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class PowercontrollerZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(PowercontrollerZuulApplication.class, args);
	}

}
