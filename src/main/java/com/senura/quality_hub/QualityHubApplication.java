package com.senura.quality_hub;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class QualityHubApplication {

	public static void main(String[] args) {

       ConfigurableApplicationContext context =  SpringApplication.run(QualityHubApplication.class, args);
       Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
