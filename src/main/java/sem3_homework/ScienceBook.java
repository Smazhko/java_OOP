package sem3_homework;

public class ScienceBook extends Book {
    String science;

    private static final String SCIENCE_LITERATURE = "Научная лит-ра";
    private static final String ANOTHER_SCIENCE = "Другое";

    // конструктор ИМЯ, АВТОР, НАУКА, НОСИТЕЛЬ, доступность
    public ScienceBook(String title, String author, String science, MediumType pubType, boolean availability) {
        super(title, author, SCIENCE_LITERATURE, pubType, availability);
        this.science = science;
    }

    // конструктор
    public ScienceBook(String title, String author, String science, MediumType pubType) {
        super(title, author, SCIENCE_LITERATURE, pubType, true);
        this.science = science;
    }

    // конструктор
    public ScienceBook(String title, String author, String science, boolean availability) {
        super(title, author, SCIENCE_LITERATURE, MediumType.PRINTED, availability);
        this.science = science;
    }

    // конструктор
    public ScienceBook(String title, String author, MediumType pubType, boolean availability) {
        super(title, author, SCIENCE_LITERATURE, pubType, availability);
        this.science = ANOTHER_SCIENCE;
    }

    // конструктор
    public ScienceBook(String title, String author, boolean availability) {
        super(title, author, SCIENCE_LITERATURE, MediumType.PRINTED, availability);
        this.science = ANOTHER_SCIENCE;
    }

    // конструктор
    public ScienceBook(String title, String author, MediumType pubType) {
        super(title, author, SCIENCE_LITERATURE, pubType, true);
        this.science = ANOTHER_SCIENCE;
    }

    // конструктор
    public ScienceBook(String title, String author) {
        super(title, author, SCIENCE_LITERATURE, MediumType.PRINTED, true);
        this.science = ANOTHER_SCIENCE;
    }
}
