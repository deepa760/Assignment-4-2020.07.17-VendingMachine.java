package VendingMachine;
import org.example.VendingMachine.Products.Product;

public class VendingMachineImpl implements VendingMachine{

    int[] denominations;
    Product[] products;
    int moneyPool;


    private Product[] theProducts = new Product[0];

    public VendingMachineImpl(Product[] theProducts) {
        super();
        this.theProducts = theProducts;
    }

    @Override
    public boolean addMoney(int money) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Product buy(int money, int prodNum) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int returnChange() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void presentProducts() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean addCurrency(int amount) {
        return false;
    }

    @Override
    public Product request(int money, int prodNum) {
        return null;
    }

    @Override
    public int getBalance() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void getDescription() {

    }

}