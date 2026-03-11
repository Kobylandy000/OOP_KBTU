package lab2oop.problem1.part_b;

class Book extends LibraryItem {
    private int numberOfPages;

    public Book(String title, String author, int year, int pages) {
        super(title, author, year);
        this.numberOfPages = pages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String toString() {
        return super.toString() + " - Pages: " + numberOfPages;
    }
}
