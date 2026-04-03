package lab1.Problem2;

public class LibraryBook {
    public enum Genre {
        FICTION, NON_FICTION, SCIENCE, HISTORY, MYSTERY
    }

    public static final int MAX_BORROW_DAYS = 30;
    private static int totalBooksCreated = 0;

    private final String isbn;
    private final String title;

    private final Genre genre;
    private boolean isBorrowed;
    private int borrowDays;

    {
        isBorrowed = false;
        borrowDays = 0;
    }

    static {
        System.out.println("Library system initialized.");
    }

    public LibraryBook(String title, String isbn, Genre genre) {
        this.title = title;
        this.isbn = isbn;
        this.genre = genre;
        totalBooksCreated++;
    }

    public void borrow() {
        borrow(MAX_BORROW_DAYS);
    }

    public void borrow(int days) {
        if (!isBorrowed) {
            this.isBorrowed = true;
            this.borrowDays = days;
            System.out.println(title + " borrowed for " + days + " days.");
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    public void returnBook() {
        isBorrowed = false;
        borrowDays = 0;
    }

    public static int getTotalBooksCreated() {
        return totalBooksCreated;
    }

    public String getIsbn() {
        return isbn;
    }

    public String toString() {
        return "Book: " + title + " (" + isbn + "), Genre: " + genre;
    }
}