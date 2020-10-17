package book;

import person.Author;
import person.FieldOfInterest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Book {

    private String bookName;
    private String ISBN;
    private ArrayList<Author> authors;
    private int pageNumbers;
    private LocalDateTime publishDate; // Date is deprecated!!
    private BookFormat bookFormat;
    private FieldOfInterest fieldOfInterest;

    // Initialization Block
    {
        authors = new ArrayList<>();
    }

    public Book(String bookName, String ISBN, int pageNumbers, LocalDateTime publishDate, BookFormat bookFormat, FieldOfInterest fieldOfInterest, Author ... authors) { // Variable Length Argument
        setBookName(bookName);
        setISBN(ISBN);
        setPageNumbers(pageNumbers);
        setPublishDate(publishDate);
        setBookFormat(bookFormat);
        setFieldOfInterest(fieldOfInterest);
        setAuthors((ArrayList<Author>) Arrays.asList(authors));
    }

    // setters  --> Immutable
    private void setBookName(String bookName) {
        this.bookName = bookName;
    }

    private void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    private void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    private void setPageNumbers(int pageNumbers) {
        this.pageNumbers = pageNumbers;
    }

    private void setPublishDate(LocalDateTime publishDate) {
        this.publishDate = publishDate;
    }

    private void setBookFormat(BookFormat bookFormat) {
        this.bookFormat = bookFormat;
    }

    private void setFieldOfInterest(FieldOfInterest fieldOfInterest) {
        this.fieldOfInterest = fieldOfInterest;
    }

    // getters
    public String getBookName() {
        return bookName;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    public LocalDateTime getPublishDate() {
        return publishDate;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public BookFormat getBookFormat() {
        return bookFormat;
    }

    public FieldOfInterest getFieldOfInterest() {
        return fieldOfInterest;
    }

    // Copy Constructor
    public Book(Book c) {
        this.bookName = c.bookName;
        this.ISBN = c.ISBN;
        this.pageNumbers = c.pageNumbers;
        this.publishDate = c.publishDate;
        this.bookFormat = c.bookFormat;
        this.authors = c.authors;
    }

    // ToString Method
    @Override
    public String toString() {
        String authorsToString = "";
        for (Author author : authors) {
            authorsToString += author.getName();
            authorsToString += ", ";
        }
        return ("Book --> " + "BookName = " + getBookName() + ", "
        + "ISBN = " + getISBN() + ", "
        + "Authors = " + authorsToString
        + "PageNumber = " + getPageNumbers()
        + "Publish Date = " + getPublishDate()
        + "Book Format = " + getBookFormat());
    }

    // Equals Method
    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(!(obj instanceof Book)) {
            return false;
        }

        // DownCasting
        Book b = (Book) obj;
        if (this.ISBN.equals(b.ISBN)) {
            return true;
        } else {
            return false;
        }
    }
}
