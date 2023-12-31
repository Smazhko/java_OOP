package sem6_homework;

public class ArtBook extends Book {
    String genre;

    private static final String ART_LITERATURE= "Худож-ая лит-ра";
    private static final String ANOTHER_GENRE = "Другое";


    // конструктор ИМЯ, АВТОР, ЖАНР, ТИП, доступность
    public ArtBook(String title, String author, String genre, MEDIUM_TYPE pubType, boolean availability) {
        super(title, author, ART_LITERATURE, pubType, availability);
        this.genre = genre;
    }

    // конструктор
    public ArtBook(String title, String author, String genre, MEDIUM_TYPE pubType) {
        super(title, author, ART_LITERATURE, pubType, true);
        this.genre = genre;
    }

    // конструктор
    public ArtBook(String title, String author, String genre, boolean availability) {
        super(title, author, ART_LITERATURE, MEDIUM_TYPE.PRINTED, availability);
        this.genre = genre;
    }

    // конструктор
    public ArtBook(String title, String author, MEDIUM_TYPE pubType, boolean availability) {
        super(title, author, ART_LITERATURE, pubType, availability);
        this.genre = ANOTHER_GENRE;
    }

    // конструктор
    public ArtBook(String title, String author, boolean availability) {
        super(title, author, ART_LITERATURE, MEDIUM_TYPE.PRINTED, availability);
        this.genre = ANOTHER_GENRE;
    }

    // конструктор
    public ArtBook(String title, String author, MEDIUM_TYPE pubType) {
        super(title, author, ART_LITERATURE, pubType, true);
        this.genre = ANOTHER_GENRE;
    }

    // конструктор
    public ArtBook(String title, String author) {
        super(title, author, ART_LITERATURE, MEDIUM_TYPE.PRINTED, true);
        this.genre = ANOTHER_GENRE;
    }

    @Override
    public String getKind() {
        return "Худож-ая лит-ра";
    }
}
