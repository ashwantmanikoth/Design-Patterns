package LO4.com.designpaterns.adapter;

public class PersonAdapter extends Customer {
    public PersonAdapter(Person person) {
//        super(person.getFullName().split(" ")[0],person.getFullName().split(" ")[1]);
        setFirstName(person.getFullName().split(" ")[0]);
        setLastName(person.getFullName().split(" ")[0]);
    }

}
