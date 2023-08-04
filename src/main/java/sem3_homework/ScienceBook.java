package sem3_homework;

public class ScienceBook extends Book {
    String science;

    private static final String ANOTHER_SCIENCE = "Другое";

    // конструктор ИМЯ, АВТОР, ЖАНР, ТИП, доступность
    public ScienceBook(String title, String author, String science, MediumType pubType, boolean available) {
        super(title, author, pubType, available);
        this.science = science;
    }

    // конструктор
    public ScienceBook(String title, String author, String science, MediumType pubType) {
        super(title, author, pubType, true);
        this.science = science;
    }

    // конструктор
    public ScienceBook(String title, String author, String science, boolean available) {
        super(title, author, MediumType.PRINTED, available);
        this.science = science;
    }

    // конструктор
    public ScienceBook(String title, String author, MediumType pubType, boolean available) {
        super(title, author, pubType, available);
        this.science = ANOTHER_SCIENCE;
    }

    // конструктор
    public ScienceBook(String title, String author, boolean available) {
        super(title, author, MediumType.PRINTED, available);
        this.science = ANOTHER_SCIENCE;
    }

    // конструктор
    public ScienceBook(String title, String author, MediumType pubType) {
        super(title, author, pubType, true);
        this.science = ANOTHER_SCIENCE;
    }

    // конструктор
    public ScienceBook(String title, String author) {
        super(title, author, MediumType.PRINTED, true);
        this.science = ANOTHER_SCIENCE;
    }

}
