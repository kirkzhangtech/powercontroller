package com.datariver;

/**
 * Hello world!
 *
 */

@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication
public class powerControllerProducer 
{
    public static void main( String[] args )
    {
        SpringApplication.run(powerControllerProducer.class , args);
    }
}
