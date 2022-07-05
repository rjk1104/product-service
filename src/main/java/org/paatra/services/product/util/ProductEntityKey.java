package org.paatra.services.product.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class ProductEntityKey implements Serializable {

    private String productId;
    private String productName;
    private String dateFrom;
    private String dateTo;

    public ProductEntityKey(String product_id) {
        this.productId=product_id;
        this.dateTo= Instant.now().toString();
    }
}
