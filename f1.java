import java.util.Random;

public class F1 {
	public static void main(String[] args) {
		Random random = new Random();
		int total = 0;

		for (int i = 0; i < 5; i++) {
			int value = random.nextInt(100) + 1;
			System.out.println("Number " + (i + 1) + ": " + value);
			total += value;
		}

		System.out.println("Total: " + total);
	}
}
