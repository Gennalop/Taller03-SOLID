/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.seccionb;

/**
 *
 * @author Usuario
 */
public class DigitalProduct implements ProductInterface{
    
    private String name;
    private double price;

    public DigitalProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
    
    
}
