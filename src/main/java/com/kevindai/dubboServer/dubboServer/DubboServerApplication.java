package com.kevindai.dubboServer.dubboServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan("com.kevindai")
@ImportResource("classpath:dubbo-server.xml")
public class DubboServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboServerApplication.class, args);
	}
}
