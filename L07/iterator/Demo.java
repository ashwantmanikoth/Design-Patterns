package L07.iterator;

import java.util.Iterator;

public class Demo {

    public static void main(String[] args){
        ProductCollection productCollection = new ProductCollection();
        Product one = new Product(1,"Ashwant");
        Product two = new Product(2,"Manikoth");

        productCollection.add(one);
        productCollection.add(two);

        ProductIterator productIterator = productCollection.iterator();
        while(productIterator.hasNext()){
            System.out.println(productIterator.next().toString());
        }
    }
}
