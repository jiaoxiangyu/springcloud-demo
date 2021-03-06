package cn.lookk.providercopy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("cn.lookk.*")
public class ProviderCopyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderCopyApplication.class, args);
	}

}
