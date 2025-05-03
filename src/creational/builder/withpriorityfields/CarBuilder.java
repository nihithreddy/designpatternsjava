package creational.builder.withpriorityfields;

public class CarBuilder implements Engine,SeatCapacity,Color {
    private String engine;
    private Integer numOfSeats;
    private String color;

    private CarBuilder(){}

    public static Engine getInstance(){
        return new CarBuilder();
    }

    @Override
    public SeatCapacity setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Color setSeats(Integer numOfSeats) {
        this.numOfSeats = numOfSeats;
        return this;
    }

    @Override
    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Car build(){
        return new Car(this);
    }


    public String getEngine() {
        return engine;
    }

    public Integer getNumOfSeats() {
        return numOfSeats;
    }

    public String getColor() {
        return color;
    }
}

