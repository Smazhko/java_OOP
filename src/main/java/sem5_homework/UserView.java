package sem5_homework;

import java.util.Scanner;
/*
 НАЗНАЧЕНИЕ КЛАССА (В МОДЕЛИ MVP):
 отображение данных для пользователя,
 обработка пользовательского ввода,
 не содержит бизнес-логики,
 только отображает данные, полученные от презентера,
 передает пользовательский ввод обратно презентеру.
*/

public class UserView {
    private Scanner inputStr = new Scanner(System.in);

    private String[] startMenu = new String[]{
            "Войти в систему",
            "Зарегистрироваться",
            "Выйти из программы"
    };


    private String[] userMenu = new String[]{
            "Изменить имя",
            "Изменить пароль",
            "Выйти из учётной записи",
            "Удалить учётную запись",
            "Выйти из программы"
    };


    public Integer showMainMenu() {
        printMessage("ДОБРО ПОЖАЛОВАТЬ!");
        return menuSelection(startMenu);
    }


    public void showRegistrationForm() {
        printMessage("РЕГИСТРАЦИЯ НОВОГО ПОЛЬЗОВАТЕЛЯ");
        System.out.print("Отображаемое имя:  ");
        String name = inputStr.nextLine();
        System.out.print("%nПридумайте логин:  ");
        String login = inputStr.nextLine();
        System.out.print("%nПридумайте пароль: ");
        String password = inputStr.nextLine();
    }


    public String[] showLoginForm() {
        printMessage("ВХОД В СИСТЕМУ");
        String login = "";
        String password = "";

        return new String[]{login, password};
    }


    public Integer showUserMenu(User currentUser) {
       printMessage("Привет, " + currentUser.getName() + "(login: " + currentUser.getLogin() + ")");
       return menuSelection(userMenu);
    }


    public void showPassChangeForm() {
        System.out.println("ИЗМЕНЕНИЕ ПАРОЛЯ");
        System.out.print("Введите новый пароль: ");
        String newPassword = inputStr.nextLine();
        System.out.println();

    }


    public void showUserInfo() {

    }


    public void deleteCurrentUser() {

    }


    public String userInput() {
        return "";
    }


    public String passwordInput() {
        return "";
    }


    private static void printMessage(String message) {
        System.out.println("┌" + "─".repeat(message.length() + 2) + "┐");
        System.out.println("│ " + message + " │");
        System.out.println("└" + "─".repeat(message.length() + 2) + "┘");
    }


    public Integer menuSelection(String[] menu){
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("[ %d ]  %s %n", i + 1, menu[i]);
        }
        System.out.print("Выберите действие: ");
        String userInput = inputStr.nextLine();

        while (!userInput.matches("[1-" + menu.length + "]")) {
            System.out.print("Некорректный ввод. Попробуйте ещё раз: ");
            userInput = inputStr.nextLine();
        }
        return Integer.parseInt(userInput);
    }
}
