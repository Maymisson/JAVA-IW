
public class ExeRpeticao6 {

	public static void main(String[] args) {
		// Determine os números primos de 1 a 1000;

		for (int i = 1; i <= 1000; i++) {
			if (primo(i)) {
				System.out.println("O número: " + i + " é primo");
			}

		}

	}

	public static boolean primo(int x) {

		int count = 2;

		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				count++;
			}
		}

		return count == 2;

	}

}
