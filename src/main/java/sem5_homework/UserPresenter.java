package sem5_homework;
/*
 НАЗНАЧЕНИЕ КЛАССА (В МОДЕЛИ MVP) - связывает модель и представление.
 > получает пользовательский ввод из представления,
 > обрабатывает его и обновляет модель.
 > Затем получает обновленные данные из модели
 > передает их обратно представлению для отображения.

 Презентер также может:
 > обрабатывать другие события
 > обновлять представление соответствующим образом.
*/


public class UserPresenter {
    UserModel model;
    UserView view;

    public UserPresenter(UserView view, UserModel model) {
        this.model = model;
        this.view = view;
        model.loadBase();
    }

    public void startMenu(){
        boolean continueFlag = true;
        while (continueFlag){
            switch (view.getMainMenuChoise()){
                case 1:
                    //"Войти в систему"
                    userEntering(); // вынесено в отдельный метод
                    break;
                case 2:
                    // "Зарегистрироваться"
                    userRegistriation(); // вынесено в отдельный метод
                    break;
                case 3:
                    view.allUsersTitle();
                    model.getAllUsersInfo();
                    break;
                case 4:
                    // "Выйти из программы"
                    view.sayBye();
                    continueFlag = false;
                    break;
            }
        }
    }

    private void userMenu(){
        boolean continueFlag = true;
        while (continueFlag){
            switch (view.getUserMenuChoise(model.getcurrentUserInfo())){
                case 1:
                    // "Изменить имя",
                    model.changeName(view.getNewName());
                    view.sayChangeNameSuccessful();
                    break;
                case 2:
                    // "Изменить пароль",
                    model.changePassword(view.getNewPassword());
                    view.sayChangePswrdSuccessful();
                    break;
                case 3:
                    // "Выйти из учётной записи",
                    model.quitSystem();
                    continueFlag = false;
                    break;
                case 4:
                    //"Удалить учётную запись",
                    if(view.getDeletingAgree()){
                        model.deleteUser();
                        continueFlag = false;
                        view.sayUserDeletingSuccessful();
                    }
                    break;
                case 5:
                    //"Выйти из программы"
                    view.sayBye();
                    continueFlag = false;
                    System.exit(0);
                    break;
            }
        }
    }


    /**
     * Создание нового пользователя в базе
     */
    public void userRegistriation(){
        String[] userInfo = view.getRegistrationInfo();
        String login    = userInfo[0];
        String password = userInfo[1];
        String name     = userInfo[2];
        User newUser    = new User(login, password, name);

        if(!model.registerNewUser(newUser)) {
            view.sayLoginExist();
        } else {
            view.sayRegSuccessful();
        }
        model.saveBase();
    }

    /**
     * Логика входа пользователя в систему
     */
    public void userEntering(){
        String[] userInfo = view.getLoginInfo();  // получить от пользователя логин и пароль
        String login    = userInfo[0];
        String password = userInfo[1];
        switch (model.enterSystem(login, password)){ // обработать ответ базы(модели) по проверке введенных данных
            case 0:
                userMenu();
                break;
            case 1:
                view.sayUserIsAbsent();
                break;
            case 2:
                view.sayWrongPassword();
                break;
        }
    }
}
