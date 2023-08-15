package seminar_3.task_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Класс животного
class Animal implements Comparable<Animal> {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // Реализация метода compareTo из интерфейса Comparable
    @Override
    public int compareTo(Animal other) {
        // Сравниваем животных по их возрасту
        return Integer.compare(this.age, other.age);
    }

//    public interface Comparable<T> {
//        /**
//         * Сравнивает данный объект с указанным объектом для определения порядка.
//         *
//         * @param other объект для сравнения
//         * @return отрицательное целое число, ноль или положительное целое число,
//         *         если данный объект меньше, равен или больше указанного объекта.
//         */
//        int compareTo(T other);
//    }

    @Override
    public String toString() {
        return name + " (" + age + " years old)";
    }
}

public class AnimalComparatorExample {
    public static void main(String[] args) {
        // Создаем список животных
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Lion", 5));
        animals.add(new Animal("Elephant", 10));
        animals.add(new Animal("Giraffe", 7));

        // Сортируем животных с использованием интерфейса Comparable
        Collections.sort(animals);
        System.out.println("Сортировка с использованием Comparable (по возрасту):");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        // Создаем компаратор для сравнения животных по их именам
        Comparator<Animal> nameComparator = new Comparator<Animal>() {
            @Override
            public int compare(Animal animal1, Animal animal2) {
                return animal1.getName().compareTo(animal2.getName());
            }
        };

//        public interface Comparator<T> {
//            /**
//             * Сравнивает два объекта для определения порядка.
//             *
//             * @param obj1 первый объект для сравнения
//             * @param obj2 второй объект для сравнения
//             * @return отрицательное целое число, ноль или положительное целое число,
//             *         если obj1 меньше, равен или больше obj2.
//             */
//            int compare(T obj1, T obj2);

        // Сортируем животных с использованием компаратора
        Collections.sort(animals, nameComparator);
        System.out.println("\nСортировка с использованием Comparator (по имени):");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

    }
}
//
//public interface Comparator<T> {
//    /**
//     * Сравнивает два объекта для определения порядка.
//     *
//     * @param obj1 первый объект для сравнения
//     * @param obj2 второй объект для сравнения
//     * @return отрицательное целое число, ноль или положительное целое число,
//     *         если obj1 меньше, равен или больше obj2.
//     */
//    int compare(T obj1, T obj2);
//
//    /**
//     * Возвращает компаратор, который представляет собой композицию этого
//     * компаратора с другим компаратором. Если данный компаратор рассматривает
//     * объекты как равные, то вызов метода thenComparing() добавит логику
//     * сравнения с помощью другого компаратора.
//     *
//     * @param other компаратор для композиции
//     * @return композитный компаратор
//     */
//    default Comparator<T> thenComparing(Comparator<? super T> other) {
//        Objects.requireNonNull(other);
//        return (obj1, obj2) -> {
//            int cmp = compare(obj1, obj2);
//            return (cmp != 0) ? cmp : other.compare(obj1, obj2);
//        };
//    }
//
//    /**
//     * Возвращает компаратор, который представляет собой композицию этого
//     * компаратора с функцией, преобразующей объекты перед сравнением.
//     * То есть, сначала объекты преобразуются с помощью переданной функции,
//     * а затем происходит сравнение полученных результатов.
//     *
//     * @param keyExtractor функция для извлечения ключа из объекта
//     * @param <U> тип ключа
//     * @return композитный компаратор с функцией преобразования
//     */
//    default <U> Comparator<T> thenComparing(Function<? super T, ? extends U> keyExtractor) {
//        Objects.requireNonNull(keyExtractor);
//        Comparator<T> cmp = comparing(keyExtractor);
//        return thenComparing(cmp);
//    }
//
//    /**
//     * Возвращает компаратор, который представляет собой композицию этого
//     * компаратора с функцией, преобразующей объекты перед сравнением, и
//     * вспомогательным компаратором. То есть, сначала объекты преобразуются
//     * с помощью переданной функции, затем происходит сравнение полученных
//     * результатов с использованием вспомогательного компаратора.
//     *
//     * @param keyExtractor функция для извлечения ключа из объекта
//     * @param keyComparator компаратор для сравнения ключей
//     * @param <U> тип ключа
//     * @return композитный компаратор с функцией преобразования и вспомогательным компаратором
//     */
//    default <U> Comparator<T> thenComparing(Function<? super T, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
//        return thenComparing(comparing(keyExtractor, keyComparator));
//    }
//
//    /**
//     * Возвращает компаратор, который сравнивает объекты по их естественному
//     * порядку. Объекты должны реализовывать интерфейс Comparable для использования
//     * этого метода.
//     *
//     * @param <T> тип объектов для сравнения
//     * @return компаратор по естественному порядку
//     */
//    static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
//        return (obj1, obj2) -> obj1.compareTo(obj2);
//    }
//
//    /**
//     * Возвращает компаратор, который сравнивает объекты в обратном естественному
//     * порядке. Объекты должны реализовывать интерфейс Comparable для использования
//     * этого метода.
//     *
//     * @param <T> тип объектов для сравнения
//     * @return компаратор в обратном естественному порядку
//     */
//    static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
//        return (obj1, obj2) -> obj2.compareTo(obj1);
//    }
//
//    /**
//     * Возвращает компаратор, который сравнивает объекты с помощью метода сравнения
//     * по умолчанию для их классов.
//     *
//     * @param <T> тип объектов для сравнения
//     * @return компаратор по умолчанию
//     */
//    static <T> Comparator<T> comparing() {
//        return (obj1, obj2) -> 0;
//    }
//
//    /**
//     * Возвращает компаратор, который сравнивает объекты по значению их ключей,
//     * которые извлекаются с помощью переданной функции.
//     *
//     * @param keyExtractor функция для извлечения ключа из объекта
//     * @param <T> тип объектов для сравнения
//     * @param <U> тип ключа
//     * @return компаратор с функцией преобразования
//     */
//    static <T, U> Comparator<T> comparing(Function<? super T, ? extends U> keyExtractor) {
//        Objects.requireNonNull(keyExtractor);
//        return (obj1, obj2) -> {
//            U key1 = keyExtractor.apply(obj1);
//            U key2 = keyExtractor.apply(obj2);
//            return ((Comparable<? super U>) key1).compareTo(key2);
//        };
//    }
//
///**
// * Возвращает компаратор, который сравнивает объекты по значению их ключей,
// * которые извлекаются с помощью переданной функции, и использует вспомогательный
// * компаратор для сравнения ключей.
// *
// * @param keyExtractor функция для извлечения ключа из объекта
// * @param keyComparator компаратор для сравнения ключей
// * @param <T> тип объектов для сравнения
// * @param <U> тип ключа
// * @return компаратор с функцией преобразования и вспомогательным комп
