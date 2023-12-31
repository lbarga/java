package io.github.springcloud.mscloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class MscloudgatewayApplication {

	public static void main(String[] args) {

		SpringApplication.run(MscloudgatewayApplication.class, args);

	}

	@Bean
	public RouteLocator routes(RouteLocatorBuilder builder) {
		return builder
				.routes()
					.route( r -> r.path("/customers/**").uri("lb://mscustomers") )
					.route( r -> r.path("/credit-cards/**").uri("lb://mscreditcards") )
					.route( r -> r.path("/credit-evaluator/**").uri("lb://mscreditevaluator") )
				.build();
	}

}
