package VendingMachine;

import org.example.VendingMachine.Products.Product;

public interface VendingMachine {
    boolean addCurrency (int amount);
    Product  request(int money, int prodNum);
    int getBalance ();
    void getDescription();

}