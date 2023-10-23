package sem7_class.task3_builder;

public class PersonBuilder {
    private Person person;

    public PersonBuilder() {
        person = new Person();
    }

    public PersonBuilder withFirstName(String firstName) {
        person.setFirstName(firstName);
        return this;
    }

    public PersonBuilder withLastName(String lastName) {
        person.setLastName(lastName);
        return this;
    }

    public PersonBuilder withAge(int age) {
        person.setAge(age);
        return this;
    }

    public PersonBuilder withAddress(String address) {
        person.setAddress(address);
        return this;
    }

    public PersonBuilder withPhoneNumber(String phoneNumber) {
        person.setPhoneNumber(phoneNumber);
        return this;
    }

    public Person build() {
        return person;
    }
}