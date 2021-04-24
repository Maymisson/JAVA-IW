import java.util.Scanner;

public class ExercicioMetClasseObjetoOne {

	private static Scanner entrada;
	private static String operacao;

	public static void main(String[] args) {
		// CHAMADA DE METODOS DO EXERCICIO 1 AULA 3

		System.out.printf("+------------- Questões -------------+\n");
		System.out.printf("| 1  Metodos de Classe com 2 números |\n");
		System.out.printf("| 2  Metodos de Classe com 3 números |\n");
		System.out.printf("| 3  Metodos de Objeto com 2 números |\n");
		System.out.printf("| 4  Metodos de Objeto com 3 números |\n");
		System.out.printf("+------------------------------------+\n\n");

		System.out.printf("+------------------------------------+\n\n");

		entrada = new Scanner(System.in);
		System.out.printf("Informe a opção desejada : ");
		operacao = entrada.nextLine();
		
		OperacaoMatematica op = new OperacaoMatematica();
		
		if (operacao.equals("1")) {
			op.opeeracaoClasse();
		} else if (operacao.equals("2")) {
			op.opeeracaoClasse2();
		} else if (operacao.equals("3")) {
			op.opeeracaoObjeto();
		} else if (operacao.equals("4")) {
			op.opeeracaoObjeto2();
		} else {
			System.out.println("Opção inválida!");
		}
		
		

	}

}
