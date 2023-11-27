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

    public static void testAlgorithmTime() {
    }
}