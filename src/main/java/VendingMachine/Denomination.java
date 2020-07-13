package VendingMachine;
import org.example.VendingMachine.Products.Product;


       /* * I am using the ENUM method for constants of denominations*/



public enum Denomination {
    _1KR(1),
    _2KR(2),
    _5KR(5),
    _10KR(10),
    _20KR(20),
    _50KR(50),
    _100KR(100),
    _200KR(200),
    _500KR(500),
    _1000KR(1000);

    private int value;

    private Denomination(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.value + "It is denoted in the form of kr";
    }



}