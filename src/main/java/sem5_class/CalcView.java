package sem5_class;

import java.util.Scanner;

public class CalcView {    // Отображает данные пользователю, и отвечает за взаимодействие с пользователем

    Scanner in = new Scanner(System.in);

    public int userInput() {
        System.out.println("Введите число: ");
        return in.nextInt();
    }

    public void showOutput(int value) {
        System.out.print("Результат: " + value);
    }

    public char chooseOperation() {
        System.out.println("Введите операцию (+, -, /, *): ");
        return in.next().charAt(0);
    }

}