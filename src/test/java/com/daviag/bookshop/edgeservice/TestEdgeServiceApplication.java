package com.daviag.bookshop.edgeservice;

import org.springframework.boot.SpringApplication;

public class TestEdgeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(EdgeServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
