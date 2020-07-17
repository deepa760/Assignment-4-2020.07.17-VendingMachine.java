package org.example.VendingMachine.model;

import org.example.VendingMachine.Product;

public class Candy extends Product {
    public Candy(int price, String productName, String productCalories, int productNumber, String allergens) {
        super(price, productName, productCalories, productNumber, allergens);
    }

    @Override
    public String examine(){
        return "-------------------PRODUCT INFO-------------------\nName: "+getProductName()+"\nCalories: "+getProductCalories()
                +"\nPrice: "+getPrice()+"\nAllergens: "+getAllergens()+"\nProduct number: "+getProductNumber();
    }

    @Override
    public String useProduct(){
        return "You eat your "+getProductName()+"...";
    }
}