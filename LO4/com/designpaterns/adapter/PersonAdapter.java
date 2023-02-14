package LO4.com.designpaterns.adapter;

public class PersonAdapter extends Person {
    Person person;

    public PersonAdapter(Person person) {
        super(person.toString());
        this.person = person;
    }

    @Override
    public String toString() {
        return "LastName: "+person.getFullName().split(" ")[1]+" FirstName: "+person.getFullName().split(" ")[0];
    }
}
