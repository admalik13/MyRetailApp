package com.myretail.ms.services.implementation;

import com.myretail.ms.gateways.interfaces.IProductGatewayService;
import com.myretail.ms.models.ProductResponse;
import com.myretail.ms.services.interfaces.IGetProductApplicationService;
import org.springframework.beans.factory.annotation.Autowired;

public class GetProductApplicationService implements IGetProductApplicationService {

    @Autowired
    protected IProductGatewayService productGatewayService;

    @Override
    public ProductResponse execute(int productId) {
        return new ProductResponse(productId,
                productGatewayService.getProductName(productId),
                productGatewayService.getProductPrice(productId));
    }
}
