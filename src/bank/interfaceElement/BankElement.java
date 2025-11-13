package bank.interfaceElement;

import bank.interfaceVisitor.BankVisitor;

public interface BankElement {
    void accept(BankVisitor visitor);
}