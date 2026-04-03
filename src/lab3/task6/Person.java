package lab3.task6;

import java.io.Serializable;
import java.util.Objects;

/**
 * TASK 6 (соңғы бөлім): Жетілдірілген Person класы
 *
 * Іске асырылған интерфейстер:
 * EXISTING (Java стандартты):
 *   1. Comparable<Person>  — аты бойынша салыстыру
 *   2. Serializable        — сериализация үшін
 *
 * CUSTOM (өзіміз жасаған):
 *   3. Describable         — өзін сипаттай алу мүмкіндігі
 *   4. Validatable         — деректерін тексере алу мүмкіндігі
 */
public class Person implements Comparable<Person>, Serializable, Describable, Validatable {
    private static final long serialVersionUID = 1L;

    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Comparable<Person> — аты бойынша (alphabetically)
    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    // Describable — өзін сипаттайды
    @Override
    public String describe() {
        return "Мен " + name + ", " + age + " жастамын.";
    }

    // Validatable — деректерді тексереді
    @Override
    public boolean isValid() {
        return name != null && !name.trim().isEmpty() && age >= 0 && age <= 150;
    }

    @Override
    public String getValidationErrors() {
        StringBuilder sb = new StringBuilder();
        if (name == null || name.trim().isEmpty()) sb.append("Аты бос болмауы керек. ");
        if (age < 0 || age > 150) sb.append("Жасы 0-150 аралығында болуы керек.");
        return sb.toString().trim();
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person)) return false;
        Person p = (Person) o;
        return Objects.equals(name, p.name) && age == p.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
