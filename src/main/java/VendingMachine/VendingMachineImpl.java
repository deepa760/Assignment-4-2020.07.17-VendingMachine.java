package VendingMachine;

import org.example.VendingMachine.Products.*;
public class VendingMachineImpl implements VendingMachine
{
    public int[] denominations = new int[]{1, 5, 10, 20, 50, 100, 500, 1000};
    Product[] PRODUCT = {
            new Drink("Lemonade", 25, "250 cl"),
            new Drink("Icetea", 42, "500 cl"),
            new Food("Delicious vegan dish", 85, 400),
            new Food("Tacos", 65, 302),
            new Snack("Dates", 37, 75),
            new Snack("Vegan proteinbar", 29, 50),
    };


    private int moneyPool;
    boolean addCurrency = true;

    public boolean addCurrency(int money) {
        for(int denomination : denominations) {
            if(denomination == money) {
                moneyPool = moneyPool + money;
                return true;
            }

        }
        return false;
    }



    public Product buy(int prodNum) {

        //please select one or more products - visa produkter samt nr de finns på
        //köparen trycker på det nummer som produkten visas på
        //returnera produkt

        Product bought = null;

        switch(prodNum) {
            case 1:
                bought = PRODUCT[0].purchase(moneyPool);
                break;
            case 2:
                bought = PRODUCT[1].purchase(moneyPool);
                break;
            case 3:
                bought = PRODUCT[2].purchase(moneyPool);
                break;
            case 4:
                bought = PRODUCT[3].purchase(moneyPool);
                break;
            case 5:
                bought = PRODUCT[4].purchase(moneyPool);
                break;
            case 6:
                bought = PRODUCT[5].purchase(moneyPool);
                break;
        }

        if(bought != null) {
            moneyPool = moneyPool - bought.getPrice();
        }
        return bought;
    }

    public int getBalance() {

        int change = moneyPool;
        moneyPool = 0;

        //print how much change
        //if moneyPool > 0, return change

        return change;
    }


    public String getProducts()
    {
      System.out.println("Get products");
      return "1";
}


    @Override
    public String getDescription() {
        System.out.println("Getting the product description");
        return null;
    }


    @Override
    public int endSession() {
        return 0;
    }


    public Product request(int number) {
        if(number > PRODUCT.length-1 || number < 0) {
            return null;
        }
        return PRODUCT[number];
    }

}