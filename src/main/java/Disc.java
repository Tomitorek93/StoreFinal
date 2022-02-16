import java.util.Objects;

public class Disc extends Product implements Comparable<Disc>{

   private String title;
    private String author;
    private double price;
    private String song;
    private int id;

    public Disc(String title, String author, double price, String song, int id){
        this.title = title;
        this.author = author;
        this.price = price;
        this.song = song;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disc disc = (Disc) o;
        return Double.compare(disc.price, price) == 0 && id == disc.id && title.equals(disc.title) && author.equals(disc.author) && song.equals(disc.song);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price, song, id);
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

    public void setSong(String song){
        this.song = song;
    }
    public String getSong(){
        return song;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Disc disc) {
        int compareID = disc.getId();
        return compareID - this.id;
    }
}
