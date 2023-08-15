package sem6_homework;

// реализация [S] в SOLID
// Принцип единственной ответственности — The Single Responsibility Principle или SRP
// Принцип декларирует, что каждый объект должен иметь одну обязанность и эта обязанность
// должна быть полностью инкапсулирована в класс, а все его сервисы должны быть
// направлены исключительно на обеспечение этой обязанности.

// из классков КНИГА, ПЕРИОДИКА выделены независимые методы для показа информации об издании

interface IGetPeriodicalInfo {
    static String info(Periodical periodic) {
        String availString = "доступно";
        if (!periodic.getAvailability()) {
            availString = "недоступно";
        }

        return String.format("%-35s (%-16s)  Статус: %s", " \"" +
                periodic.getTitle() + "\" от " + periodic.getReleaseDate(),
                periodic.getPeriod(), availString);
    }
}
