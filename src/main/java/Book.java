import java.util.Objects;

public class Book extends Product implements Comparable<Book> {

    private String title;
    private String author;
    private double price;
    private int id;

    public Book(String title, String author, double price, int id){
        this.title = title;
        this.author = author;
        this.price = price;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && id == book.id && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price, id);
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Book book) {
        int compareID = book.getId();
        return compareID - this.id;
    }
}
