package org.example.VendingMachine.Products;

//Using Inheritance

public class Food extends Product {

    private int calories;


    public Food(String name, int price, int calories) {
        super(name, price);
        this.calories = calories;
    }


    @Override
    String examine() {
        return getName() + " " + getCalories() + " " + getPrice();
    }

    @Override
    public void use() {
        System.out.println("Now you are not hungry anymore!");
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }


}
