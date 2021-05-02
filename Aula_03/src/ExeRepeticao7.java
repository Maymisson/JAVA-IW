
public class ExeRepeticao7 {

	public static void main(String[] args) {
		// Faça a soma dos números primos entre 100 e 300;
		int soma = 0;
		for (int i = 100; i <= 300; i++) {
			if (primo(i)) {
				System.out.println("O número: " + i + " é primo");
				soma = soma + i;
			}
		}
		System.out.println("");
		System.out.println("Soma dos primos entre 100 e 300 é : " + soma);
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
