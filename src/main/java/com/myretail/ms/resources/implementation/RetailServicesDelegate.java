package com.myretail.ms.resources.implementation;

import com.myretail.ms.models.AddProductParameters;
import com.myretail.ms.models.UpdateProductParameters;
import com.myretail.ms.resources.interfaces.IRetailServicesDelegate;
import com.myretail.ms.models.GetProductParameters;
import com.myretail.ms.models.ProductResponse;
import com.myretail.ms.services.interfaces.IAddProductApplicationService;
import com.myretail.ms.services.interfaces.IGetProductApplicationService;
import com.myretail.ms.services.interfaces.IUpdateProductApplicationService;
import org.springframework.beans.factory.annotation.Autowired;

public class RetailServicesDelegate implements IRetailServicesDelegate {

    @Autowired
    protected IGetProductApplicationService getProductApplicationService;

    @Autowired
    protected IAddProductApplicationService addProductApplicationService;

    @Autowired
    protected IUpdateProductApplicationService updateProductApplicationService;

    @Override
    public ProductResponse getProduct(GetProductParameters parameters) {
        return getProductApplicationService.execute(parameters.getProductId());
    }

    @Override
    public ProductResponse addProduct(AddProductParameters parameters) {
        return addProductApplicationService.execute(parameters.getProduct());
    }

    @Override
    public ProductResponse updateProduct(UpdateProductParameters parameters) {
        return updateProductApplicationService.execute(parameters.getProduct());
    }
}
