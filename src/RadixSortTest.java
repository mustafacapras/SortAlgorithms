import java.util.Arrays;
import java.util.Random;

public class RadixSortTest {

    public static int[] generateDataArray(
            final int size,
            final int bound
    ) {
        Random random = new Random();
        int[] randomDataArray = new int[size];

        for (int i = 0; i < randomDataArray.length; i++) {
            randomDataArray[i] = random.nextInt(bound);
        }

        return randomDataArray;
    }

    public static void testAlgorithmTime(
            final String testNumber,
            final String algorithmName,
            int size,
            final int bound
    ) {
        final long startTime = System.nanoTime();
        RadixSort.sort(generateDataArray(size, bound));
        long endTime = System.nanoTime();
        double sec = ((double) (endTime - startTime) / 1000000000.0);

        System.out.println(testNumber + ". Test : Time taken by " + algorithmName + ": " + sec + " sec, with " + size + " size data.");
    }

    public static void testAlgorithm(String algorithmName, int size, int bound) {
        int[] sortedArray = RadixSort.sort(generateDataArray(size, bound));
        System.out.println("Sorted Array (using " + algorithmName + "): " + Arrays.toString(sortedArray));

        // Check if the array is sorted
        if (isSorted(sortedArray)) {
            System.out.println("Sorting is correct.\n");
        } else {
            System.out.println("Sorting is incorrect.\n");
        }
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

    }
}
