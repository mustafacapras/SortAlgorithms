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


    public static void main(String[] args) {

    }
}
