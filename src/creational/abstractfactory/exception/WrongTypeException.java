package creational.abstractfactory.exception;

public class WrongTypeException extends RuntimeException{
    public WrongTypeException(String type){
        super("WrongType Exception: "+type+" not found");
    }
}
