import java.util.ArrayList;

public class Account {
    private String accountName;
    private String uuid;
    private User holder;
    private ArrayList<Transaction> transactions;

    // Create new Account

    public Account(String accountName, User holder, Bank theBank) {
        this.accountName = accountName;
        this.holder = holder;

        // get new account UUID
        this.uuid = theBank.getNewAccountUUID();

        // get account transactions
        this.transactions = new ArrayList<Transaction>();

    }

    public String getUUID() {
        return this.uuid;
    }
}

