package com.akbar.REST.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping(path="/product")
@CrossOrigin(origins="*")
public interface ProductRest {

    @PostMapping(path = "/addNewProduct")
    public ResponseEntity<String> addNewProduct(@RequestBody(required = true)  Map<String,String> requestMap);

}
