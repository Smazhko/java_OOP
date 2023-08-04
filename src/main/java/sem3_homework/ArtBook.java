package sem3_homework;

public class ArtBook extends Book {
    String genre;

    private static final String ART_LITERATURE= "Художественная литература";
    private static final String ANOTHER_GENRE = "Другое";


    // конструктор ИМЯ, АВТОР, ЖАНР, ТИП, доступность
    public ArtBook(String title, String author, String genre, MediumType pubType, boolean availability) {
        super(title, author, ART_LITERATURE, pubType, availability);
        this.genre = genre;
    }

    // конструктор
    public ArtBook(String title, String author, String genre, MediumType pubType) {
        super(title, author, ART_LITERATURE, pubType, true);
        this.genre = genre;
    }

    // конструктор
    public ArtBook(String title, String author, String genre, boolean availability) {
        super(title, author, ART_LITERATURE, MediumType.PRINTED, availability);
        this.genre = genre;
    }

    // конструктор
    public ArtBook(String title, String author, MediumType pubType, boolean availability) {
        super(title, author, ART_LITERATURE, pubType, availability);
        this.genre = ANOTHER_GENRE;
    }

    // конструктор
    public ArtBook(String title, String author, boolean availability) {
        super(title, author, ART_LITERATURE, MediumType.PRINTED, availability);
        this.genre = ANOTHER_GENRE;
    }

    // конструктор
    public ArtBook(String title, String author, MediumType pubType) {
        super(title, author, ART_LITERATURE, pubType, true);
        this.genre = ANOTHER_GENRE;
    }

    // конструктор
    public ArtBook(String title, String author) {
        super(title, author, ART_LITERATURE, MediumType.PRINTED, true);
        this.genre = ANOTHER_GENRE;
    }

}
