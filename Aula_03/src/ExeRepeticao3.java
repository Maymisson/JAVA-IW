import java.util.Scanner;

public class ExeRepeticao3 {

	private static Scanner input;
	private static int escolhido;
	private static int n;

	public static void main(String[] args) {

		int soma = 0;
		input = new Scanner(System.in);

		System.out.println("informe o número máximo : ");
		n = input.nextInt();
		System.out.println("Informe o número de parada da soma : ");
		escolhido = input.nextInt();

		for (int i = 0; i <= escolhido; i++) {
			if (!(i % 2 == 0)) {
				soma = soma + i;
			}

		}
		System.out.println("máximo informado = " + n);
		System.out.println("Somar até = " + escolhido);
		System.out.println("Soma dos ímpares = " + soma);

	}

}
