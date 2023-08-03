/*
Нет, в именах пакетов нельзя использовать нижнее подчеркивание.
Правила именования пакетов в Java требуют, чтобы имена пакетов состояли только из букв в
нижнем регистре, цифр и точек. Подчеркивание не допускается в именах пакетов.

Имена пакетов обычно используют доменное имя в обратном порядке в качестве
префикса для уникальности. Например, com.example.myproject.

Правильные примеры имен пакетов:

com.example.myproject
org.apache.commons
java.util
com.company.product
Неправильные примеры имен пакетов (с использованием нижнего подчеркивания):

com_example_myproject (недопустимо)
org_apache_commons (недопустимо)
com.example.my_project (недопустимо)
Пожалуйста, обратите внимание, что имена пакетов являются частью идентификаторов и
должны соответствовать стандартам именования и правилам Java для идентификаторов.

Пакеты именуют только маленькими_буквами с использованием подчеркивания для связи слов.

Например:

package io.khasang.java.big_lesson;
*/

package sem5_class;

public class Main {
    public static void main(String[] args) {
        CalcModel model = new CalcModel();
        CalcView view = new CalcView();
        CalcController controller = new CalcController(model, view);
        controller.select();
    }
}


/*
ПОЛЕЗНОЕ

https://www.youtube.com/watch?v=_uZQtRyF6Eg
 */