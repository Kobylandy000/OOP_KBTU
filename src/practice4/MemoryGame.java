package practice4;

public class MemoryGame implements IGame {

    @Override
    public void start() {
        System.out.println("MemoryGame started!");
    }

    @Override
    public void pause() {
        System.out.println("MemoryGame paused");
    }

    @Override
    public void stop() {
        System.out.println("MemoryGame stopped");
    }

    @Override
    public void saveProgress() {
        System.out.println("MemoryGame progress saved");
    }
}