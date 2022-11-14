import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // initialize bank
        Bank theBank = new Bank("Bank of KLE");

        // add a user which also creates a savings account

        User aUser = new User("Steve","Lodge","1234",theBank);

        Account newAcc = new Account("Current", aUser, theBank);

        aUser.addAccount(newAcc);
        theBank.addAccount(newAcc);

    }
}
