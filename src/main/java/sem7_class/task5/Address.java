// ПРИМЕР ИСПОЛЬЗОВАНИЯ СОБСТВЕННОРУЧНОГО КЛОНИРОВАНИЯ ОБЪЕКТОВ

package sem7_class.task5;


public class Address {
    private String city;
    private String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    // Создаем копию объекта Address
    public Address copy() {
        return new Address(this.city, this.street);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}


