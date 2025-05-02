package creational.abstractfactory;

import creational.abstractfactory.bank.*;
import creational.abstractfactory.exception.WrongTypeException;


public class BankFactory implements AbstractFactory<Bank, BankType>{

    @Override
    public Bank create(BankType type) {
        switch(type){
            case AXIS: return new AxisBank();
            case HDFC: return new HDFCBank();
            case ICICI: return new ICICIBank();
            default: throw new WrongTypeException(type.toString());
        }
    }
}
