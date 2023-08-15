
package sem5_homework;

public class UserManagementApp {
    public static void main(String[] args) {
        User userX = new User();
        UserView consoleView = new UserView();

        UserPresenter presenter = new UserPresenter(userX, consoleView);
    }
}
