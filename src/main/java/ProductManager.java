import java.util.List;

public interface ProductManager {

    // wersja 1:

//    void addProduct(Book product);
//    void addProduct(Disc product);
//    void removeProduct(Book product);
//    void removeProduct(Disc product);
//    List<Product> getProducts();

    // wersja 2:

    void addProduct(Product product);
    void removeProduct(Product product);
    List<Product> getProducts();
}
