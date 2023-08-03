package sem6_class;

//// Без применения принципа SOLID
//class Animal {
//    String name;
//
//    Animal(String name) {
//        this.name = name;
//    }
//
//    void eat() {
//        System.out.println(name + " ест.");
//    }
//
//    void sleep() {
//        System.out.println(name + " спит.");
//    }
//
//    void makeSound() {
//        System.out.println(name + " издает звук.");
//    }
//}

// С применением принципа SOLID
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }
}


class AnimalFeeding {
    void eat(Animal animal) {
        System.out.println(animal.name + " ест.");
    }
}


class AnimalSleeping {
    void sleep(Animal animal) {
        System.out.println(animal.name + " спит.");
    }
}


class AnimalSounds {
    void makeSound(Animal animal) {
        System.out.println(animal.name + " издает звук.");
    }
}