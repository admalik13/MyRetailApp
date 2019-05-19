package com.myretail.ms.services.interfaces;

import com.myretail.ms.models.ProductResponse;

public interface IGetProductApplicationService {
    ProductResponse execute(int productId);
}
