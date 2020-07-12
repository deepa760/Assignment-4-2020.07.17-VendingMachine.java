package org.example.VendingMachine.Products;

public class Drink extends Product {
    private String volume;

    public Drink(int placeId, String name, int price, String volume) {
        super(placeId, name, price);
        this.volume = volume;
    }


    @Override
    public String toString() {
        return 	super.getPlaceId() + "\t \t" + super.getName() + "\t" + volume + "\t" + super.getPrice() + " Sek";
    }

    @Override
    public String examine() {
        return "\nExamine: " + super.getName() +  "\t \t" + super.getPrice() + " Sek";
    }


    @Override
    public void use() {
        System.out.println("\nDrinking my " + super.getName());
    }


    @Override
    Product purchase(int money) {

        return null;
    }

}
