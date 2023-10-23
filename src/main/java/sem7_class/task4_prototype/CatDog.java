package sem7_class.task4_prototype;

class Cat implements Animal {
    @Override
    public Animal clone() {
        return new Cat();
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}


class Dog implements Animal {
    @Override
    public Animal clone() {
        return new Dog();
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
