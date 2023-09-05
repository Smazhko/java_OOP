package sem5_homework;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class UserModel {
    private File dataFile = new File("usersBase.txt");
    private HashMap<String, User> allUsersList;
    private User currentUser = null;

    /**
     * Сохранение базы пользователей из <i>Map</i> {@code allUsersList} в файл {@code usersBase}
     */
    public void saveBase() {
        if (!dataFile.exists()) {
            try {
                dataFile.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        if (dataFile.canWrite()) {
            try (FileWriter fwriter = new FileWriter(dataFile, false)) {
                for (var user : allUsersList.entrySet()) {
                    String login = user.getKey();
                    User curUser = user.getValue();
                    fwriter.write(login + ":" +
                            curUser.getPassword() + "," +
                            curUser.getName() + "\n");
                }
                fwriter.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }


    /**
     * <u>Загрузка базы</u> пользователей в <i>Map</i> {@code allUsersList}<br>
     * Формат базы:<br>
     * Каждый пользователь - в отдельной строке. Строка хранит данные в виде: {@code login : password, name}<br>
     * Формат HashMap:<br>
     * {String, User}, а именно {login, User}, т.к. логины - уникальны.
     */
    public void loadBase() {
        if (!dataFile.exists()) {
            try {
                dataFile.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

        if (dataFile.canRead()) {
            try {
                allUsersList = new HashMap<>();
                Scanner fileScanner = new Scanner(dataFile);
                while (fileScanner.hasNextLine()) {
                    String[] info = fileScanner.nextLine().split(":");
                    String login = info[0];
                    String[] userData = info[1].split(",");
                    User newUser = new User(login, userData[0], userData[1]);
                    allUsersList.put(login, newUser);
                }
                fileScanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("Не могу прочитать файл базы данных: " + dataFile.getPath() + dataFile.getName());
                e.printStackTrace();

            }
        }
    }


    /**
     * <u>Регистрация нового пользователя.</u>
     * Получает объект User, верифицирует логин, добавляет нового пользователя в
     * <i>Map</i> {@code allUsersList} и сохраняет в базу
     * @param newUser
     * @return <b>true</b> - если добавление удалось,<br>
     * <b>false</b> - если нет
     */
    public boolean registerNewUser(User newUser) {
        if (!isUserLoginExist(newUser.getLogin())) {
            allUsersList.put(newUser.getLogin(), newUser);
            saveBase();
            return true;
        } else {
            return false;
        }
    }

    /**
     * Проверка, есть ли логин в базе
     * @param login
     * @return <b>true</b> - если такой {@code login} есть в базе,<br>
     * <b>false</b> - если его нет
     */
    public boolean isUserLoginExist(String login) {
        return allUsersList.containsKey(login);
    }


    /**
     * Изменение пароля у ТЕКУЩЕГО пользователя с сохранением базы.
     * @param newPassword
     */
    public void changePassword(String newPassword){
        currentUser.setPassword(newPassword);
        saveBase();
    }


    /**
     * Изменение имени ТЕКУЩЕГО пользователя с сохранением базы.
     * @param newName
     */
    public void changeName(String newName){
        currentUser.setName(newName);
        saveBase();
    }


    /**
     * Удаление ТЕКУЩЕГО пользователя с сохранением базы.
     */
    public void deleteUser(){
        allUsersList.remove(currentUser.getLogin());
        currentUser = null;
        saveBase();
    }


    /**
     * Вход в систему
     * @param login
     * @param password
     * @return <b>0</b> - если логин и пароль совпали;<br>
     * <b>1</b> - если логина нет в системе;<br>
     * <b>2</b> - если пароль не совпал.
     */
    public int enterSystem(String login, String password) {
        if (isUserLoginExist(login)) {
            if (password.equals(allUsersList.get(login).getPassword())) {
                currentUser = allUsersList.get(login);
                return 0;   // 0 - если логин и пароль совпали
            } else {
                return 2;   // 2 - если пароль не совпал
            }
        } else{
            return 1;       // 1 - если логина нет в системе
        }
    }


    /**
     * Возврат Имени и Логина ТЕКУЩЕГО пользователя
     * @return
     */
    public String getcurrentUserInfo(){
        return currentUser.toString();
    }


    /**
     * Вывод на экран инфо ВСЕХ пользователей без пароля
     */
    public void getAllUsersInfo(){
        for(User user: allUsersList.values()){
            System.out.println("- " + user.toString());
        }
    }


    /**
     * Выход из залогиненного состояния - сброс ТЕКУЩЕГО пользователя
     */
    public void quitSystem(){
        currentUser = null;
    }
}

