import book.Address;
import book.Book;
import person.employees.Librarian;
import person.employees.Manager;
import person.employees.Staff;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Library {

    private Address address;
    private String name;
    private String phoneNumber;
    // Composition
    private HashMap<Book, Integer> allBooks;
    private Manager manager;
    private ArrayList<Librarian> allLibrarians;
    private ArrayList<Staff> allStaffs;

    // Initialization Block
    {
        allBooks = new HashMap<>();
        allLibrarians = new ArrayList<>();
        allStaffs = new ArrayList<>();
    }

    public Library(Address address, String name, String phoneNumber) {
        this.address = address;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // getters
    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public HashMap<Book, Integer> getAllBooks() {
        return allBooks;
    }


    //
    public void addBook(Book book) {
        allBooks.put(book, 1);
    }

    public void removeBook(Book book) {
        allBooks.remove(book);
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }

    public void addLibrarian(Librarian librarian) {
        allLibrarians.add(librarian);
    }

    public void removeLibrarian(Librarian librarian) {
        allLibrarians.remove(librarian);
    }

    public void addStaff(Staff staff) {
        allStaffs.add(staff);
    }

    public void removeStaff(Staff staff) {
        allStaffs.remove(staff);
    }

    public void addBookCounter(Book book, int counter) {
        allBooks.put(book, allBooks.replace(book, ( allBooks.get(book) + counter ) ));
    }
}
