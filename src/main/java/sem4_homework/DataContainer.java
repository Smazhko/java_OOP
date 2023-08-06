/*
Урок 4. ООП: Обобщения. ч1
Задача(по желанию. Режим - Героя): Напишите обобщенный класс DataContainer, который представляет собой контейнер для
хранения и обработки данных. Класс должен иметь методы для добавления и получения элементов, а также методы для
сортировки и вывода элементов.
    В этом примере мы создаем обобщенный класс DataContainer, который использует массив для хранения элементов типа T.
Класс имеет методы
* add для добавления элементов,
* get для получения элемента по индексу,
* sort для сортировки элементов с помощью переданного компаратора, и
* print для вывода элементов на консоль.
    В методе main мы создаем объект DataContainer для хранения строк.
* Мы добавляем несколько строк, выводим их на консоль с помощью метода print,
* затем сортируем элементы в обратном порядке с помощью лямбда-выражения в методе sort
* и снова выводим отсортированные элементы на консоль.
    Таким образом, обобщенные классы позволяют нам создавать универсальные контейнеры для хранения и обработки данных
любого типа, обеспечивая безопасность типов и гибкость в использовании.

https://ru.stackoverflow.com/questions/1226663/interface-comporator-как-использовать-в-параметрах-метода-java
*/

package sem4_homework;

import java.util.ArrayList;
import java.util.Comparator;

class DataContainer<E> {
    private ArrayList<E> data;

    public DataContainer() {
        data = new ArrayList<>();
        System.out.println("Новый dataContainer создан.");
    }

    public void add(E element) {
        data.add(element);
        System.out.println("Добавление нового элемента '"+ element + "' в dataContainer: УСПЕШНО.");
    }

    public E get(Integer index) {
        return data.get(index);
    }

    public void sort(Comparator<E> comparator) {
        data.sort(comparator);
        System.out.println("Сортировка dataContainer особым способом: УСПЕШНО.");
    }

    public void print() {
        StringBuilder outputLine = new StringBuilder();
        if (data.isEmpty()){
            outputLine.append("Список пуст, выводить нечего.");
        } else {
            outputLine.append("[");
            for (E item : data) {
                outputLine.append(item);
                outputLine.append(", ");
            }
            outputLine.delete(outputLine.length() - 2, outputLine.length());
            outputLine.append("]");
        }
        System.out.println("Содержимое dataContainer: \n" + outputLine);
    }

}

class DataContainerDemo {
    public static void main(String[] args) {
        DataContainer<String> strContainer = new DataContainer<>();

        strContainer.add("06. June");
        strContainer.add("07. July");
        strContainer.add("08. August");
        strContainer.add("09. September");
        strContainer.add("10. October");
        strContainer.add("11. November");
        strContainer.add("12. December");

        strContainer.print();
        strContainer.sort((o1, o2) -> o1.compareTo(o2) * -1);
        strContainer.print();
    }
}


/*
Новый dataContainer создан.
Добавление нового элемента '06. June' в dataContainer: УСПЕШНО.
Добавление нового элемента '07. July' в dataContainer: УСПЕШНО.
Добавление нового элемента '08. August' в dataContainer: УСПЕШНО.
Добавление нового элемента '09. September' в dataContainer: УСПЕШНО.
Добавление нового элемента '10. October' в dataContainer: УСПЕШНО.
Добавление нового элемента '11. November' в dataContainer: УСПЕШНО.
Добавление нового элемента '12. December' в dataContainer: УСПЕШНО.
Содержимое dataContainer:
[06. June, 07. July, 08. August, 09. September, 10. October, 11. November, 12. December]
Сортировка dataContainer особым способом: УСПЕШНО.
Содержимое dataContainer:
[12. December, 11. November, 10. October, 09. September, 08. August, 07. July, 06. June]
 */