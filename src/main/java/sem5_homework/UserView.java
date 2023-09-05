package sem5_homework;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/*
 НАЗНАЧЕНИЕ КЛАССА (В МОДЕЛИ MVP):
 отображение данных для пользователя,
 обработка пользовательского ввода,
 не содержит бизнес-логики,
 только отображает данные, полученные от презентера,
 передает пользовательский ввод обратно презентеру.
*/

public class UserView extends ColoredConsole{

    private String[] mainMenuLines = new String[]{
            "Войти в систему",
            "Зарегистрироваться",
            "Вывести список пользователей (GOD MODE)",
            "Выйти из программы"
    };


    private String[] userMenuLines = new String[]{
            "Изменить имя",
            "Изменить пароль",
            "Выйти из учётной записи",
            "Удалить учётную запись",
            "Выйти из программы"
    };

    private static final String REGEX_LOGIN = "[\\w\\-\\_]+";
    private static final String REGEX_PASSWORD = "[\\w\\-\\_]+";
    private static final String REGEX_NAME = "[a-zA-Zа-яёА-ЯЁ0-9\\-\\_]+";


    private Integer menuSelection(String[] menu, String title) {
        printTitle(title);
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy (EEE), HH:mm");

        System.out.println(ANSI_LIGHT + ANSI_WHITE + dateFormat.format(new Date()) + ANSI_DEFAULT);

        for (int i = 0; i < menu.length; i++) {
            System.out.printf("[ %d ]  %s %n", i + 1, menu[i]);
        }

        return Integer.parseInt(controlledInput("Выберите действие", "[1-" + menu.length + "]"));
    }


    public String[] getRegistrationInfo() {
        printTitle("РЕГИСТРАЦИЯ НОВОГО ПОЛЬЗОВАТЕЛЯ");
        System.out.println("Придумайте уникальные данные для входа.");
        String login    = controlledInput("Логин ", REGEX_LOGIN);
        String password = controlledInput("Пароль", REGEX_PASSWORD);
        String name     = controlledInput("Имя   ", REGEX_NAME);

        return new String[]{login, password, name};
    }


    public String[] getLoginInfo() {
        printTitle("ВХОД В СИСТЕМУ");
        String login    = controlledInput("Логин ", REGEX_LOGIN);
        String password = controlledInput("Пароль", REGEX_PASSWORD);
        return new String[]{login, password};
    }


    public void allUsersTitle(){
        printTitle("СПИСОК ВСЕХ ПОЛЬЗОВАТЕЛЕЙ");
    }


    public String getNewPassword() {
        printTitle("ИЗМЕНЕНИЕ ПАРОЛЯ");
        System.out.println("Возможно использование латиницы, цифр, знаков \"-\" и \"_\"");
        return controlledInput("Введите новый пароль", REGEX_PASSWORD);
    }

    public String getNewName() {
        printTitle("ИЗМЕНЕНИЕ ИМЕНИ");
        System.out.println("Возможно использование латиницы, кириллицы, цифр, знаков \"-\" и \"_\"");
        return controlledInput("Введите новое отображаемое имя", REGEX_NAME);
    }

    public boolean getDeletingAgree() {
        printTitle("!!!   УДАЛЕНИЕ ПОЛЬЗОВАТЕЛЯ   !!!");
        printError("Вы уверены в том, что хотите удалить учётную запись? (0 - нет, 1 - да)");

        return controlledInput("Выберите действие", "[01]").equals("1");
        // вернёт true если ==1 и false в других случаях
    }

    public Integer getUserMenuChoise(String userName){
        return menuSelection(userMenuLines, "Привет, " + userName + "!");
    }

    public Integer getMainMenuChoise(){
        return menuSelection(mainMenuLines, "ГЛАВНОЕ МЕНЮ");
    }

    private String controlledInput(String message, String regEx){
        Scanner inputStr = new Scanner(System.in);
        boolean continueFlag = true;
        String userInput = null;

        while (continueFlag) {
            System.out.print(ANSI_YELLOW + ANSI_ITALIC + message + " > " + ANSI_DEFAULT);
            userInput = inputStr.nextLine();
            if (userInput.matches(regEx)) {
                continueFlag = false;
            } else {
                printError("Некорректный ввод. Попробуйте ещё раз.");
            }
        }
        return userInput;
    }

    private void printTitle(String title) {
        String borderColor = ANSI_BRIGHT_BLUE + ANSI_BOLD;
        String textColor = ANSI_BRIGHT_GREEN + ANSI_BOLD;
        System.out.println();
        System.out.println(borderColor + "╓" + "─".repeat(title.length() + 2) + "╖");
        System.out.println("║ " + textColor + title + borderColor + " ║");
        System.out.println("╙" + "─".repeat(title.length() + 2) + "╜" + ANSI_DEFAULT);
    }

    private void printMessage(String message) {
        System.out.println(ANSI_BRIGHT_BLUE + message + ANSI_DEFAULT);
    }

    private void printError(String message) {
        System.out.println(ANSI_BRIGHT_RED + "<< ! >> " + message + ANSI_DEFAULT);
    }

    public void sayBye() {
        printTitle("ДО ВСТРЕЧИ ОНЛАЙН!");
    }

    public void sayRegSuccessful() {
        printMessage("Новый пользователь успешно зарегистрирован в системе!");
    }

    public void sayChangeNameSuccessful() {
        printMessage("Имя текущего пользователя успешно изменено!");
    }

    public void sayChangePswrdSuccessful() {
        printMessage("Пароль текущего пользователя успешно изменен!");
    }

    public void sayUserDeletingSuccessful() {
        printError("Пользователь успешно удалён!");
    }

    public void sayUserIsAbsent() {
        printError("Пользователь с таким логином не зарегистрирован в системе.");
    }

    public void sayLoginExist() {
        printError("Пользователь с таким логином уже зарегистрирован в системе.");
    }

    public void sayWrongPassword() {
        printError("Введен неверный пароль.");
    }

}
