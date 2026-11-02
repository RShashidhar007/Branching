import java.util.Random;

public class f2 {
	public static void main(String[] args) {
		Random random = new Random();
		int number = random.nextInt(100) + 1;
		int anotherNumber = random.nextInt(100) + 1;

		System.out.println("A random number between 1 and 100: " + number);
		System.out.println("Another random number between 1 and 100: " + anotherNumber);
	}
}
