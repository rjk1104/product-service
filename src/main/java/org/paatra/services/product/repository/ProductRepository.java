package org.paatra.services.product.repository;

import org.paatra.services.product.entity.Product;
import org.paatra.services.product.util.ProductEntityKey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, ProductEntityKey> {
    List<Product> findAllByCollection(String collection);
}
