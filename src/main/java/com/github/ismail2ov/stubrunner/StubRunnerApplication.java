package com.github.ismail2ov.stubrunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.contract.stubrunner.server.EnableStubRunnerServer;

@SpringBootApplication
@EnableStubRunnerServer
public class StubRunnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StubRunnerApplication.class, args);
	}

}
