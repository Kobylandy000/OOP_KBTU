package lab3.Problem3;

public class Main {

    public static void main(String[] args) {

        Temperature t1 = new Temperature(25, 'C');
        System.out.println("Stored: " + t1);
        System.out.println("Celsius: " + t1.getCelsius());
        System.out.println("Fahrenheit: " + t1.getFahrenheit());
        t1.setValue(90);
        System.out.println("Celsius: " + t1.getCelsius());
        System.out.println();
        t1.setScale('F');
        System.out.println("After changing the scale");
        System.out.println("Stored: " + t1);
        System.out.println("Celsius: " + t1.getCelsius());
        System.out.println("Fahrenheit: " + t1.getFahrenheit());
        System.out.println();

        Temperature t2 = new Temperature(77, 'F');
        System.out.println("Stored: " + t2);
        System.out.println("Celsius: " + t2.getCelsius());
        System.out.println("Fahrenheit: " + t2.getFahrenheit());

        System.out.println(t2.getScale());


    }
}
