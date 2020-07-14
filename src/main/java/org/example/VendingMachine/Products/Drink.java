package org.example.VendingMachine.Products;

public class Drink extends Product {
    private String volume;
    public Drink(String name, int price, String volume) {
        super(name, price);
        this.volume = volume;
    }
    @Override
    String examine() {
        return getName() + " " + getVolume() + " " + getPrice();
    }
    @Override
    public void use() {
        System.out.println("What a refreshing " + getName() + " you just had!");
    }
    public String getVolume() {
        return volume;
    }
    public void setVolume(String volume) {
        this.volume = volume;
    }
}