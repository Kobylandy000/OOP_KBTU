package practice4;

import java.util.Comparator;

public class GpaComparator implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        return Double.compare(a.gpa, b.gpa);
    }
}