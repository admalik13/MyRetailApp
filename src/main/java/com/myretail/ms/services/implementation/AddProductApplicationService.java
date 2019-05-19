package com.myretail.ms.services.implementation;

import com.myretail.ms.gateways.interfaces.IProductGatewayService;
import com.myretail.ms.models.Product;
import com.myretail.ms.models.ProductResponse;
import com.myretail.ms.services.interfaces.IAddProductApplicationService;
import org.springframework.beans.factory.annotation.Autowired;

public class AddProductApplicationService implements IAddProductApplicationService {

    @Autowired
    protected IProductGatewayService productGatewayService;

    @Override
    public ProductResponse execute(Product product) {
        return productGatewayService.addProduct(product);
    }
}
