package com.myretail.ms.config;

import com.myretail.ms.resources.implementation.RetailServicesDelegate;
import com.myretail.ms.resources.interfaces.IRetailServicesDelegate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResourceConfig {

    @Bean
    public IRetailServicesDelegate retailServicesDelegate(){
        return new RetailServicesDelegate();
    }
}
