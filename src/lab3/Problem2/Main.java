package lab3.Problem2;

public class Main {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("1984", "978-0451524935", LibraryBook.Genre.FICTION);
        LibraryBook book2 = new LibraryBook("Sapiens", "978-0062316097", LibraryBook.Genre.NON_FICTION);
        LibraryBook book3 = new LibraryBook("2000", "978-004789234", LibraryBook.Genre.MYSTERY);

        System.out.println(book1);
        System.out.println("ISBN (read-only): " + book1.getIsbn());

        book1.borrow();                    // method overloading
        book2.borrow(20);                  // overloaded version

        book1.returnBook();

        System.out.println("Total books created: " + LibraryBook.getTotalBooksCreated());
    }
}
