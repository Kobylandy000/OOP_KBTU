package lab1.Problem4;

public class Course {
    private String name;
    private String description;
    private int credits;
    private String prerequisites;

    public Course(String name, String description, int credits, String prerequisites) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }

    public String toString() {
        return this.name + " " + this.description;
    }
}
