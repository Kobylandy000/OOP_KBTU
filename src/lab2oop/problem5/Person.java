package lab2oop.problem5;

public abstract class Person {

    protected String name;
    protected int age;
    protected Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal pet) {
        this.pet = pet;
    }

    public void removePet() {
        pet = null;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void leavePetWith(Person p) {
        if(pet == null) return;

        p.assignPet(pet);
        pet = null;
    }

    public void retrievePetFrom(Person p) {
        if(p.pet == null) return;

        pet = p.pet;
        p.pet = null;
    }

    public abstract String getOccupation();

    public String toString() {
        return name + " - " + getOccupation() +
                " Pet: " + (pet == null ? "None" : pet);
    }
}
