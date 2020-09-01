import java.util.ArrayList;

public class Library {

    public static void main(String[] args) {

        ArrayList<Book> Library = new ArrayList<>();

        Book book = new Book(127317, "Cool book", 2020);
        Book book2 = new Book(127317, "Old book", 1969);
        Book book3 = new Book(127317, "Weird book", 2012);


        Library.add(book);
        Library.add(book2);
        Library.add(book3);

        CheckISBN(Library, book);

    }

    public static boolean CheckISBN ( ArrayList Library, Book book) {

        if ( Library.equals(book.getISBN()) ) {
            System.out.println("The book is already registered");
            return true;

        } else {
            System.out.println("Book has been registered to the library");
            Library.add(book);
            return false;
        }
    }
}
