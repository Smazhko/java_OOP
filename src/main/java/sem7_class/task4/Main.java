package sem7_class.task4;


public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        Animal clonedCat = cat.clone();
        Animal clonedDog = dog.clone();

        cat.makeSound(); // Выведет: Meow!
        dog.makeSound(); // Выведет: Woof!
        clonedCat.makeSound(); // Выведет: Meow!
        clonedDog.makeSound(); // Выведет: Woof!
    }
}
