package sem5_class;

import java.util.Scanner;

public class CalcView {    // Отображает данные для пользователя и отвечает за взаимодействие с пользователем

    Scanner in = new Scanner(System.in);

    public int userInput() {
        System.out.print("Введите число: ");
        return in.nextInt();
    }

    public void showOutput(int value) {
        System.out.print("Результат: " + value);
    }

    public char chooseOperation() {
        System.out.print ("Введите операцию (+, -, /, *) или введите Q (выход из программы): ");
        return in.next().charAt(0);
    }

}