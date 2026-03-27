package practice4;

public class LogicGame implements Game {

    @Override
    public void start() {
        System.out.println("LogicGame started!");
    }

    @Override
    public void pause() {
        System.out.println("LogicGame paused");
    }

    @Override
    public void stop() {
        System.out.println("LogicGame stopped");
    }
}