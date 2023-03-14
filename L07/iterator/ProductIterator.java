package L07.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ProductIterator  {
    int position = 0;
    List <Product> product;
    public ProductIterator(List<Product> products) {
        product = products;
    }

    public boolean hasNext() {
        while(position< product.size()){
            return true;
        }
        return false;
    }

    public Object next() {
        if(hasNext()){
            return product.get(position++);
        }
        throw new NoSuchElementException();
    }
    public String toString(){
        return String.valueOf(product.get(position));
    }
}
