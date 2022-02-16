import java.util.List;

public class ProductsManager implements ProductManager {

    private final StoreRepository storeRepository = new LocalRepository();

    // wersja 1:

//    @Override
//    public void addProduct(Book book) {
//        storeRepository.addBook(book);
//
//    }
//
//    @Override
//    public void addProduct(Disc disc) {
//        storeRepository.addDisc(disc);
//    }
//
//    @Override
//    public void removeProduct(Book book) {
//        storeRepository.removeBook(book);
//    }
//
//    @Override
//    public void removeProduct(Disc disc) {
//        storeRepository.removeDisc(disc);
//    }
//
//
//    @Override
//    public List<Product> getProducts() {
//        return storeRepository.getProducts();
//
//    }

    // wersja 2:
    @Override
    public void addProduct(Product product) {

        storeRepository.addProduct(product);
    }

    @Override
    public void removeProduct(Product product) {
        storeRepository.removeProduct(product);
    }

    @Override
    public List<Product> getProducts() {

        return storeRepository.getProducts();
    }
}
