package sem6_homework;

 interface IGetPeriodicalInfo {
    static String info(Periodical publication) {
        String availString = "доступно";
        if (!publication.getAvailability()) {
            availString = "недоступно";

        }

        return String.format("%-35s (%-16s)  Статус: %s", " \"" +
                publication.getTitle() + "\" от " + publication.getReleaseDate(),
                publication.getPeriod(), availString);
    }
}
