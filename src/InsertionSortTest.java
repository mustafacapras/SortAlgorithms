import java.util.Arrays;
import java.util.Random;

public class InsertionSortTest {
    public static int[] generateRandomDataArray(
            int size,
            int bound
    ) {
        Random random = new Random();
        int[] randomDataArray = new int[size];

        for (int i = 0; i < randomDataArray.length; i++) {
            randomDataArray[i] = random.nextInt(bound);
        }

        return randomDataArray;
    }

    public static void testAlgorithmTime(
            String testNumber,
            String algorithmName,
            int size, int bound
    ) {
        long startTime = System.nanoTime();
        InsertionSort.sort(generateRandomDataArray(size, bound));
        long endTime = System.nanoTime();
        double sec = ((double) (endTime - startTime) / 1000000000.0);

        System.out.println(testNumber + ". Test : Time " + algorithmName + ": " + sec + " sec, with " + size + " size data.");
    }

    public static void testAlgorithm(
            String algorithmName,
            int size,
            int bound
    ) {
        int[] sortedArray = InsertionSort.sort(generateRandomDataArray(size, bound));
        System.out.println("Sorted Array (using " + algorithmName + "): " + Arrays.toString(sortedArray));


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

    /*public static void main(String[] args) {
        int testSize = 10;
        int dataBound = 100;


        testAlgorithmTime("1", "InsertionSort", testSize, dataBound);


        testAlgorithm("InsertionSort", testSize, dataBound);
    }*/
}




