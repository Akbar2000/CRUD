package com.akbar.REST.service;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface ProductService {

    public ResponseEntity<String> addNewProduct(Map<String,String> requestMap);
}
