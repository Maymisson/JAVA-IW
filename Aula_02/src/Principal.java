import java.util.Scanner;

public class Principal {


	private static Scanner entrada;
	private static String operacao;

	public static void main(String[] args) {
		// CHAMADA DE METODOS DO EXERCICIO 2 AULA 2
		
		System.out.printf("+-- Questões --+\n");
		System.out.printf("| 1  Questão 1 |\n");
		System.out.printf("| 2  Questão 2 |\n");
		System.out.printf("| 3  Questão 3 |\n");
		System.out.printf("| 4  Questão 4 |\n");
		System.out.printf("| 4  Questão 5 |\n");
		System.out.printf("+--------------+\n\n");

		System.out.printf("+------------------------------------+\n\n");
		
		entrada = new Scanner(System.in);
		System.out.printf("Informe a questão desejada desejada : ");
		operacao = entrada.nextLine();
		
		if (operacao.equals("1")) {
			Exercicio2.questaoOne();
		} else if (operacao.equals("2")) {
			Exercicio2.questaoTwo();
		}
		
	}

}
