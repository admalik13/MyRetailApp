package com.myretail.ms.apis.implementation;

import com.myretail.ms.apis.interfaces.IRetailServicesApi;
import com.myretail.ms.models.*;
import com.myretail.ms.resources.interfaces.IRetailServicesDelegate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Provider;

@RestController
public class RetailServicesApi implements IRetailServicesApi {

    private final IRetailServicesDelegate retailServicesDelegate;
    private final Provider<GetProductParameters> getProductParametersProvider;
    private final Provider<AddProductParameters> addProductParametersProvider;
    private final Provider<UpdateProductParameters> updateProductParametersProvider;

    public RetailServicesApi(IRetailServicesDelegate retailServicesDelegate,
                             Provider<GetProductParameters> getProductParametersProvider,
                             Provider<AddProductParameters> addProductParametersProvider,
                             Provider<UpdateProductParameters> updateProductParametersProvider) {
        this.retailServicesDelegate = retailServicesDelegate;
        this.getProductParametersProvider = getProductParametersProvider;
        this.addProductParametersProvider = addProductParametersProvider;
        this.updateProductParametersProvider = updateProductParametersProvider;
    }

    @Override
    public ResponseEntity<ProductResponse> getProduct(@PathVariable("id") Integer productOrderId){
        GetProductParameters parameters = getProductParametersProvider.get();
        parameters.setProductId(productOrderId);
        return ResponseEntity.ok(retailServicesDelegate.getProduct(parameters));
    }

    @Override
    public ResponseEntity<ProductResponse> addProduct(@RequestBody Product product, @PathVariable("id") Integer productOrderId){
        AddProductParameters parameters = addProductParametersProvider.get();
        parameters.setProductId(productOrderId);
        parameters.setProduct(product);
        return ResponseEntity.ok(retailServicesDelegate.addProduct(parameters));
    }

    @Override
    public ResponseEntity<ProductResponse> updateProduct(@RequestBody Product product, @PathVariable("id") Integer productOrderId){
        UpdateProductParameters parameters = updateProductParametersProvider.get();
        parameters.setProductId(productOrderId);
        parameters.setProduct(product);
        return ResponseEntity.ok(retailServicesDelegate.updateProduct(parameters));
    }

}
