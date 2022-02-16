import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Configuration {

    public static List<Product> products = initialization();

    public static List<Product> initialization() {

        Product product1 = new Book("lol", "lolek", 3.90, 1);
        Product product2 = new Book("lol", "lolek", 3.90, 2);
        Product product3 = new Disc("lol", "lolek", 3.90, "noob", 3);
        Product product4 = new Disc("lol", "lolek", 3.90, "noob", 4);

        return new ArrayList<>(Arrays.asList(product1, product2, product3, product4));
    }
}
