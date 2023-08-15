package sem6_homework;

// Принцип открытости/закрытости — The Open Closed Principle или OCP
// Принцип декларирует, что программные сущности (классы, модули, функции и т. п.)
// должны быть открыты для расширения, но закрыты для изменения. Это означает,
// что эти сущности могут менять свое поведение без изменения их исходного кода.
// В этом контексте открытость для расширения — это возможность добавить для класса,
// модуля или функции новое поведение, если необходимость в этом возникнет,
// а закрытость для изменений — это запрет на изменение исходного кода программных сущностей.

// В классе ARTBOOK наследнике класса BOOK заменён метод getKind
// таким образом, не изменяя класс-родитель, мы меняем поведение класса-наследника

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
        return "Художественная литература";
    }
}
