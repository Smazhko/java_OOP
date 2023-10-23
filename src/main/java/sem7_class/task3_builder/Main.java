package sem7_class.task3_builder;

public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .withFirstName("John")
                .withLastName("Doe")
                .withAge(30)
                .withAddress("123 Main St")
                .withPhoneNumber("555-1234")
                .build();

        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Phone Number: " + person.getPhoneNumber());
    }
}
