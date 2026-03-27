package practice4;

public class App {
    public void getStatistics(Game g) {
        System.out.println("Getting stats for: " + g.getClass().getSimpleName());
        g.start();
    }
}