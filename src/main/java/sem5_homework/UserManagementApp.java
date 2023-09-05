
package sem5_homework;

public class UserManagementApp {
    public static void main(String[] args) {
        UserModel model = new UserModel();
        UserView view = new UserView();

        UserPresenter presenter = new UserPresenter(view, model);
        presenter.startMenu();
    }
}

/*
╓──────────────╖
║ ГЛАВНОЕ МЕНЮ ║
╙──────────────╜
05.09.2023 (вт), 22:44.
[ 1 ]  Войти в систему
[ 2 ]  Зарегистрироваться
[ 3 ]  Вывести список пользователей (GOD MODE)
[ 4 ]  Выйти из программы
Выберите действие > 3

╓───────────────────────────╖
║ СПИСОК ВСЕХ ПОЛЬЗОВАТЕЛЕЙ ║
╙───────────────────────────╜
- Leopold_99 (1)
- капitoshka_111 (12)
- Новое_имя (2)
- Theo (xpetrox)
- Sergo (mezentek)
- Теодор (hiller-23)
- Kika (kikilia12)

╓──────────────╖
║ ГЛАВНОЕ МЕНЮ ║
╙──────────────╜
05.09.2023 (вт), 22:44.
[ 1 ]  Войти в систему
[ 2 ]  Зарегистрироваться
[ 3 ]  Вывести список пользователей (GOD MODE)
[ 4 ]  Выйти из программы
Выберите действие > 1

╓────────────────╖
║ ВХОД В СИСТЕМУ ║
╙────────────────╜
Логин  > 1
Пароль > 1

╓─────────────────────────╖
║ Привет, Leopold_99 (1)! ║
╙─────────────────────────╜
05.09.2023 (вт), 22:44.
[ 1 ]  Изменить имя
[ 2 ]  Изменить пароль
[ 3 ]  Выйти из учётной записи
[ 4 ]  Удалить учётную запись
[ 5 ]  Выйти из программы
Выберите действие > 2

╓──────────────────╖
║ ИЗМЕНЕНИЕ ПАРОЛЯ ║
╙──────────────────╜
Возможно использование латиницы, цифр, знаков "-" и "_"
Введите новый пароль > 111
Пароль текущего пользователя успешно изменен!

╓─────────────────────────╖
║ Привет, Leopold_99 (1)! ║
╙─────────────────────────╜
05.09.2023 (вт), 22:44.
[ 1 ]  Изменить имя
[ 2 ]  Изменить пароль
[ 3 ]  Выйти из учётной записи
[ 4 ]  Удалить учётную запись
[ 5 ]  Выйти из программы
Выберите действие > 3

╓──────────────╖
║ ГЛАВНОЕ МЕНЮ ║
╙──────────────╜
05.09.2023 (вт), 22:45.
[ 1 ]  Войти в систему
[ 2 ]  Зарегистрироваться
[ 3 ]  Вывести список пользователей (GOD MODE)
[ 4 ]  Выйти из программы
Выберите действие > 1

╓────────────────╖
║ ВХОД В СИСТЕМУ ║
╙────────────────╜
Логин  > 1
Пароль > 111

╓─────────────────────────╖
║ Привет, Leopold_99 (1)! ║
╙─────────────────────────╜
05.09.2023 (вт), 22:45.
[ 1 ]  Изменить имя
[ 2 ]  Изменить пароль
[ 3 ]  Выйти из учётной записи
[ 4 ]  Удалить учётную запись
[ 5 ]  Выйти из программы
Выберите действие > 5

╓────────────────────╖
║ ДО ВСТРЕЧИ ОНЛАЙН! ║
╙────────────────────╜
 */
