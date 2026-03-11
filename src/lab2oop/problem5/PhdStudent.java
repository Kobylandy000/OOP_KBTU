package lab2oop.problem5;

public class PhdStudent extends Student {

    private String research;

    public PhdStudent(String name, int age, String major, String research) {
        super(name, age, major);
        this.research = research;
    }

    public void assignPet(Animal pet) {

        if(pet instanceof Dog) {
            System.out.println("PhD students cannot own dogs!");
            return;
        }

        super.assignPet(pet);
    }

    public String getOccupation() {
        return "PhD Student researching " + research;
    }
}
