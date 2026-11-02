import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class f4 {
	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> numbers = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			numbers.add(random.nextInt(100));
		}

		System.out.println("Random numbers: " + numbers);
		System.out.println("Largest number: " + numbers.stream().max(Integer::compareTo).orElse(0));
	}
}
