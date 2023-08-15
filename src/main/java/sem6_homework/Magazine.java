package sem6_homework;

public class Magazine extends Periodical {

    private static final String KIND = "Журнал";


    public Magazine(String title, String releaseDate, PERIODICITY period, MEDIUM_TYPE type, boolean availability) {
        super(title, KIND, releaseDate, period, type, availability);
    }

    public Magazine(String title, String releaseDate, PERIODICITY period, boolean availability) {
        super(title, KIND, releaseDate, period, MEDIUM_TYPE.PRINTED, availability);
    }

    // конструктор
    public Magazine(String title, String releaseDate, boolean availability) {
        super(title, KIND, releaseDate, PERIODICITY.MONTHLY, MEDIUM_TYPE.PRINTED, availability);
    }

    // конструктор
    public Magazine(String title, String releaseDate) {
        super(title, KIND, releaseDate, PERIODICITY.MONTHLY, MEDIUM_TYPE.PRINTED, true);
    }

    public static String getKIND() {
        return KIND;
    }
}
