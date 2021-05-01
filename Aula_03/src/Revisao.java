import java.util.Scanner;

public class Revisao {

	private static Scanner input;

	public static void main(String[] args) {
		
		// Exercicio 2 - revisão com iteração FOR
		int N = 4;
		int j = 1;
		double soma = 0;
		double mediaAnual = 0;
		double mediaFinal = 0;
		double provaFinal = 0;
		double[] nota = new double[N];

		input = new Scanner(System.in);

		for (int i = 0; i < nota.length ; i++) {
			System.out.println("Digite a nota " + (j + i) + " : ");
			nota[i] = input.nextDouble();
			soma = soma + nota[i];
		}
		
		mediaAnual = (soma/N);
		
		if (mediaAnual < 5) {
			System.out.println("Aluno reprovado!");
		} else if (mediaAnual >=8) {
			System.out.println("Aluno aprovado!");
		} else {
			System.out.println("Aluno de recuperação!");
			System.out.println();
			System.out.println("Informe a nota da prova final : ");
			provaFinal = input.nextDouble();
			
			mediaFinal = (provaFinal + mediaAnual) / 2 ;
			
			System.out.println((mediaFinal >= 5) ? "Aluno aprovado na média final!" : "Aluno reprovado na média final!");
		}

	}

}
