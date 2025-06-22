package creational.prototype;

public class Driver {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"nihith",24,10000.0D);

        Employee employee2 = (Employee) employee1.clone();

        System.out.println(employee1 == employee2);

        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());
    }
}
