package sem3_homework;

public class Book extends Publication{

    private String author;
    private String kind; // художественная, научная, школьная, специализированная и др


    public Book(String title, String author, String kind, MediumType type, boolean availability) {
        super(title, type, availability);
        this.author = author;
        this.kind = kind;
    }

    public String getAuthor() {
        return author;
    }

    public String getInfo() {
        String availString = "доступна";
        if (!this.getAvailability()) {
            availString = "недоступна";
        }
        return String.format("%-35s / %-18s Статус: %s", "\"" + getTitle() + "\"", author, availString);
    }

    @Override
    public int compareTo(Publication o) {
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

        Publication anotherPub = (Publication) obj;

        return this.getAuthor().equals(anotherPub.getAuthor()) &&
                this.getTitle().equals(anotherPub.getTitle());
    }

}
