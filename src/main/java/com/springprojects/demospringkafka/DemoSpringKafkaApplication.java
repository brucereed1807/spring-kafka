package com.springprojects.demospringkafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;

@SpringBootApplication
public class DemoSpringKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringKafkaApplication.class, args);
	}

	@Bean
	public Function<String, String> processorBinding() {
		return s -> s + " :: " + System.currentTimeMillis();
	}

	@Bean
	public Consumer<String> consumerBinding() {
		return s -> {
			System.out.println("Data Consumed :: " + s.toUpperCase());
		};
	}
}
