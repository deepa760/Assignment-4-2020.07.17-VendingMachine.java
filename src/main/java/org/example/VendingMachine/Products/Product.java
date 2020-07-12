package org.example.VendingMachine.Products;

//Super class
//#Using the Abstract class

public abstract class Product {
    protected int placeId;
    protected String name;
    protected int price;

    public Product(int placeId, String name, int price) {
        this.placeId = placeId;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }


//Abstract methods
    public abstract String examine();

    public abstract void use();

    abstract Product purchase(int money);
}