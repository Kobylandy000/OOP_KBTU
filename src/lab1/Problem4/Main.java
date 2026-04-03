package lab1.Problem4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("CS101", "Object-oriented Programming and Design", 3, "None");
        GradeBook gb = new GradeBook(course);
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[]{
                new Student("Student A", 1),
                new Student("Student B", 4),
                new Student("Student C", 12)
        };

        gb.displayMessage();
        System.out.println("Please, input grades for students:");

        for (Student student : students) {
            System.out.print(student.getName() + ": ");
            double grade = sc.nextDouble();
            gb.addGrade(student, grade);
        }

        gb.displayGradeReport();
    }
}