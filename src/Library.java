import java.util.*;

public class Library {

    private Book[] books;
    private int arraySize;
    private int index;

    public Library() {
    }

    public Library(int arraySize) {

        this.arraySize = arraySize;
        this.books = new Book[arraySize];
        this.index = 0;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getArraySize() {
        return arraySize;
    }

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }

    public void addBookByIndex(Book book) {
        if (!isFull()) {
            this.books[this.index] = book;
            this.index++;
        } else
            System.out.println("Library is full so you can't add new book");
    }

    private boolean isFull() {
        return ((this.arraySize) < (this.index));
    }

    public Book getBookByName(String bookName) {

        for (int i = 0; i < this.books.length; i++) {
            if (books[i].getName().equals(bookName)) {
                return books[i];
            }
        }
        return null;
    }

}