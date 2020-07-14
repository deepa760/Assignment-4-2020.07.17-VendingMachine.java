package VendingMachine;

import org.example.VendingMachine.Products.Product;
//An interfaceVendingMachine should be created that defines the following methods
public interface VendingMachine {

    boolean addCurrency (int amount);
    Product  request(int  productNumber);
    int getBalance ();
    String getDescription();
    int endSession ();
    String getProducts ();




}



