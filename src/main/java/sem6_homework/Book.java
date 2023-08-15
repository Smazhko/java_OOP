package sem6_homework;

public class Book extends Publication implements Comparable<Book>, IGetBookInfo{

    private String author;
    private String kind; // художественная, научная, школьная, специализированная и др

    // конструктор
    public Book(String title, String author, String kind, MEDIUM_TYPE type, boolean availability) {
        super(title, type, availability);
        this.author = author;
        this.kind = kind;
    }

    public String getAuthor() {
        return author;
    }

    public String getKind(){
        return kind;
    }

    @Override
    public int compareTo(Book o){
        return (this.getTitle() + this.getAuthor()).compareTo(o.getTitle() + o.getAuthor());
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
