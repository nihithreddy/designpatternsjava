package creational.abstractfactory;

import creational.abstractfactory.exception.WrongTypeException;

public class AbstractFactoryProvider {
    public static AbstractFactory getFactory(FactoryType factoryType){
        switch(factoryType){
            case BANK: return new BankFactory();
            case LOAN: return new LoanFactory();
            default: throw new WrongTypeException(factoryType.toString());
        }

    }
}
