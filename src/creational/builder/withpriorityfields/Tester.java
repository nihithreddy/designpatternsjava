package creational.builder.withpriorityfields;

public class Tester {
    public static void main(String[] args) {
        //Constructing Car Object wih priority fields
        //Without building engine we cannot build seats
        //Without building seats we cannot build color
        //So fields should be built in the following order engine -> seats -> color

        Car car = CarBuilder.getInstance().setEngine("250cc").setSeats(5).setColor("blue").build();
        System.out.println(car);
    }
}
