package sem6_homework;

interface IChangeAvailability {

    static void on(Publication pub) {
        pub.setAvailability(true);
        System.out.println("-".repeat(40) + "\nИзменение статуса: \n" +
                pub.getTitle() + ", статус : " + pub.getAvailability());
        System.out.println("-".repeat(40) + "\nИзменение статуса: \n" + IGetBookInfo.info(pub));
    }

    static void off(Publication pub) {
        pub.setAvailability(false);
        System.out.println("-".repeat(40) + "\nИзменение статуса: \n" +
                pub.getTitle() + ", статус: " + pub.getAvailability());
    }

}
