package LO4.com.designpaterns.adapter;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
    public static void main(String args[]){
        ArrayList nameList = new ArrayList();
        nameList.add("ashwant Manikoth");
        nameList.add("Will Smith");
        nameList.add("Tom Cruise");

        System.out.println("Using Adapter");
    //old flow through personAdapter
        for (Object value : nameList) {
            String name = (String) value;
            Person person = new Person(name);
            PersonAdapter personAdapter = new PersonAdapter(person);
            System.out.println("The FirstName is " + personAdapter.getFirstName() + " The Last Name is " + personAdapter.getLastName());
        }

        System.out.println("Without Adapter");
        for (Object o : nameList) {
            String name = (String) o;
            Customer customer = new Customer(name.split(" ")[0], name.split(" ")[1]);
            System.out.println("The FirstName is " + customer.getFirstName() + " The Last Name is " + customer.getLastName());

        }


    }


}
