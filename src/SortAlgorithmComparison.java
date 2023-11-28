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
            case "QuickSort":
                QuickSort.sort(arrayCopy, 0, arrayCopy.length - 1);
                break;

        }

        long endTime = System.nanoTime();
        double sec = ((double) (endTime - startTime) / 1000000000.0);

        System.out.println(algorithmName + ": " + sec + " sec, with " + dataArray.length + " size data.");
    }

    public static void main(String[] args) {

        System.out.println("\n-------------------Test Data Size For 100 elements-------------------------");

        int[] sharedArray100 = generateRandomDataArray(100, 1000);


        testAlgorithmTime("RadixSort", sharedArray100);
        testAlgorithmTime("HeapSort", sharedArray100);
        testAlgorithmTime("QuickSort", sharedArray100);
        testAlgorithmTime("InsertionSort", sharedArray100);

        System.out.println("\n-------------------Test Data Size For 1K elements-------------------------");

        int[] sharedArray1K = generateRandomDataArray(1000, 1000);


        testAlgorithmTime("RadixSort", sharedArray1K);
        testAlgorithmTime("HeapSort", sharedArray1K);
        testAlgorithmTime("QuickSort", sharedArray1K);
        testAlgorithmTime("InsertionSort", sharedArray1K);

        System.out.println("\n-------------------Test Data Size For 10K elements-------------------------");

        int[] sharedArray10K = generateRandomDataArray(10000, 1000);


        testAlgorithmTime("RadixSort", sharedArray10K);
        testAlgorithmTime("HeapSort", sharedArray10K);
        testAlgorithmTime("QuickSort", sharedArray10K);
        testAlgorithmTime("InsertionSort", sharedArray10K);

        System.out.println("\n-------------------Test Data Size For 100K elements-------------------------");

        int[] sharedArray100K = generateRandomDataArray(100000, 10000);


        testAlgorithmTime("RadixSort", sharedArray100K);
        testAlgorithmTime("HeapSort", sharedArray100K);
        testAlgorithmTime("QuickSort", sharedArray100K);
        testAlgorithmTime("InsertionSort", sharedArray100K);

        System.out.println("\n-------------------Test Data Size For 250K elements-------------------------");

        int[] sharedArray250K = generateRandomDataArray(250000, 10000);


        testAlgorithmTime("RadixSort", sharedArray250K);
        testAlgorithmTime("HeapSort", sharedArray250K);
        testAlgorithmTime("QuickSort", sharedArray250K);
        testAlgorithmTime("InsertionSort", sharedArray250K);

        System.out.println("\n-------------------Test Data Size For 1M elements-------------------------");
        int[] sharedArray1M = generateRandomDataArray(1000000, 10000);


        testAlgorithmTime("RadixSort", sharedArray1M);
        testAlgorithmTime("HeapSort", sharedArray1M);
        testAlgorithmTime("QuickSort", sharedArray1M);
        testAlgorithmTime("InsertionSort", sharedArray1M);
    }

}