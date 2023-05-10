package com.example.productsms.rest;

import org.springframework.web.bind.annotation.*;

/**
 * @author Erfan Akhavan Rad
 * @created 05/10/2023
 */
@RestController
@RequestMapping("/products")
public class ProductsController {

    @PostMapping
    public String createProduct() {
        return "POST";
    }

    @GetMapping
    public String getProduct() {
        return "GET";
    }

    @PutMapping
    public String updateProduct() {
        return "PUT";
    }

    @DeleteMapping
    public String deleteProduct() {
        return "DELETE";
    }
}
