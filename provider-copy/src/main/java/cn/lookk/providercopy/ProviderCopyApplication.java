package cn.lookk.providercopy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("cn.lookk.*")
public class ProviderCopyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderCopyApplication.class, args);
	}

}
