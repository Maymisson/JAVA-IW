import java.util.Scanner;

public class ExerRepeticao8 {

	private static Scanner entrada;

	public static void main(String[] args) {
		// Dado três números, determine se este é um número triangular;
		
		/*Dizemos que um número natural é triangular se ele é produto de três números naturais 
		consecutivos. Exemplo: 120 é triangular, pois 4.5.6 = 120.
		Dado um inteiro não negativo n, verificar se n é triangular.*/
		
		entrada = new Scanner(System.in);
		int mult = 1; 
		int numeros[] = new int[3];
		
		for (int n = 0 ; n < numeros.length ; n ++) {
			System.out.println("Informe o número : ");
			int numero = entrada.nextInt();
			mult = mult * numero; 
		}
		System.out.println("Número natural = " + mult);
		System.out.println("");
		System.out.println("Verificando se " + mult + " é triangular...");
		
		int auxiliar = 0;
		for (int i = 1 ; i * (i + 1) * (i + 2) <= mult ; i++) {
			if (i * (i + 1) * (i + 2) == mult) {
				auxiliar = 1;
			}
		}
		if (auxiliar == 1) System.out.println("É triangular");
		else System.out.println("Não é triangular");
	}

}
