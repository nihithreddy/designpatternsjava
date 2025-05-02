package creational.abstractfactory.loan;

public class PersonalLoan implements Loan{
    private static final double interest = 10.5;

    @Override
    public double getInterestRate() {
        System.out.println("Personal Loan");
        return this.interest;
    }
}
