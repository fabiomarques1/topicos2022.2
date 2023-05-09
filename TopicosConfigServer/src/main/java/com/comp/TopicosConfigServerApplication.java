package com.comp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TopicosConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TopicosConfigServerApplication.class, args);
	}

}
