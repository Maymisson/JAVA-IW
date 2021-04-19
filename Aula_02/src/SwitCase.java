import java.util.Scanner;

public class SwitCase {

	private static Scanner input;

	public static void main(String[] args) {
		// ESTRUTURA SWITCH CASE EXEMPLO

		input = new Scanner(System.in);

		int nota1, nota2, nota3, nota4;

		System.out.println("Digite um numero inteiro: ");
		nota1 = input.nextInt();

		System.out.println("Digite um numero inteiro: ");
		nota2 = input.nextInt();

		System.out.println("Digite um numero inteiro: ");
		nota3 = input.nextInt();

		System.out.println("Digite um numero inteiro: ");
		nota4 = input.nextInt();

		int media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("------------------------------");

		switch (media) {
		case 1:
			System.out.println("Aluno Reprovado");
			break;
		case 2:
			System.out.println("Aluno Reprovado");
			break;
		case 3:
			System.out.println("Aluno Reprovado");
			break;
		case 4:
			System.out.println("Aluno Reprovado");
			break;
		case 5:
			System.out.println("Aluno Reprovado");
			break;

		case 6:
			System.out.println("Aluno Aprovado");
			break;
		case 7:
			System.out.println("Aluno Aprovado");
			break;
		case 8:
			System.out.println("Aluno Aprovado");
			break;
		case 9:
			System.out.println("Aluno Aprovado");
			break;
		case 10:
			System.out.println("Aluno Aprovado");
			break;
		}

	}

}
