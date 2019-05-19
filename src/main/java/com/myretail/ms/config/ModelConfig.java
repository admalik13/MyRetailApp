package com.myretail.ms.config;

import com.myretail.ms.models.AddProductParameters;
import com.myretail.ms.models.GetProductParameters;
import com.myretail.ms.models.UpdateProductParameters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ModelConfig {

    @Bean
    @Scope("prototype")
    public GetProductParameters getProductParameters(){
        return new GetProductParameters();
    }

    @Bean
    @Scope("prototype")
    public AddProductParameters addProductParameters(){
        return new AddProductParameters();
    }

    @Bean
    @Scope("prototype")
    public UpdateProductParameters updateProductParameters(){
        return new UpdateProductParameters();
    }

}
