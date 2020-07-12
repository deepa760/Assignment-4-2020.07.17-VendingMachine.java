package org.example.VendingMachine.Products;

//Using Inheritance
public class Food extends Product {
    private String weight;

    public Food(int placeId, String name, int price, String weight) {
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
        // TODO Auto-generated method stub
        return null;
    }
}

