package bank.system;
import bank.interfaces.*;

public class Account implements BankElement {
    private String owner;
    private float balance;

    public Account(String owner, float balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }
    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public void accept(BankVisitor visitor) {
        visitor.visit(this);
    }
}