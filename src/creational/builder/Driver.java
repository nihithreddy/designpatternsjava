package creational.builder;

import creational.builder.withoutpriorityfields.Car;

public class Driver {
    public static void main(String[] args) {
        //Constructing User Object with both required and optional fields
        User user1 = new User.Builder("nihith","reddy").setAge(24).setContact("1234567890").build();
        System.out.println(user1);

        //Constructing UserObject with out optional fields
        User user2 = new User.Builder("nihith","reddy").build();
        System.out.println(user2);

        //Constructing Car Object with out priority fields
        Car car = new Car.Builder().setColor("Orange").setEngine("300CC").setNumOfSeats(4).build();
        System.out.println(car);
    }
}
