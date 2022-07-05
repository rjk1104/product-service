package org.paatra.services.product.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.time.Instant;

@Data

@AllArgsConstructor
@RequiredArgsConstructor
public class ProductEntityKey implements Serializable {

    private String productId;
    private String product_name;
    private String date_from;
    private String date_to;

    public ProductEntityKey(String product_id) {
        this.productId=product_id;

    }
}
