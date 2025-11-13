package bank.system;
import bank.interfaceElement.BankElement;
import bank.interfaceVisitor.BankVisitor;

public class Loan implements BankElement {
    private String borrower;
    private float amount;

    public Loan(String borrower, float amount) {
        this.borrower = borrower;
        this.amount = amount;
    }

    public String getBorrower() {
        return borrower;
    }
    public float getAmount() {
        return amount;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public void accept(BankVisitor visitor) {
        visitor.visit(this);
    }
}