package sem7_class.task5_clonable;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("New York", "Broadway");
        Person originalPerson = new Person("John", 30, address);

        Person clonedPerson = originalPerson.copy();
        clonedPerson.getAddress().setStreet("5th Avenue"); // Изменение адреса у клонированного объекта

        System.out.println("Original Person: " + originalPerson.getName() + ", " + originalPerson.getAddress().getStreet());
        System.out.println("Cloned Person: " + clonedPerson.getName() + ", " + clonedPerson.getAddress().getStreet());
    }
}
