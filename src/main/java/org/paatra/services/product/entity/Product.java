package org.paatra.services.product.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.paatra.services.product.util.ProductEntityKey;

import javax.persistence.*;


@Entity
@Table(name="paatra_mast_product")
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@IdClass(ProductEntityKey.class)
public class Product {
    @Id
    @Column(name = "product_code")
    private String productId;
    @Id
    private String date_from;
    @Id
    private String date_to;
    @Id
    private String product_name;
    private String short_desc;
    private String long_desc;
    private long quantity;
    private int price;
    private int rating;
    private int warranty;
    private int weight;
    private String size;



}
