import java.util.Date;

public class Transaction {

    private String memo;
    private double amount;
    private Date timestamp;
    private Account inAccount;

    public Transaction(double amount, Account inAccount){
        this.amount = amount;
        this.inAccount = inAccount;
        this.timestamp = new Date();
        this.memo = "";
    }
    public Transaction(double amount, Account inAccount, String memo){
        this(amount,inAccount);
        this.memo = memo;

    }
}
