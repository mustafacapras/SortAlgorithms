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


    public static void main(String[] args) {

    }
}
