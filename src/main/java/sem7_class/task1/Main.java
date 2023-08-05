package sem7_class.task1;

public class Main {
    public static void main(String[] args) {
        // Получаем экземпляр Singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Установим данные для singleton1
        singleton1.setData("Hello, Singleton!");

        // Проверим, что данные у обоих экземпляров одинаковые
        System.out.println("singleton1 data: " + singleton1.getData());
        System.out.println("singleton2 data: " + singleton2.getData());
    }
}
