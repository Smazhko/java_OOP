package sem3_homework;

public class Book extends Publication implements Comparable<Book>{

    private String author;
    private String kind; // художественная, научная, школьная, специализированная и др


    public Book(String title, String author, String kind, MediumType type, boolean availability) {
        super(title, type, availability);
        this.author = author;
        this.kind = kind;
    }

    private String getAuthor() {
        return author;
    }

    public String getInfo() {
        String availString = "доступна";
        if (!this.getAvailability()) {
            availString = "недоступна";
        }
        return String.format("%s (%s) - %s. Статус: %s", "\"" + getTitle() + "\"", author, kind, availString);
    }

    @Override
    public int compareTo(Book o){
        return this.getTitle().compareTo(o.getTitle());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Book anotherPub = (Book) obj;

        return this.getTitle().equals(anotherPub.getTitle()) &&
                this.getAuthor().equals(anotherPub.getAuthor());
    }
}
