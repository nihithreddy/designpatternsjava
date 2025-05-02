package creational.abstractfactory.loan;

public class EducationalLoan implements Loan{
    private static final double interest = 7.5;

    @Override
    public double getInterestRate() {
        System.out.println("Educational Loan");
        return this.interest;
    }
}
