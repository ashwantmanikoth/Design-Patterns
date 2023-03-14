package L07.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }



    public ProductIterator iterator() {
        return new ProductIterator(products);
    }
}
