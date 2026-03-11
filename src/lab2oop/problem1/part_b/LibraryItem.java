package lab2oop.problem1.part_b;

public abstract class LibraryItem {
    private String title;
    private String author;
    private int publicationYear;

    public LibraryItem(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int PublicationYear() {
        return publicationYear;
    }

    public String toString() {
        return title + " by " + author + " ) " + publicationYear + ")";
    }
}