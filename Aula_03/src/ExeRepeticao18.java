import java.util.Scanner;

public class ExeRepeticao18 {

	private static Scanner entrada;
	private static int num;

	public static void main(String[] args) {
		/*
		 * Escreva um algoritmo que leia um valor inicial A e imprima a seqüência de
		 * valores do cálculo de A! e o seu resultado. Ex: 5! = 5 X 4 X 3 X 2 X 1 = 120;
		 */

		entrada = new Scanner(System.in);
		System.out.println("Informe o valor inicial x! : ");
		num = entrada.nextInt();

		for (long i = 0; i <= num; i++) {
			System.out.println(i + "! = " + fatorial(i));
		}
	}
	// Metodo para identificar o fatorial n! = n (n − 1)!
	public static long fatorial(long num) {
		if (num <= 1)
			return 1;
		else
			return num * fatorial(num - 1);

	}

}
