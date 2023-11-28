import java.util.Arrays;
import java.util.Random;

public class SortAlgorithmComparison {

    public static int[] generateRandomDataArray(int size, int bound) {
        Random random = new Random();
        int[] randomDataArray = new int[size];

        for (int i = 0; i < randomDataArray.length; i++) {
            randomDataArray[i] = random.nextInt(bound);
        }

        return randomDataArray;
    }

    public static void testAlgorithmTime(String algorithmName, int[] dataArray) {
        int[] arrayCopy = Arrays.copyOf(dataArray, dataArray.length);

        final long startTime = System.nanoTime();

        switch (algorithmName) {
            case "RadixSort":
                RadixSort.sort(arrayCopy);
                break;
            case "InsertionSort":
                InsertionSort.sort(arrayCopy);
                break;
            case "HeapSort":
                HeapSort.sort(arrayCopy);
                break;
            case "QuickSort":  // Add QuickSort case
                QuickSort.sort(arrayCopy, 0, arrayCopy.length - 1);
                break;

        }

        long endTime = System.nanoTime();
        double sec = ((double) (endTime - startTime) / 1000000000.0);

        System.out.println(algorithmName + ": " + sec + " sec, with " + dataArray.length + " size data.");
    }
}