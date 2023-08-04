package sem3_homework;

public class ArtBook extends Publication {
    String genre;

    private static final String ANOTHER_GENRE = "Другое";

    // конструктор ИМЯ, АВТОР, ЖАНР, ТИП, доступность
    public ArtBook(String title, String author, String genre, PublicationType pubType, boolean available) {
        super(title, author, pubType, available);
        this.genre = genre;
    }

    // конструктор
    public ArtBook(String title, String author, String genre, PublicationType pubType) {
        super(title, author, pubType, true);
        this.genre = genre;
    }

    // конструктор
    public ArtBook(String title, String author, String genre, boolean available) {
        super(title, author, PublicationType.PRINTED, available);
        this.genre = genre;
    }

    // конструктор
    public ArtBook(String title, String author, PublicationType pubType, boolean available) {
        super(title, author, pubType, available);
        this.genre = ANOTHER_GENRE;
    }

    // конструктор
    public ArtBook(String title, String author, boolean available) {
        super(title, author, PublicationType.PRINTED, available);
        this.genre = ANOTHER_GENRE;
    }

    // конструктор
    public ArtBook(String title, String author, PublicationType pubType) {
        super(title, author, pubType, true);
        this.genre = ANOTHER_GENRE;
    }

    // конструктор
    public ArtBook(String title, String author) {
        super(title, author, PublicationType.PRINTED, true);
        this.genre = ANOTHER_GENRE;
    }

}
