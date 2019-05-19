package com.myretail.ms.resources.interfaces;

import com.myretail.ms.models.AddProductParameters;
import com.myretail.ms.models.GetProductParameters;
import com.myretail.ms.models.ProductResponse;
import com.myretail.ms.models.UpdateProductParameters;

public interface IRetailServicesDelegate {
    ProductResponse getProduct(GetProductParameters parameters);

    ProductResponse addProduct(AddProductParameters parameters);

    ProductResponse updateProduct(UpdateProductParameters parameters);
}
