package org.paatra.services.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@Data
@AllArgsConstructor(staticName = "build")
public class ProductRequest {
    @NotNull(message = "ProductCode is required field")
    private String productId;
    @NotNull(message = "date_frome is required field")
    private String date_from;
    @NotNull(message = "date_to is required field")
    private String date_to;
    @NotNull(message = "product_name is required field")
    private String product_name;
    @NotNull(message = "short_des is required field")
    private String short_desc;
    @NotNull(message = "long_desc is required field")
    private String long_desc;
    @NotNull(message = "quantity is required field")
    private long quantity;
    private int price;
    private int rating;
    private int warranty;
    private int weight;
    private String size;
}
