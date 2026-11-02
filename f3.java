import java.util.Random;

public class f3 {
	public static void main(String[] args) {
		Random random = new Random();
		int value = random.nextInt(100) + 1;
		System.out.println("Random number: " + value);
	}
}
