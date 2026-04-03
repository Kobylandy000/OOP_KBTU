package lab1.Problem4;

import java.util.LinkedHashMap;
import java.util.Map;

public class GradeBook {
    private Course course;
    private Map<Student, Double> grades;

    public GradeBook(Course course) {
        this.course = course;
        this.grades = new LinkedHashMap<>();
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + String.valueOf(this.course) + "!");
    }

    public void addGrade(Student student, double grade) {
        this.grades.put(student, grade);
    }

    public void displayGradeReport() {
        double sum = 0;
        double min = 100;
        double max = 0;
        Student lowestStudent = null;
        Student highestStudent = null;

        for(Map.Entry<Student, Double> entry : this.grades.entrySet()) {
            double g = entry.getValue();
            sum += g;
            if (g < min) {
                min = g;
                lowestStudent = entry.getKey();
            }

            if (g > max) {
                max = g;
                highestStudent = entry.getKey();
            }
        }

        System.out.printf("Class average is %.2f. Lowest grade is %.0f (%s).", sum / (double)this.grades.size(), min, lowestStudent);
        System.out.println();
        System.out.printf("Highest grade is %.0f (%s).", max, highestStudent);
        System.out.println();
        this.outputBarChart();
    }

    public void outputBarChart() {
        System.out.println("Grades distribution:");
        int[] distribution = new int[11];

        for(double g : this.grades.values()) {
            ++distribution[(int)g / 10];
        }

        for(int i = 0; i < distribution.length; ++i) {
            if (i == 10) {
                System.out.print("100: ");
            } else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }

            for(int stars = 0; stars < distribution[i]; ++stars) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public String toString() {
        return "GradeBook for " + this.course.toString();
    }
}

