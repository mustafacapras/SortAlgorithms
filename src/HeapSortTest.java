import java.util.Random;

public class HeapSortTest {
    public static int[] generateDataArray(
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
            int size,
            int bound
    ) {
        long startTime = System.nanoTime();
        HeapSort.sort(generateDataArray(size, bound));
        long endTime = System.nanoTime();
        double sec = ((double) (endTime - startTime) / 1000000000.0);

        System.out.println(testNumber + ". Test : Time taken by " + algorithmName + ": " + sec + " sec, with " + size + " size data.");
    }
}