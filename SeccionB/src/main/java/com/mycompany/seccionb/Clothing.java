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
public class Clothing implements ProductInterface,IvaCalculator {

    private String name;
    private double price;
    private double weight;

    public Clothing(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
    
        @Override
    public String getName() {
        return name;
    }


    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double calulateIVA(ProductInterface product) {
        return price * 0.12;
    }
    
}
