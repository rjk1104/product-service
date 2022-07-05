package org.paatra.services.product.controller;

import org.paatra.services.product.entity.Product;
import org.paatra.services.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductServiceController {

    @Autowired
    ProductService productService;

    @GetMapping("/list")
    public List<Product> listAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/list/{collection}")
    public List<Product> listAllProducts(@PathVariable String collection) {
        return productService.getAllProductsForCollection(collection);
    }

    @GetMapping("/list/item/{productId}")
    public Optional<Product> listProduct(@PathVariable String productId) {
        return productService.getProduct(productId);
    }

}
