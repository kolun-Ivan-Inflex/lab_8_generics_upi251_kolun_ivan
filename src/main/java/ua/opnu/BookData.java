package ua.opnu;
public class BookData implements Comparable<BookData> {
    private String title;
    private String author;
    private int reviews;
    private double total;
    public BookData(String title, String author, int reviews, double total) {
        this.title = title;
        this.author = author;
        this.reviews = reviews;
        this.total = total;
    }
    public double getRating() {
        return total / reviews;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    @Override
    public int compareTo(BookData other) {
        int result = Double.compare(other.getRating(), this.getRating());

        if (result == 0) {
            return this.title.compareTo(other.title);
        }

        return result;
    }
    @Override
    public String toString() {
        return title + " (" + getRating() + ")";
    }
}