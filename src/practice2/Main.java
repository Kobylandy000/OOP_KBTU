package practice2;

public class Main {
    public static void main(String[] args) {

        // problem 1
        Student s = new Student("Beibarys", 70);

        System.out.println(s.getName());
        System.out.println(s.getId());
        System.out.println(s.getYearofStudy());

        s.incrementYearofStudy();
        System.out.println(s.getYearofStudy());

        //problem 2
        StartTriangle small = new StartTriangle(3);
        System.out.println(small);


        //problem 3
        Time t = ScannerTime.scanTime();

        System.out.println("Universal: " + t.toUniversal());
        System.out.println("Standard: " + t.toStandard());
        System.out.println("Add time");

        Time t2 = ScannerTime.scanTime();
        t.add(t2);

        System.out.println("After add");
        System.out.println("Universal: " + t.toUniversal());
        System.out.println("Standard: " + t.toStandard());
    }
}

