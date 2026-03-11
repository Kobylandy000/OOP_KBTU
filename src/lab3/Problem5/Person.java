package lab3.Problem5;

public class Person {

    private Gender gender;

    // constructor
    public Person(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public boolean isBoy() {
        return gender == Gender.BOY;
    }

    public boolean isGirl() {
        return gender == Gender.GIRL;
    }
}