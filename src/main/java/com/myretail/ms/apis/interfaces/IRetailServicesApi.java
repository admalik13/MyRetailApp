package com.myretail.ms.apis.interfaces;

import com.myretail.ms.models.Product;
import com.myretail.ms.models.ProductResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface IRetailServicesApi {
    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    default ResponseEntity<ProductResponse> getProduct(@PathVariable("id") Integer productOrderId){
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.POST)
    default ResponseEntity<ProductResponse> addProduct(@RequestBody Product product, @PathVariable("id") Integer productOrderId){
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
    default ResponseEntity<ProductResponse> updateProduct(@RequestBody Product product, @PathVariable("id") Integer productOrderId){
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
