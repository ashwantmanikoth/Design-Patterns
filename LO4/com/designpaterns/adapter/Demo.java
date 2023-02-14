package LO4.com.designpaterns.adapter;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
    public static void main(String args[]){
        ArrayList nameList = new ArrayList();
        nameList.add("ashwant Manikoth");
        nameList.add("Will Smith");
        nameList.add("Tom Cruise");


    //old flow through personAdapter
        for (Iterator it = nameList.iterator(); it.hasNext(); ) {
            String name= (String) it.next();
            Person person = new Person(name);
            PersonAdapter personAdapter = new PersonAdapter(person);
            System.out.println(personAdapter);
        }


        for (Iterator it = nameList.iterator(); it.hasNext(); ) {
            String name= (String) it.next();
            Customer customer = new Customer(name.split( " ")[0],name.split(" ")[1]);
            System.out.println("The FirstName is "+customer.getFirstName()+" The Last Name is "+customer.getLastName());

        }


    }


}
