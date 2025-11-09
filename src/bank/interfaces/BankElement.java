package bank.interfaces;

public interface BankElement {
    void accept(BankVisitor visitor);
}