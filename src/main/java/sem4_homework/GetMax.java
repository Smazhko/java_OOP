/*
Урок 4. ООП: Обобщения. ч1
Задача 3 (по желанию):Напишите обобщенную функцию getMax, которая принимает два параметра типа T и возвращает
максимальное значение из них.

    В этом примере мы объявляем обобщенную функцию getMax, которая принимает два параметра типа T, ограниченных
интерфейсом Comparable. Мы используем метод compareTo для сравнения значений и возвращаем максимальное значение из двух.
    В методе main мы вызываем getMax с разными типами данных: целое число (Integer), число с плавающей запятой (Double)
и строку (String). В результате мы получаем максимальные значения из каждой пары и выводим их на консоль.
    Обобщения позволяют нам писать универсальный код, который может работать с разными типами данных, сохраняя при этом
безопасность типов.
 */

package sem4_homework;

public class GetMax {
    public static <T extends Comparable<T>> T getMax(T value1, T value2){
        return value1.compareTo(value2) >= 0 ? value1 : value2;
    }

    public static void main(String[] args) {
        Integer intVal1 = 125;
        Integer intVal2 = 526;
        System.out.printf("Максимальное из %d и %d - %d.%n", intVal1, intVal2, getMax(intVal1, intVal2));

        intVal1 = 555;
        intVal2 = 555;
        System.out.printf("Максимальное из %d и %d - %d.%n", intVal1, intVal2, getMax(intVal1, intVal2));

        Double doubleVal1 = 3.141592654;
        Double doubleVal2 = 3.14;
        System.out.printf("Максимальное из %f и %f - %f.%n", doubleVal1, doubleVal2, getMax(doubleVal1, doubleVal2));

        String strVal1 = "Копейка";
        String strVal2 = "Рубль";
        System.out.printf("Максимальное из \"%s\" и \"%s\" - \"%s\".%n", strVal1, strVal2, getMax(strVal1, strVal2));

        strVal1 = "копейка";
        strVal2 = "Копейка";
        System.out.printf("Максимальное из \"%s\" и \"%s\" - \"%s\".%n", strVal1, strVal2, getMax(strVal1, strVal2));
    }
}

/*
Максимальное из 125 и 526 - 526.
Максимальное из 555 и 555 - 555.
Максимальное из 3,141593 и 3,140000 - 3,141593.
Максимальное из "Копейка" и "Рубль" - "Рубль".
Максимальное из "копейка" и "Копейка" - "копейка".
 */