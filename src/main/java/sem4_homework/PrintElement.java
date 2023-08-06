/*
Задача 1 : Напишите обобщенный метод printElement, который принимает один параметр типа T и выводит его на консоль.

    В этом примере мы объявляем обобщенный метод printElement, который принимает один параметр типа T. Мы просто выводим
этот элемент на консоль с помощью метода System.out.println().
    В методе main мы вызываем printElement с различными типами данных: целое число (Integer), строку (String) и число
с плавающей запятой (Double). Компилятор автоматически выводит тип параметра T на основе переданных аргументов.
    Таким образом, обобщенные методы позволяют нам писать код, который может работать с различными типами данных,
обеспечивая простоту и гибкость использования.
 */

package sem4_homework;

public class PrintElement {

    public static <T> void printElement (T elemToPrint) {
        System.out.println("Элемент класса " + elemToPrint.getClass().getSimpleName() + ": " + elemToPrint);
    }

    public static void main(String[] args) {
        Integer value1 = 123;
        Double value2 = 6.125;
        String value3 = "Gran Tourismo";
        Long value4 = 12313121L;
        Float value5 = 12.35f;

        printElement(value1);
        printElement(value2);
        printElement(value3);
        printElement(value4);
        printElement(value5);

    }
}

/*
Элемент класса Integer: 123
Элемент класса Double: 6.125
Элемент класса String: Gran Tourismo
Элемент класса Long: 12313121
Элемент класса Float: 12.35
 */