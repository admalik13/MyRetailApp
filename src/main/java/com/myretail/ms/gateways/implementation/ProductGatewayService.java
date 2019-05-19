package com.myretail.ms.gateways.implementation;

import com.myretail.ms.gateways.interfaces.IProductGatewayService;
import com.myretail.ms.models.Price;
import com.myretail.ms.models.Product;
import com.myretail.ms.models.ProductResponse;
import com.myretail.ms.models.redsky.ProductStats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class ProductGatewayService implements IProductGatewayService {

    @Value("${services.getProductName.url}")
    private String productNameUrl;

    @Value("${services.getProductPrice.url}")
    private String productPriceUrl;

    @Value("${config.excludes}")
    private String excludes;

    @Autowired
    protected RestTemplate restTemplate;

    @Override
    public String getProductName(int productId) {
        ProductStats productStats = restTemplate.getForObject(productNameUrl + "?excludes=" + excludes, ProductStats.class,
                getPathParams(String.valueOf(productId)));
        return productStats != null ? productStats.getProduct().getItem().getProductDescription().getTitle() : null;
    }

    @Override
    public Price getProductPrice(int productId) {
        return restTemplate.getForObject(productPriceUrl, Price.class, getPathParams(String.valueOf(productId)));
    }

    @Override
    public ProductResponse addProduct(Product product){
        return new ProductResponse(product.getId(), product.getName(), product.getCurrentPrice());
    }

    @Override
    public ProductResponse updateProduct(Product product){
        return new ProductResponse(product.getId(), product.getName(), product.getCurrentPrice());
    }

    private Map<String, Object> getPathParams(String productId) {
        Map<String, Object> map = new HashMap<>();
        map.put("productId", productId);
        return map;
    }
}
