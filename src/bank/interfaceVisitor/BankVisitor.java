package bank.interfaceVisitor;
import bank.system.*;

public interface BankVisitor {
    void visit(Account account);
    void visit(Loan loan);
}