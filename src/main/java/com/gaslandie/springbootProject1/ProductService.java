package com.gaslandie.springbootProject1;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ProductService {
    ProductDB db;
    public void addProduct(Product p){
        db.save(p);
    }

    public List<Product> getAllProducts(){
        return db.findAll();
    }

    // public Product getProduct(String name){
    //     for(Product p : products){
    //         if(p.getName().equals(name))
    //             return p;
    //     }
    //     return null;
    // }
}
