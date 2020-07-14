package VendingMachine;

import java.util.Scanner;
import org.example.VendingMachine.Products.Product;
import org.example.VendingMachine.Products.Drink;
import org.example.VendingMachine.Products.Food;
import org.example.VendingMachine.Products.Snack;


/**
 * Vending machine
 *
 */

public class App
{
    public static void main( String[] args )
    {
        VendingMachine vm = new VendingMachineImpl();
        vm.addCurrency (500);
        vm.getBalance();
    }
}