package lab3.task4;

import java.util.Date;
import java.util.Objects;
import java.util.Vector;

/**
 * TASK 4: Manager класы — Employee-ді кеңейтеді
 */
public class Manager extends Employee {
    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, double salary, Date hireDate, String ni, double bonus) {
        super(name, salary, hireDate, ni);
        this.bonus = bonus;
        this.team = new Vector<>();
    }

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
        this.team = new Vector<>();
    }

    public void addTeamMember(Employee emp) {
        team.add(emp);
    }

    public Vector<Employee> getTeam() { return team; }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }

    public double getTotalCompensation() {
        return getSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Manager{name='" + name + "', salary=" + getSalary() +
               ", bonus=" + bonus + ", teamSize=" + team.size() + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manager)) return false;
        if (!super.equals(o)) return false;
        Manager m = (Manager) o;
        return Double.compare(m.bonus, bonus) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bonus);
    }

    // Менеджерлер: жалақы тең болса — бонус бойынша салыстыру
    @Override
    public int compareTo(Employee other) {
        int cmp = super.compareTo(other);
        if (cmp == 0 && other instanceof Manager) {
            return Double.compare(this.bonus, ((Manager) other).bonus);
        }
        return cmp;
    }

    // Deep clone — команда мүшелерін де клондайды
    @Override
    public Manager clone() throws CloneNotSupportedException {
        Manager cloned = (Manager) super.clone();
        cloned.team = new Vector<>();
        for (Employee emp : this.team) {
            cloned.team.add(emp.clone());
        }
        return cloned;
    }
}
