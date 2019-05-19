package com.myretail.ms.gateways.interfaces;

import com.myretail.ms.models.Price;
import com.myretail.ms.models.Product;
import com.myretail.ms.models.ProductResponse;

import java.io.IOException;

public interface IProductGatewayService {
    String getProductName(int productId);
    Price getProductPrice(int productId);

    ProductResponse addProduct(Product product);

    ProductResponse updateProduct(Product product);
}
