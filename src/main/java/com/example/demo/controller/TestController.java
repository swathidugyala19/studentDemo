package com.example.demo.controller;

import com.example.demo.Entity.Product;
import com.example.demo.Entity.Products;
import com.example.demo.Entity.SortbyRating;
import org.apache.logging.log4j.util.PropertySource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/fetch")
    public List<Products> getDetails(){
        ResponseEntity<Product> product = restTemplate.exchange("https://dummyjson.com/products", HttpMethod.GET, null, Product.class);
        List<Products> products = product.getBody().getProducts();
       // Collections.sort(products, new SortbyRating());
        Collections.sort(products);
        return products;
    }
}
