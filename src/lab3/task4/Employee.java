package lab3.task4;

import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

/**
 * TASK 4: Employee класы
 */
public class Employee extends Person implements Comparable<Employee>, Cloneable {
    private double salary;
    private Date hireDate;
    private String nationalInsuranceNumber;

    // Конструкторлар
    public Employee(String name, double salary, Date hireDate, String nationalInsuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public Employee(String name, double salary) {
        this(name, salary, new Date(), "N/A");
    }

    public Employee(String name) {
        this(name, 0.0, new Date(), "N/A");
    }

    // Accessor methods
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public Date getHireDate() { return hireDate; }
    public void setHireDate(Date hireDate) { this.hireDate = hireDate; }

    public String getNationalInsuranceNumber() { return nationalInsuranceNumber; }
    public void setNationalInsuranceNumber(String n) { this.nationalInsuranceNumber = n; }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary +
               ", hireDate=" + hireDate + ", NI='" + nationalInsuranceNumber + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        if (!super.equals(o)) return false;
        Employee e = (Employee) o;
        return Double.compare(e.salary, salary) == 0 &&
               Objects.equals(nationalInsuranceNumber, e.nationalInsuranceNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary, nationalInsuranceNumber);
    }

    // Comparable — жалақы бойынша салыстыру
    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    // Comparator: аты бойынша
    public static final Comparator<Employee> BY_NAME = Comparator.comparing(e -> e.name);

    // Comparator: жалдану күні бойынша
    public static final Comparator<Employee> BY_HIRE_DATE = Comparator.comparing(e -> e.hireDate);

    // Clone — shallow copy
    @Override
    public Employee clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.hireDate = (Date) this.hireDate.clone(); // deep copy for Date
        return cloned;
    }
}
