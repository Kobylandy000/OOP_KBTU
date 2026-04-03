package lab3.task6;

/**
 * CUSTOM INTERFACE 1: Describable
 * Өзін сипаттай алатын объектілер үшін
 */
public interface Describable {
    String describe();

    default void printDescription() {
        System.out.println("[Сипаттама] " + describe());
    }
}
