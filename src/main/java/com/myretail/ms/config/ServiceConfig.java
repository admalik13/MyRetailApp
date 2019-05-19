package com.myretail.ms.config;

import com.myretail.ms.services.implementation.AddProductApplicationService;
import com.myretail.ms.services.implementation.GetProductApplicationService;
import com.myretail.ms.services.implementation.UpdateProductApplicationService;
import com.myretail.ms.services.interfaces.IAddProductApplicationService;
import com.myretail.ms.services.interfaces.IGetProductApplicationService;
import com.myretail.ms.services.interfaces.IUpdateProductApplicationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public IGetProductApplicationService getProductApplicationService(){
        return new GetProductApplicationService();
    }

    @Bean
    public IAddProductApplicationService addProductApplicationService(){
        return new AddProductApplicationService();
    }

    @Bean
    public IUpdateProductApplicationService updateProductApplicationService(){
        return new UpdateProductApplicationService();
    }
}
