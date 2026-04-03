package lab3.task5;

/**
 * TASK 5: Sort класы — Comparable болған кез келген нәрсені сорттай алады
 * Generic <T extends Comparable<T>> арқылы
 */
public class Sort {

    /**
     * Екі элементті орын ауыстыру — барлық алгоритмдерде қолданылады
     */
    public static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Bubble Sort — өлтірбе сорттау
     * Уақыт күрделілігі: O(n²)
     */
    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            // Егер ешқандай орын ауыстыру болмаса — массив сортталған
            if (!swapped) break;
        }
    }

    /**
     * Merge Sort — біріктіру сорттауы
     * Уақыт күрделілігі: O(n log n)
     */
    public static <T extends Comparable<T>> void mergeSort(T[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    // Merge Sort үшін көмекші merge әдісі
    @SuppressWarnings("unchecked")
    private static <T extends Comparable<T>> void merge(T[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        T[] L = (T[]) new Comparable[n1];
        T[] R = (T[]) new Comparable[n2];

        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    // Қолайлылық үшін — бүкіл массивке Merge Sort шақыру
    public static <T extends Comparable<T>> void mergeSort(T[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    // Массивті экранға шығару
    public static <T> void printArray(T[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
