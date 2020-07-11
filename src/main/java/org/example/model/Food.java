package org.example.model;
import org.example.model.Product;

public class Food extends Product
{
    private String foodtype;
    private String taste;
    private int weight;


    public Food(int id, String name, int price, int weight, String foodtype, String taste) {
        super(id, name, price);
        this.foodtype = foodtype;
        this.taste = taste;
        this.weight = weight;
    }

    @Override
    public String Examine() {
        String productData = "Food: "+ super.getName() + " (" + foodtype + ") with "+ taste + " " + weight + " g " + super.getPrice() + " kr ";
        return productData;
    }

    @Override
    public String Use() {
        return "Eating " + super.getName() +" eat...";
    }

    @Override
    public String toString() {
        return super.getName() + " " + weight + " g " + super.getPrice() + " kr ";
    }

}