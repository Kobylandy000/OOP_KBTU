package lab3.Problem1;

public class Data{
    private double sum;
    private double max;
    private int count;

    public Data(){
        this.max = 0;
        this.sum = 0;
        this.count = 0;
    };

    public void addValue(double number){
        if(number > max){
            max = number;
        }
        sum += number;
        count++;
    }

    public double getAverage(){
        if(count == 0){
            return 0;
        }
        return sum/count;
    }

    public double getMaximum(){
        return max;
    }
}
