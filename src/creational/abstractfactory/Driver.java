package creational.abstractfactory;

import creational.abstractfactory.bank.Bank;
import creational.abstractfactory.bank.BankType;
import creational.abstractfactory.loan.Loan;
import creational.abstractfactory.loan.LoanType;

public class Driver {
    public static void main(String[] args) {
        AbstractFactory<Bank, BankType> bankFactory = AbstractFactoryProvider.getFactory(FactoryType.BANK);
        Bank bank = bankFactory.create(BankType.HDFC);
        System.out.println(bank.getBankName());

        AbstractFactory<Loan, LoanType> loanFactory = AbstractFactoryProvider.getFactory(FactoryType.LOAN);
        Loan loan = loanFactory.create(LoanType.HOME);
        System.out.println(loan.getInterestRate());
    }
}
