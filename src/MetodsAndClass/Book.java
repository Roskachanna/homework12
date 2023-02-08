package MetodsAndClass;

import java.util.Objects;

public class Book {

    private String bookName;
    private int publishingYear;
    private Author authorName;


    public Book(String bookName, int publishingYear, Author authorName) {
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

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", publishingYear=" + publishingYear +
                ", authorName=" + authorName +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(bookName, book.bookName) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, publishingYear, authorName);
    }

    public Author getAuthor() {

        return this.authorName;
    }

}
