package org.example.model;


public class Snack extends Product {

    private int sugarPercent;


    public Snack(String name, int price, int sugarPercent) {
        super(name, price);
        this.sugarPercent = sugarPercent;
    }



    @Override
    String examine() {
        return getName() + " " + getSugarPercent() + " " + getPrice();
    }


    @Override
    public void use() {
        System.out.println("No more sugarcravings for you!");

    }

    public int getSugarPercent() {
        return sugarPercent;
    }

    public void setSugarPercent(int sugarPercent) {
        this.sugarPercent = sugarPercent;
    }


}