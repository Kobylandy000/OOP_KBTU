package lab3.task4;

import java.util.Date;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    protected double salary;
    protected Date hireDate;
    protected String insuranceNumber;

    Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    @Override
    public String toString() {
        return name + " ($" + salary + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee e = (Employee) obj;
        return insuranceNumber.equals(e.insuranceNumber);
    }

    @Override
    public int compareTo(Employee e) {
        return Double.compare(this.salary, e.salary);
    }

    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
