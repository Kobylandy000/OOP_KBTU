package lab3.task6;

/**
 * CUSTOM INTERFACE 2: Validatable
 * Деректерін тексере алатын объектілер үшін
 */
public interface Validatable {
    boolean isValid();
    String getValidationErrors();

    default void printValidationStatus() {
        if (isValid()) {
            System.out.println("[Тексеру] ✓ Деректер дұрыс.");
        } else {
            System.out.println("[Тексеру] ✗ Қателер: " + getValidationErrors());
        }
    }
}
