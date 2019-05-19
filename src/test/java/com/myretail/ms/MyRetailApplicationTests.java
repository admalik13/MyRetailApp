package com.myretail.ms;

import com.myretail.ms.gateways.implementation.ProductGatewayService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyRetailApplicationTests {

    @Test
    public void testReadJsonWithObjectMapper() throws Exception {
        ProductGatewayService obj= new ProductGatewayService();
        String productName = obj.getProductName(13860428);
        assert (productName != null);
    }

}
