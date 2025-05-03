package creational.builder.withoutpriorityfields;

public class Car {
    //All are optional fields
    private final String color;
    private final String engine;
    private final Integer numOfSeats;

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public Integer getNumOfSeats() {
        return numOfSeats;
    }

    private Car(Builder carBuilder){
        this.color = carBuilder.color;
        this.engine = carBuilder.engine;
        this.numOfSeats = carBuilder.numOfSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", numOfSeats=" + numOfSeats +
                '}';
    }

    public static class Builder{
        private String color;
        private String engine;
        private Integer numOfSeats;

        public Builder setColor(String color){
            this.color = color;
            return this;
        }

        public Builder setEngine(String engine){
            this.engine = engine;
            return this;
        }

        public Builder setNumOfSeats(Integer numOfSeats){
            this.numOfSeats = numOfSeats;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
