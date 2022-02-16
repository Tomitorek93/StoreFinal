import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ProductManager pm = new ProductsManager();

        //wersja 1:

//        Book book3 = new Book("sda", "dsa", 3.92, 3);
//        Book book4 = new Book("sda", "dsa", 3.92, 4);
//        Book book5 = new Book("sda", "dsa", 3.92, 5);
//
//        Disc disc3 = new Disc("sda", "dsa", 3.92, "fs", 3);
//        Disc disc4 = new Disc("sda", "dsa", 3.92, "fs", 4);
//        Disc disc5 = new Disc("sda", "dsa", 3.92, "fs", 5);
//
//        pm.addProduct(book3);
//        pm.addProduct(disc3);
//        pm.addProduct(disc4);
//        pm.removeProduct(book3);
//        pm.removeProduct(disc3);
//
//        var x = pm.getProducts();
//        System.out.println(x.size());

        // wersja 2:
         Product product6 = new Book("sda", "dsa", 3.92, 5);
         Product product7 = new Book("sda", "dsa", 3.92, 6);
         Book product8 = new Book("sda", "dsa", 3.92, 7);

         Product product9 = new Disc("sda", "dsa", 3.92, "fs", 8);
         Product product10 = new Disc("sda", "dsa", 3.92, "fs", 9);
         Disc product11 = new Disc("sda", "dsa", 3.92, "fs", 10);

         pm.addProduct(product6);
         pm.addProduct(product7);
         pm.addProduct(product8);
         pm.addProduct(product9);
         pm.addProduct(product10);
         pm.addProduct(product11);

         pm.removeProduct(product6);


         System.out.println(pm.getProducts());

         var x = pm.getProducts();
         System.out.println(x.size());

        // Jak usunac ksiazki z Configuration listy pojedynczo?
        // Jak posortować listę po książkach i dyskach? Utworzyć nową listę?


    }
}