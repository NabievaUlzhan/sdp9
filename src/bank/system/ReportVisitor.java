package bank.system;
import bank.interfaces.BankVisitor;

public class ReportVisitor implements BankVisitor {
    @Override
    public void visit(Account account) {
        System.out.println("Account owner: " + account.getOwner() +
                ", Balance: $" + account.getBalance());
    }

    @Override
    public void visit(Loan loan) {
        System.out.println("Loan borrower: " + loan.getBorrower() +
                ", Amount: $" + loan.getAmount());
    }
}