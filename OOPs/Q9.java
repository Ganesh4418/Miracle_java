import java.util.*;
public class Abstraction{

    public static void main(String[] args) {
        Atm a = new Transaction();
        a.withdraw();
        a.balance();
    }
}

abstract class Atm {
    int balance=50000;
    int withdrawal=10000;
    abstract void balance();

    void withdraw() {
        System.out.println("Available: "+balance);
        System.out.println("Withdrawn: "+withdrawal);
    }
}
class Transaction extends Atm {
    void balance() {
        System.out.println("Balance: "+(balance-withdrawal));
    }
}
