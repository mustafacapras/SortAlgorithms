import java.util.Arrays;

public class RadixSort {
    public static int[] sort(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(0);

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }

        return arr;
    }

}
