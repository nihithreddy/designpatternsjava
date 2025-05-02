package creational.abstractfactory.bank;

public class AxisBank implements Bank{

    private String name;

    public AxisBank(){
        this.name = "Axis";
    }

    @Override
    public String getBankName() {
        return this.name;
    }
}
