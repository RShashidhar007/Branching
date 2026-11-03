import java.util.Arrays;
import java.util.Random;

public class f1 {
    private static final Random RANDOM = new Random();

    public static int[] generateRandomArray(int size, int min, int max) {
        int[] values = new int[size];
        for (int i = 0; i < size; i++) {
            values[i] = RANDOM.nextInt(max - min + 1) + min;
        }
        return values;
    }

    public static void printStats(int[] values) {
        int total = 0;
        int min = values[0];
        int max = values[0];

        for (int value : values) {
            total += value;
            min = Math.min(min, value);
            max = Math.max(max, value);
        }

        double average = (double) total / values.length;
        System.out.println("Values: " + Arrays.toString(values));
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {
        int[] nums = generateRandomArray(12, -50, 50);
        printStats(nums);

        int[] shuffled = nums.clone();
        for (int i = shuffled.length - 1; i > 0; i--) {
            int j = RANDOM.nextInt(i + 1);
            int temp = shuffled[i];
            shuffled[i] = shuffled[j];
            shuffled[j] = temp;
        }

        System.out.println("Shuffled: " + Arrays.toString(shuffled));
        Arrays.sort(shuffled);
        System.out.println("Sorted: " + Arrays.toString(shuffled));
    }
}
