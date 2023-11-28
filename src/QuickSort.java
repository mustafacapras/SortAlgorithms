public class QuickSort {

    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);

            /* Recursively sort elements before and after partition*/
            sort(arr, low, partitionIndex - 1);
            sort(arr, partitionIndex + 1, high);
        }
    }
}
