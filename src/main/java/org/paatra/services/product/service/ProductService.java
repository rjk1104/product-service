package org.paatra.services.product.service;

import org.paatra.services.product.Response.ApiResponse;
import org.paatra.services.product.advice.ProductNotFoundException;
import org.paatra.services.product.dto.ProductRequest;
import org.paatra.services.product.entity.Product;
import org.paatra.services.product.repository.ProductRepository;
import org.paatra.services.product.util.ProductEntityKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;


    public ApiResponse getAllProducts() {
        ApiResponse apiResponse=new ApiResponse();
        apiResponse.setStatus(HttpStatus.OK.getReasonPhrase());
        apiResponse.setData(productRepository.findAll());
        return apiResponse;

    }

    /*public List<Product> getAllProductsForCollection(String collection) {
        return productRepository.findAllByCollection(collection);
    }*/

    public Optional<Product> getProduct(String product_id) throws ProductNotFoundException {
        Optional<Product> product= productRepository.findProductByproductId(product_id);
        if(product.isPresent()){
            return product;
        }
        else{
            throw new ProductNotFoundException("Product Not found Exception");
        }

    }

    public Product addProduct(ProductRequest productRequest) {
        Product product = Product.build(productRequest.getProductId(),
                productRequest.getProduct_name(),
                productRequest.getDate_from(),
                productRequest.getDate_to(),
                productRequest.getShort_desc(),
                productRequest.getLong_desc(),productRequest.getQuantity(), productRequest.getPrice(), productRequest.getRating(), productRequest.getWarranty(), productRequest.getWeight(), productRequest.getSize());

        return productRepository.save(product);

    }
}
