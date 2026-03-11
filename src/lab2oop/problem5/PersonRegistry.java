package lab2oop.problem5;

import java.util.Vector;

public class PersonRegistry {

    private Vector<Person> people = new Vector<>();

    public void addPerson(Person p) {
        people.add(p);
    }

    public void removePerson(Person p) {
        people.remove(p);
    }

    public String toString() {

        String result = "";

        for(Person p : people) {
            result += p + "\n";
        }

        return result;
    }
}
