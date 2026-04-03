package lab3.task6;

import java.io.Serializable;

/**
 * TASK 6: Жетілдірілген Pet (Animal) класы
 *
 * Іске асырылған интерфейстер:
 * EXISTING (Java стандартты):
 *   1. Comparable<Pet>  — аты бойынша салыстыру
 *   2. Serializable     — сериализация үшін
 *
 * CUSTOM (өзіміз жасаған):
 *   3. Describable      — өзін сипаттау
 *   4. Validatable      — деректерін тексеру
 */
public class Pet implements Comparable<Pet>, Serializable, Describable, Validatable {
    private static final long serialVersionUID = 2L;

    private String name;
    private String species;   // түрі: dog, cat, parrot...
    private int age;
    private Person owner;

    public Pet(String name, String species, int age, Person owner) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.owner = owner;
    }

    // Comparable — аты бойынша
    @Override
    public int compareTo(Pet other) {
        return this.name.compareTo(other.name);
    }

    // Describable
    @Override
    public String describe() {
        String ownerName = (owner != null) ? owner.getName() : "иесі жоқ";
        return "Мен " + name + " деп аталамын, " + species + " тұқымындамын, " +
               age + " жастамын. Ием: " + ownerName + ".";
    }

    // Validatable
    @Override
    public boolean isValid() {
        return name != null && !name.isEmpty()
            && species != null && !species.isEmpty()
            && age >= 0 && age <= 50;
    }

    @Override
    public String getValidationErrors() {
        StringBuilder sb = new StringBuilder();
        if (name == null || name.isEmpty()) sb.append("Аты бос. ");
        if (species == null || species.isEmpty()) sb.append("Түрі бос. ");
        if (age < 0 || age > 50) sb.append("Жасы дұрыс емес. ");
        return sb.toString().trim();
    }

    public String getName() { return name; }
    public String getSpecies() { return species; }
    public int getAge() { return age; }
    public Person getOwner() { return owner; }

    @Override
    public String toString() {
        return "Pet{name='" + name + "', species='" + species + "', age=" + age + "}";
    }
}
