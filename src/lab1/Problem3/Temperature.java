package lab1.Problem3;

public class Temperature {

    private double value;
    private char scale; // 'C' or 'F'

    public Temperature() {
        this.value = 0;
        this.scale = 'C';
    }

    public Temperature(double value) {
        this.value = value;
        this.scale = 'C';
    }

    public Temperature(char scale) {
        this.value = 0;
        this.scale = scale;
    }

    public Temperature(double value, char scale){
        this.value = value;
        if (scale == 'C' || scale == 'F'){
            this.scale = scale;
        }else{
            scale = 'C';
        }
    }

    public double getCelsius(){
        if(scale == 'C') return value;
        else return 5 * (value - 32) / 9;
    }

    public double getFahrenheit(){
        if(scale == 'F') return value;
        else return (9 * value / 5) + 32;
    }

    public char getScale() {
        return scale;
    }

    public void setValue(double val){
        this.value = val;
    }

    public void setScale(char scale){
        if (scale == 'C' || scale == 'F'){
            this.scale = scale;
        }else{
            System.out.println("You must enter C or F");
        }
    }


    @Override
    public String toString() {
        return value + " " + scale;
    }
}