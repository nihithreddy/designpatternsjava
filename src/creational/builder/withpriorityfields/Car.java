package creational.builder.withpriorityfields;

public class Car {
    private final String engine;
    private final Integer numOfSeats;
    private final String color;

    public Car(CarBuilder carBuilder) {
        this.engine = carBuilder.getEngine();
        this.numOfSeats = carBuilder.getNumOfSeats();
        this.color = carBuilder.getColor();
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

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", numOfSeats=" + numOfSeats +
                ", color='" + color + '\'' +
                '}';
    }
}
