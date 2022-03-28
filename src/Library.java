import java.util.*;

public class Library {

    private Book[] books; // her bir kitap Library class'ı içerisinde bir array içerisinde saklandı.
    private int arraySize;
    private int index;

    public Library() {
    }

    public Library(int arraySize) { // library'in arraySize'ı parametre olarak verildi.

        this.arraySize = arraySize;
        this.books = new Book[arraySize]; // constructor'da girilen arraySize ile kütüphanede kaç tane kitap barındıralacağı belirtilmiş oldu.
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

    public void addBookByIndex(Book book) { // isFull() metoduyla library'in içerisinin dolu olup olmadığı tespit edildi.
        if (!isFull()) {
            this.books[this.index] = book;
            this.index++; // eğer dolu değilse girilen this.books ile books arrayini çağır ve this.books[this.index] ile oraya addBookByIndex metodundan gelen parametreyi ekle.
        } else
            System.out.println("Library is full so you can't add new book");
    }

    private boolean isFull() {

        return ((this.arraySize) < (this.index)); // index değeri büyükse bu metod false değerini döner.

    }

    public Book getBookByName(String bookName) {

        for (int i = 0; i < this.books.length; i++) {
            if (books[i].getName().equals(bookName)) { // kitabın adını çağırır eğer metod çağrıldığında girilen parametre kitaplıkta yer alıyorsa.
                return books[i]; // books[i].getName() ile library'de yer alan kitaplar döner.String olarak. Onu karşılaştırmak için equals metodu kullanıldı.
            }
        }
        return null;
    }


}