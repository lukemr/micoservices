package com.lukasz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LibraryConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryConfigApplication.class, args);
	}
}
