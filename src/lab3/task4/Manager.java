package lab3.task4;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee {
    protected Vector<Employee> team;
    protected double bonus;

    Manager(String name, double salary, Date hireDate, String insuranceNumber, double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.bonus = bonus;
        this.team = new Vector<>();
    }

    void addToTeam(Employee e) {
        team.add(e);
    }

    @Override
    public String toString() {
        return name + " ($" + salary + " + $" + bonus + " bonus)";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (obj == null || getClass() != obj.getClass()) return false;
        Manager m = (Manager) obj;
        return Double.compare(m.bonus, bonus) == 0;
    }

    @Override
    public int compareTo(Employee e) {
        if (e instanceof Manager) {
            Manager m = (Manager) e;
            if (this.salary != m.salary) {
                return Double.compare(this.salary, m.salary);
            }
            return Double.compare(this.bonus, m.bonus);
        }
        return super.compareTo(e);
    }

    @Override
    public Manager clone() {
        return (Manager) super.clone();  // Employee-тің clone()-ын шақырады
    }
}
