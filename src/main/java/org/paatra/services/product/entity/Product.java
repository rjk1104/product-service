package org.paatra.services.product.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.paatra.services.product.util.ProductEntityKey;

import javax.persistence.Entity;
import javax.persistence.IdClass;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(ProductEntityKey.class)
public class Product {

}
