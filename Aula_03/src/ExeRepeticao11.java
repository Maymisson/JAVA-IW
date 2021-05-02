import java.util.Scanner;

public class ExeRepeticao11 {

	private static Scanner entrada;

	public static void main(String[] args) {
		// Dado 100 números, some aqueles que estão entre 50 e 87.
		
		entrada = new Scanner(System.in);
		int soma = 0, num = 0;
		System.out.print("Informe a quantidade de números a serem lidos : ");
		int quant = entrada.nextInt();
		
		int numeros[] = new int[quant];
		
		for (int i = 0; i < numeros.length ; i++) {
			System.out.println("Informe o " +(i+1)+ "° número : ");
			num = entrada.nextInt();
			if (num >= 50 && num <= 87) {
				soma = soma + num;
			}
		}
		System.out.println("A soma é = " + soma);
	}

}
