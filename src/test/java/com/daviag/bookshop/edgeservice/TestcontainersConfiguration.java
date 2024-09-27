package com.daviag.bookshop.edgeservice;

import com.redis.testcontainers.RedisContainer;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.testcontainers.utility.DockerImageName;

@TestConfiguration(proxyBeanMethods = false)
class TestcontainersConfiguration {

	@Bean
	RedisContainer redisContainer() {
		return new RedisContainer(DockerImageName.parse("redis:7.4-alpine"));
	}
}
