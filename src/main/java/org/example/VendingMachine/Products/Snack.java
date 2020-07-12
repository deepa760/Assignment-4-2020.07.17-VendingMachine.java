package org.example.VendingMachine.Products;


public class Snack extends Product{
    private String weight;

    public Snack(int placeId, String name, int price, String weight) {
        super(placeId, name, price);
        this.weight = weight;
    }



    @Override
    public String toString() {
        return 	super.getPlaceId() + "\t \t" + super.getName() + "\t" + weight + "\t" + super.getPrice() + " Sek";
    }


    @Override
    public String examine() {
        return "\nExamine: " + super.getName() +  "\t \t" + super.getPrice() + " Sek";
    }


    @Override
    public void use() {
        System.out.println("\nEating my " + super.getName());
    }


    @Override
    Product purchase(int money) {

        return null;
    }

}
