package creational.abstractfactory.bank;

public class ICICIBank implements Bank{

    private String name;

    public ICICIBank(){
        this.name = "ICICI";
    }

    @Override
    public String getBankName() {
        return this.name;
    }
}
