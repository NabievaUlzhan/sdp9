package bank;
import bank.interfaces.*;
import bank.system.*;

public class Main {
    public static void main(String[] args) {
        BankElement accUlzhan = new Account("Ulzhan", 3000);
        BankElement loanAdam = new Loan("Adam", 1000);

        BankVisitor reportVisitor = new ReportVisitor();

        accUlzhan.accept(reportVisitor);
        loanAdam.accept(reportVisitor);
    }
}