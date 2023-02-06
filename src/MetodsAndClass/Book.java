package MetodsAndClass;

public class Book {

    private String bookName;
    private int publishingYear;
    private Autors authorName;


    public Book(String bookName, int publishingYear, Autors authorName) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;
        this.authorName = authorName;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }
    public String getName() {
        return this.bookName;
    }
    public Autors getAuthor() {
        return this.authorName;
    }
}
