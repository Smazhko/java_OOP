/*
Урок 4. ООП: Обобщения. ч1
Задача 2 : Напишите обобщенный метод printArray, который принимает массив любого типа и выводит его элементы на консоль.
    В этом примере мы объявляем обобщенный метод printArray, который принимает массив типа T. Затем мы используем цикл
for-each, чтобы пройти по всем элементам массива и вывести их на консоль.
    В методе main мы создаем массивы типов Integer и String и вызываем printArray для каждого из них. В результате мы
получаем вывод на консоль элементов каждого массива.
    Таким образом, обобщенные методы позволяют нам создавать код, который может работать с разными типами данных,
обеспечивая повторное использование и гибкость.

Полезные материалы
https://metanit.com/java/tutorial/3.11.php
*/

package sem4_homework;

public class PrintArray {

    public static <T> void printArray(T[] arrayToPrint){
        System.out.printf("Массив из %d элементов типа %s:%n", arrayToPrint.length, arrayToPrint[0].getClass().getSimpleName());
        StringBuilder outputLine = new StringBuilder();
        outputLine.append("[");
        for(T item: arrayToPrint){
            outputLine.append(item);
            outputLine.append(", ");
        }
        outputLine.delete(outputLine.length() - 2, outputLine.length());
        outputLine.append("]");
        System.out.println(outputLine);
    }

    public static void main(String[] args) {
        Integer[] arrayOfInt = new Integer[] {12, 54, 81, 32, 99};
        String[] arrayOfStr = new String[] {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};

        printArray(arrayOfInt);
        printArray(arrayOfStr);

    }
}

/*
Массив из 5 элементов типа Integer:
[12, 54, 81, 32, 99]
Массив из 7 элементов типа String:
[Понедельник, Вторник, Среда, Четверг, Пятница, Суббота, Воскресенье]
 */