package creational.builder;

public class User {
    private final String firstName;// Required field
    private final String lastName; // Required field
    private final String contact;//Optional field
    private final int age;//Optional field

    private User(Builder userBuilder){
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.contact = userBuilder.contact;;
        this.age = userBuilder.age;
    };

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getContact() {
        return contact;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contact='" + contact + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Builder{
        private final String firstName;// Required field
        private final String lastName; // Required field
        private String contact;//Optional field
        private int age;//Optional field

        public Builder(String firstName,String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder setContact(String contact){
            this.contact = contact;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
