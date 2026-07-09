package TASK3_ATMInterface;

public class Main {

    public static void main(String[] args) {

        // Initial Balance = ₹10000
        BankAccount account = new BankAccount(10000);

        ATM atm = new ATM(account);

        atm.start();

    }

}
