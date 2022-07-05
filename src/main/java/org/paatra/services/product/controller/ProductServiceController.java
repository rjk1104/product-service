package org.paatra.services.product.controller;

import org.paatra.services.product.Response.ApiResponse;
import org.paatra.services.product.advice.ProductNotFoundException;
import org.paatra.services.product.dto.ProductRequest;
import org.paatra.services.product.entity.Product;
import org.paatra.services.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductServiceController {

    @Autowired
    ProductService productService;

    @GetMapping("/list")
    public ApiResponse listAllProducts() {
        return productService.getAllProducts();
    }

    /*@GetMapping("/list/{collection}")
    public List<Product> listAllProducts(@PathVariable String collection) {
        return productService.getAllProductsForCollection(collection);
    }*/

    @GetMapping("/list/item/{productId}")
    public Optional<Product> listProduct(@PathVariable String productId) throws ProductNotFoundException {
        return productService.getProduct(productId);
    }

    @PostMapping("addProduct")
    public ResponseEntity<Product> addProduct(@RequestBody @Valid ProductRequest productRequest){
        return new ResponseEntity<>(productService.addProduct(productRequest), HttpStatus.CREATED);
    }

}
