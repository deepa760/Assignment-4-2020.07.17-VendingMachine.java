package org.example.VendingMachine;
import org.example.VendingMachine.Product;
import org.example.VendingMachine.model.Beverage;
import org.example.VendingMachine.model.Candy;
import org.example.VendingMachine.model.Food;

public class App {

    private static UseVendingMachine test2;

    public static void main(String[] args) {


        Product[] test = new Product[3];
        Product coke = new Beverage(15, "Coca-Cola", "139",1, "No known allergens.");
        Product snickers = new Candy(10, "Snickers chocolate bar", "488", 2,"Peanuts, may contain traces of Almonds.");
        Product chickenBLT = new Food(25, "Chicken BLT sandwich", "540", 3,"Egg, Milk, Soy and Wheat");
        test[0] = coke;
        test[1] = snickers;
        test[2] = chickenBLT;
        test2 = new UseVendingMachine(test);
        test2.choose(test2);
    }
}


