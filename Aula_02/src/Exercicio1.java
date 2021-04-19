import java.util.Scanner;

public class Exercicio1 {

	private static Scanner input;
	private static Scanner entrada;

	public static void main(String[] args) {
		// Exercicios 01 IW-Training Aula 02

		System.out.println("Questão 01");
		System.out.println("-------------");
		input = new Scanner(System.in);
		int idade = 5;

		// VALIDAÇÃO DE IDADE APENAS INT
		boolean validaIdade = false;
		do {
			System.out.printf("Informe sua idade : ");
			while (true)
				try {
					String age = input.next();
					idade = Integer.parseUnsignedInt(age);
					break;
				} catch (NumberFormatException nfe) {
					System.out.print("Informe uma idade válida : ");
				}
		} while (validaIdade);

		System.out.println((idade <= 17) ? "Menor de idade" : "Maior de idade");
		System.out.println("-----FIM-----");
		/* ---------------- */

		/* -- Questão 02 -- */
		System.out.println("Questão 02");
		System.out.println("-------------");
		entrada = new Scanner(System.in);

		double nota1, nota2, nota3, nota4, nota5, media, notaFinal, mediaFinal;

		System.out.println("Digite a 1° nota : ");
		nota1 = entrada.nextDouble();

		System.out.println("Digite a 2° nota : ");
		nota2 = entrada.nextDouble();

		System.out.println("Digite a 3° nota : ");
		nota3 = entrada.nextDouble();

		System.out.println("Digite a 4° nota : ");
		nota4 = entrada.nextDouble();

		System.out.println("Digite a 5° nota : ");
		nota5 = entrada.nextDouble();

		media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

		System.out.println("------------------------------");
		if (media >= 7) {
			System.out.println("Aluno aprovado!");
		} else if (media >= 5 && media <= 6) {
			System.out.println("Digite a nota final : ");
			notaFinal = entrada.nextDouble();
			mediaFinal = (notaFinal + media) / 2;
			if (mediaFinal >= 5) {
				System.out.println("Aluno Aprovado na média final");
			} else 
				System.out.println("Aluno reprovado");
		}
		System.out.println("-----FIM-----");
		/* ---------------- */

	}

}
