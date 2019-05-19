package com.myretail.ms.services.interfaces;

import com.myretail.ms.models.Product;
import com.myretail.ms.models.ProductResponse;

public interface IAddProductApplicationService {
    ProductResponse execute(Product product);
}
