package com.akbar.REST.restImpl;

import com.akbar.REST.rest.ProductRest;
import com.akbar.REST.service.ProductService;
import com.akbar.REST.serviceImpl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ProductRestImpl implements ProductRest {

    @Autowired
    ProductService productService;

//    ProductService product = new ProductServiceImpl();
    @Override
    public ResponseEntity<String> addNewProduct(Map<String, String> requestMap) {
        try {
            return productService.addNewProduct(requestMap);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return new ResponseEntity<String>("{\"message\":\""+"Something Went Wrong at Product Service Impl,"+"\" }", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
