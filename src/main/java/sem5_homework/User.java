package sem5_homework;

// пустой класс пользователя с полями и БЕЗ функционала
public class User {

    private String name;
    private String login;
    private String password;

    public User(String login, String password, String name) {
        this.login = login;
        this.password = password;
        this.name = name;
    }

    public User(String login, String password) {
        this (login, password, "");
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return  name + " (" + login + ")";
    }
}
