import java.util.List;

public interface StoreRepository {

    // wersja 1:

//    void addBook(Book book);
//    void removeBook(Book book);
//    void addDisc(Disc disc);
//    void removeDisc(Disc disc);
//    List<Product> getProducts();

    // wersja 2:
    void addProduct(Product product);
    void removeProduct(Product product);
    List<Product> getProducts();

}
