/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seccionb;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class ShoppingCart {
    
    private List<ProductInterface> products;
    
    public void addProduct(ProductInterface product){
        products.add(product);
    }
    
    public void removeProduct(ProductInterface product){
        products.remove(product);
    }
    
    
    
}
