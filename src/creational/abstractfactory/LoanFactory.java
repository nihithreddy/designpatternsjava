package creational.abstractfactory;

import creational.abstractfactory.exception.WrongTypeException;
import creational.abstractfactory.loan.*;

public class LoanFactory implements AbstractFactory<Loan, LoanType>{

    @Override
    public Loan create(LoanType type) {
        switch(type){
            case HOME: return new HomeLoan();
            case EDUCATIONAL: return new EducationalLoan();
            case PERSONAL: return new PersonalLoan();
            default: throw new WrongTypeException(type.toString());
        }
    }
}
