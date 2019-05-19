package com.myretail.ms.services.implementation;

import com.myretail.ms.gateways.interfaces.IProductGatewayService;
import com.myretail.ms.models.Product;
import com.myretail.ms.models.ProductResponse;
import com.myretail.ms.services.interfaces.IUpdateProductApplicationService;
import org.springframework.beans.factory.annotation.Autowired;

public class UpdateProductApplicationService implements IUpdateProductApplicationService {
    @Autowired
    protected IProductGatewayService productGatewayService;

    @Override
    public ProductResponse execute(Product product) {
        return productGatewayService.updateProduct(product);
    }
}
