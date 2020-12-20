package cn.lookk.consumerconsul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@SpringBootApplication
@ComponentScan("cn.lookk.*")
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerConsulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerConsulApplication.class, args);
	}

	//解决本地配置文件找不到配置项报错
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
		c.setIgnoreUnresolvablePlaceholders(true);

		return c;

	}
}
