package com.myretail.ms.config;

import com.myretail.ms.gateways.implementation.ProductGatewayService;
import com.myretail.ms.gateways.interfaces.IProductGatewayService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class GatewayConfig {

    @Bean
    public IProductGatewayService productGatewayService(){
        return new ProductGatewayService();
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
