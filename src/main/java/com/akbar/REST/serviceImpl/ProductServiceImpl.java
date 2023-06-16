package com.akbar.REST.serviceImpl;

import com.akbar.REST.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public ResponseEntity<String> addNewProduct(Map<String, String> requestMap) {
        try {
            if (validateAddNewProduct(requestMap)){

            }else {
                return new ResponseEntity<String>("{\"message\":\""+"Invalid data ,"+"\" }", HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

        return new ResponseEntity<String>("{\"message\":\""+"Something Went Wrong,"+"\" }", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private boolean validateAddNewProduct(Map<String,String> requestMap){
        if (requestMap.containsKey("name") && requestMap.containsKey("price") && requestMap.containsKey("description")){
            return true;
        }
        return false;
    }
}
