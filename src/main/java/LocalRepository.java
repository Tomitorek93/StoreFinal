import java.util.List;

public class LocalRepository implements StoreRepository {

    private final List<Product> inMemoryProducts = Configuration.products;

    // wersja 1:
//    @Override
//    public void addBook(Book book) {
//        inMemoryProducts.add(book);
//    }
//
//    @Override
//    public void removeBook(Book book) {
//        inMemoryProducts.remove(book);
//    }
//
//    @Override
//    public void addDisc(Disc disc) {
//        inMemoryProducts.add(disc);
//    }
//
//    @Override
//    public void removeDisc(Disc disc) {
//        inMemoryProducts.remove(disc);
//    }
//
//    @Override
//    public List<Product> getProducts() {
//        return inMemoryProducts;
//    }

    // wersja 2:

    @Override
    public void addProduct(Product product) {

        inMemoryProducts.add(product);
    }

    @Override
    public void removeProduct(Product product) {

        inMemoryProducts.remove(product);
    }

    @Override
    public List<Product> getProducts() {
        return inMemoryProducts;
    }



}
