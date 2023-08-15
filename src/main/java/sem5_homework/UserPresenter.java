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
    boolean logedIn = false;
    User curUser;
    UserView curView;

    public UserPresenter(User curUser, UserView curView) {
        this.curUser = curUser;
        this.curView = curView;
    }


}
