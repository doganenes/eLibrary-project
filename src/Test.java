public class Test {

    public static void main(String[] args) {

        // Creating page objects from Page class
        Page p1 = new Page(1, "In terms of literary novels, it deals with past love issues.");
        Page p2 = new Page(2, "In terms of historical novels, it deals with past love issues.");
        Page p3 = new Page(3, "Go to School and get a high grade.");
        Page p4 = new Page(4, "Stay home and study.");
        Page p5 = new Page(5, "Listen to music which is your favourite song.");
        Page p6 = new Page(6, "Play computer games it is fun.");
        Page p7 = new Page(7, "Read book about history.");
        Page p8 = new Page(8, "Read book about literal.");
        Page p9 = new Page(9, "Draw picture about your life");
        Page p10 = new Page(10, "Let's start. Go!");

        Book b1 = new Book("Book1", 2001,
                "Writer 1", "A Yayıncılık", 10);
        b1.addPage(p1);
        b1.addPage(p2);
        b1.addPage(p3);
        b1.addPage(p4);
        b1.addPage(p5);
        b1.addPage(p6);
        b1.addPage(p7);
        b1.addPage(p8);
        b1.addPage(p9);
        b1.addPage(p10);
        System.out.println(b1.getPageContent(2));
        System.out.println();

        Book b2 = new Book("Book2", 2002,
                "Writer 2", "B Yayıncılık", 10);
        b2.addPage(p1);
        b2.addPage(p2);
        b2.addPage(p3);
        b2.addPage(p4);
        b2.addPage(p5);
        b2.addPage(p6);
        b2.addPage(p7);
        b2.addPage(p8);
        b2.addPage(p9);
        b2.addPage(p10);
        System.out.println(b2.getPageContent(3));

        Book b3 = new Book("Book3", 2003,
                "Writer 3", "C Yayıncılık", 10);
        b3.addPage(p1);
        b3.addPage(p2);
        b3.addPage(p3);
        b3.addPage(p4);
        b3.addPage(p5);
        b3.addPage(p6);
        b3.addPage(p7);
        b3.addPage(p8);
        b3.addPage(p9);
        b3.addPage(p10);
        System.out.println("Content of the page 7 of the book3 is: " + b3.getPageContent(7));

        Book b4 = new Book("Book4", 2004, "Writer 4", "D Yayıncılık", 10);
        b4.addPage(p1);
        b4.addPage(p2);
        b4.addPage(p3);
        b4.addPage(p4);
        b4.addPage(p5);
        b4.addPage(p6);
        b4.addPage(p7);
        b4.addPage(p8);
        b4.addPage(p9);
        b4.addPage(p10);
        System.out.println(b2.getPageContent(10));

        Book b5 = new Book("Book5", 2005,
                "Writer 5", "E Yayıncılık", 10);
        b5.addPage(p1);
        b5.addPage(p2);
        b5.addPage(p3);
        b5.addPage(p4);
        b5.addPage(p5);
        b5.addPage(p6);
        b5.addPage(p7);
        b5.addPage(p8);
        b5.addPage(p9);
        b5.addPage(p10);
        System.out.println(b2.getPageContent(10));

        Book b6 = new Book("Book6", 2006,
                "Writer 6", "F Yayıncılık", 10);
        b6.addPage(p1);
        b6.addPage(p2);
        b6.addPage(p3);
        b6.addPage(p4);
        b6.addPage(p5);
        b6.addPage(p6);
        b6.addPage(p7);
        b6.addPage(p8);
        b6.addPage(p9);
        b6.addPage(p10);
        System.out.println(b2.getPageContent(10));

        Book b7 = new Book("Book7", 2007,
                "Writer 7", "G Yayıncılık", 10);
        b7.addPage(p1);
        b7.addPage(p2);
        b7.addPage(p3);
        b7.addPage(p4);
        b7.addPage(p5);
        b7.addPage(p6);
        b7.addPage(p7);
        b7.addPage(p8);
        b7.addPage(p9);
        b7.addPage(p10);

        Book b8 = new Book("Book8", 2008,
                "Writer 8", "H Yayıncılık", 10);
        b8.addPage(p1);
        b8.addPage(p2);
        b8.addPage(p3);
        b8.addPage(p4);
        b8.addPage(p5);
        b8.addPage(p6);
        b8.addPage(p7);
        b8.addPage(p8);
        b8.addPage(p9);
        b8.addPage(p10);

        Book b9 = new Book("Book9", 2009,
                "Writer 9", "I Yayıncılık", 10);
        b9.addPage(p1);
        b9.addPage(p2);
        b9.addPage(p3);
        b9.addPage(p4);
        b9.addPage(p5);
        b9.addPage(p6);
        b9.addPage(p7);
        b9.addPage(p8);
        b9.addPage(p9);
        b9.addPage(p10);

        Book b10 = new Book("Book10", 2010,
                "Writer 10", "J Yayıncılık", 10);
        b10.addPage(p1);
        b10.addPage(p2);
        b10.addPage(p3);
        b10.addPage(p4);
        b10.addPage(p5);
        b10.addPage(p6);
        b10.addPage(p7);
        b10.addPage(p8);
        b10.addPage(p9);
        b10.addPage(p10);
        System.out.println();

        Library l1 = new Library(10);

        Library library1 = new Library(10);
        library1.addBookByIndex(b1);
        library1.addBookByIndex(b2);
        library1.addBookByIndex(b3);
        library1.addBookByIndex(b4);
        library1.addBookByIndex(b5);
        library1.addBookByIndex(b6);
        library1.addBookByIndex(b7);
        library1.addBookByIndex(b8);
        library1.addBookByIndex(b9);
        library1.addBookByIndex(b10);

        //writing style 1
        for (int i = 1; i <= library1.getBooks().length; i++) {
            System.out.println("Name of the Book " + library1.getBookByName("Book" + i).getPageContent(i));

        }

        System.out.println();

        //writing style 2
        for (int i = 1; i <= library1.getBooks().length; i++) {

            System.out.println(library1.getBookByName("Book" + i).getName() + " | " + library1.getBookByName("Book" + i).getPageContent(i));
        }



    }

}
