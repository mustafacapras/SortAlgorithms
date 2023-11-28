import java.util.Arrays;

public class RadixSort {
    public static int[] sort(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(0);

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }

        return arr;
    }

    private static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        Arrays.fill(count, 0);

        for (int value : arr) {
            count[(value / exp) % 10]++;
        }

    }
}
