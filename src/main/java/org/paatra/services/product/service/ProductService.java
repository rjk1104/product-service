package org.paatra.services.product.service;

import org.paatra.services.product.entity.Product;
import org.paatra.services.product.repository.ProductRepository;
import org.paatra.services.product.util.ProductEntityKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductEntityKey productEntityKey;

    public List<Product> getAllProducts() {
        return (List<Product>) productRepository.findAll();
    }

    public List<Product> getAllProductsForCollection(String collection) {
        return productRepository.findAllByCollection(collection);
    }

    public Optional<Product> getProduct(String product_id) {
        return productRepository.findById(new ProductEntityKey(product_id));
    }
}
