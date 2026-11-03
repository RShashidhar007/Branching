import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class f2 {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(RANDOM.nextInt(100));
        }

        System.out.println("Random numbers: " + numbers);

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);

        List<Integer> evens = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evens.add(number);
            }
        }
        System.out.println("Even numbers: " + evens);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append((char) ('a' + RANDOM.nextInt(26)));
        }
        System.out.println("Random letters: " + sb);
    }
}
