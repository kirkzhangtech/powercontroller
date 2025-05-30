package com.datariver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;




@EnableDiscoveryClient
@SpringBootApplication
public class powerControllerProducer 
{
    public static void main( String[] args )
    {
        SpringApplication.run(powerControllerProducer.class, args);
    }
}
