package practice4;

public class CountingSort {

    public static int[] sort(int[] a, int max) {
        int[] b = new int[max + 1];

        for (int i = 0; i < a.length; i++) {
            b[a[i]]++;
        }

        int[] sorted = new int[a.length];
        int idx = 0;
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j < b[i]; j++) {
                sorted[idx++] = i;
            }
        }
        return sorted;
    }
}