package practice2;

public class Student {
    private String name;
    private int id;
    private int yearofStudy;

    public Student(){};
    public Student(String name, int id){
        this.name = name;
        this.id = id;
        this.yearofStudy = 1;
    }

    public String getName(){
        return name;
    }

    public int getId() {
        return id;
    }

    public void incrementYearofStudy() {
        yearofStudy ++;
    }

    public int getYearofStudy() {
        return yearofStudy;
    }

}
