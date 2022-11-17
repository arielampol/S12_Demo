package ex5sample;

public class Ex5Driver {
    public static void main(String[] args) {
        Library s11Lib = new Library("The S11 Library");
        Library s12Lib = new Library("The S12 Library");

        Book book1 = new Book("Java: How to Program", "Education");
        book1.addAuthor(new Author("Deitel, H.", "Education"));
        book1.addAuthor(new Author("Deitel, P.", "Education"));
        Book book2 = new Book("Java programming, ninth edition", "Education");
        Author jFarell = new Author("Farell, J.", "Education");
        book2.addAuthor(jFarell);
        Book book3 = new Book("An  object-oriented  approach  to  programming  logic  and  design", "Education");
        book3.addAuthor(jFarell);
        Book book4 = new Book("UML toolkit", "Education");
        book4.addAuthor(new Author("Hans-Erik Eriksson, M. P.", "Education"));
        Book book5 = new Book("Object-Oriented Systems Analysis and Design using UML", "Education");
        book5.addAuthor(new Author("Simon Bennet, R. F.", "Education"));
        book5.addAuthor(new Author("Steve McRobb", "Education"));

        Book book6 = new Book("The Talisman", "Mystery");
        book6.addAuthor(new Author("Stephen King", "Mystery"));
        book6.addAuthor(new Author("Peter Straub", "Mystery"));
        Book book7 = new Book("Sleeping Beauties", "Mystery");
        book7.addAuthor(new Author("Stephen King", "Mystery"));
        book7.addAuthor(new Author("Owen King", "Mystery"));
        Book book8 = new Book("The Shining", "Mystery");
        book8.addAuthor(new Author("Stephen King", "Mystery"));
        Book book9 = new Book("Odd Thomas", "Mystery");
        book9.addAuthor(new Author("Dean Koontz", "Mystery"));

        Book book10 = new Book("The Fault in Our Stars", "Young Adult");
        book10.addAuthor(new Author("John Green", "Young Adult"));
        Book book11 = new Book("Paper Towns", "Young Adult");
        book11.addAuthor(new Author("John Green", "Young Adult"));
        Book book12 = new Book("Will Grayson, Will Grayson", "Young Adult");
        book12.addAuthor(new Author("John Green", "Young Adult"));
        Book book13 = new Book("The Book Thief", "Young Adult");
        book13.addAuthor(new Author("Markus Zusak", "Young Adult"));

        Book book14 = new Book("Critique of Pure Reason", "Philosophy");
        book14.addAuthor(new Author("Immanuel Kant", "Philosophy"));
        Book book15 = new Book("A Treatise of Human Nature", "Philosophy");
        book15.addAuthor(new Author("David Hume", "Philosophy"));

        s11Lib.addBook(book1);
        s11Lib.addBook(book2);
        s11Lib.addBook(book3);
        s11Lib.addBook(book4);
        s11Lib.addBook(book5);
        s11Lib.addBook(book10);
        s11Lib.addBook(book11);
        s11Lib.addBook(book12);
        s11Lib.addBook(book13);
        s12Lib.addBook(book14);
        s12Lib.addBook(book15);

        s12Lib.addBook(book1);
        s12Lib.addBook(book2);
        s12Lib.addBook(book3);
        s12Lib.addBook(book4);
        s12Lib.addBook(book5);
        s12Lib.addBook(book6);
        s12Lib.addBook(book7);
        s12Lib.addBook(book8);
        s12Lib.addBook(book9);
        s12Lib.addBook(book10);
        s12Lib.addBook(book11);
        s12Lib.addBook(book12);

        //s11Lib.printLibraryReport();
        System.out.println();
        System.out.println();
        //s12Lib.printLibraryReport();

    }
}
