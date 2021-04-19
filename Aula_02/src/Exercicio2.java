import java.util.Scanner;

public class Exercicio2 {

	// Exercicios 02 IW-Training Aula 02

	public int numero1;
	public int numero2;
	public int resultado;
	private static Scanner entrada;

	private static int soma(int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}

	private static int subtracao(int num1, int num2) {
		int resultado = num1 - num2;
		return resultado;
	}

	private static int multiplicacao(int num1, int num2) {
		int resultado = num1 * num2;
		return resultado;
	}

	private static int divisao(int num1, int num2) {
		int resultado = num1 / num2;
		return resultado;
	}

	private static double soma(double num1, double num2, double num3) {
		double resultado = num1 + num2 + num3;
		return resultado;
	}

	private static double subtracao(double num1, double num2, double num3) {
		double resultado = num1 - num2 - num3;
		return resultado;
	}

	private static double multiplicacao(double num1, double num2, double num3) {
		double resultado = num1 * num2 * num3;
		return resultado;
	}

	private static double divisao(double num1, double num2, double num3) {
		double resultado = num1 / num2 / num3;
		return resultado;
	}

	private static String nomeApelido(String nome, String apelido) {
		return ("Nome : " + nome + "  | " + "Apelido : " + apelido);
	}

	private static String idadeNascimento(int idade, int nascimento) {
		return ("Idade : " + idade + "    | " + "Ano de nascimento : " + nascimento);
	}

	private static String alturaPeso(float altura, float peso) {
		return ("Altura : " + altura + " | " + "Peso : " + peso);
	}

	public static void questaoOne() {
		String operacao;
		int numero1, numero2;
		double number1, number2, number3;

		System.out.printf("+-- Operações -----------------------+\n");
		System.out.printf("| +  para soma simpes                |\n");
		System.out.printf("| -  para subtração simples          |\n");
		System.out.printf("| *  para multiplicação simples      |\n");
		System.out.printf("| /  para divisão simples            |\n");
		System.out.printf("| ++ para soma de 3 numeros          |\n");
		System.out.printf("| -- para subtração de 3 numeros     |\n");
		System.out.printf("| ** para multiplicação de 3 numeros |\n");
		System.out.printf("| // para divisão de 3 numeros       |\n");
		System.out.printf("+------------------------------------+\n\n");

		System.out.printf("+------------------------------------+\n\n");

		entrada = new Scanner(System.in);
		System.out.printf("Informe a operação desejada : ");
		operacao = entrada.nextLine();

		switch (operacao) {
		case "+":
			System.out.printf("Informe o 1° numero inteiro : ");
			numero1 = entrada.nextInt();
			System.out.printf("Informe o 2° numero inteiro : ");
			numero2 = entrada.nextInt();
			System.out.println("A soma é : " + Exercicio2.soma(numero1, numero2));
			break;
		case "-":
			System.out.printf("Informe o 1° numero inteiro : ");
			numero1 = entrada.nextInt();
			System.out.printf("Informe o 2° numero inteiro : ");
			numero2 = entrada.nextInt();
			System.out.println("A subtração é : " + Exercicio2.subtracao(numero1, numero2));
			break;
		case "*":
			System.out.printf("Informe o 1° numero inteiro : ");
			numero1 = entrada.nextInt();
			System.out.printf("Informe o 2° numero inteiro : ");
			numero2 = entrada.nextInt();
			System.out.println("A multiplicação é : " + Exercicio2.multiplicacao(numero1, numero2));
			break;
		case "/":
			System.out.printf("Informe o 1° numero inteiro : ");
			numero1 = entrada.nextInt();
			System.out.printf("Informe o 2° numero inteiro : ");
			numero2 = entrada.nextInt();
			System.out.println("A divisão é : " + Exercicio2.divisao(numero1, numero2));
			break;
		case "++":
			System.out.printf("Informe o 1° numero : ");
			number1 = entrada.nextDouble();
			System.out.printf("Informe o 2° numero : ");
			number2 = entrada.nextDouble();
			System.out.printf("Informe o 2° numero : ");
			number3 = entrada.nextDouble();
			System.out.println("A soma entre os 3 é : " + Exercicio2.soma(number1, number2, number3));
			break;
		case "--":
			System.out.printf("Informe o 1° numero : ");
			number1 = entrada.nextDouble();
			System.out.printf("Informe o 2° numero : ");
			number2 = entrada.nextDouble();
			System.out.printf("Informe o 2° numero : ");
			number3 = entrada.nextDouble();
			System.out.println("A subtração entre os 3 é : " + Exercicio2.subtracao(number1, number2, number3));
			break;
		case "**":
			System.out.printf("Informe o 1° numero : ");
			number1 = entrada.nextDouble();
			System.out.printf("Informe o 2° numero : ");
			number2 = entrada.nextDouble();
			System.out.printf("Informe o 2° numero : ");
			number3 = entrada.nextDouble();
			System.out.println("A multiplicação entre os 3 é : " + Exercicio2.multiplicacao(number1, number2, number3));
			break;
		case "//":
			System.out.printf("Informe o 1° numero : ");
			number1 = entrada.nextDouble();
			System.out.printf("Informe o 2° numero : ");
			number2 = entrada.nextDouble();
			System.out.printf("Informe o 2° numero : ");
			number3 = entrada.nextDouble();
			System.out.println("A divisão entre os 3 é : " + Exercicio2.divisao(number1, number2, number3));
			break;
		default:
			System.out.println("ERRO :: Opção inválida");
			break;
		}
	}

	public static void questaoTwo() {
		String operacao, nome, apelido; 
		float altura, peso; 
		int idade, nascimento;
		//double altura, peso;

		entrada = new Scanner(System.in);
		System.out.printf("Informe (C) para realizar o cadastro : ");
		operacao = entrada.nextLine();

		switch (operacao) {
		case "c":
			System.out.printf("Informe seu nome : ");
			nome = entrada.nextLine();
			System.out.printf("Informe seu apelido : ");
			apelido = entrada.nextLine();
			System.out.printf("Informe seu peso : ");
			peso = entrada.nextFloat();
			System.out.printf("Informe sua idade : ");
			idade = entrada.nextInt();
			System.out.printf("Informe o ano de nascimento : ");
			nascimento = entrada.nextInt();
			System.out.printf("Informe sua altura : ");
			altura = entrada.nextFloat();
			
			System.out.printf("+----------------------------------------+\n");
			System.out.println(nomeApelido(nome, apelido));
			System.out.println(idadeNascimento(idade, nascimento));
			System.out.println(alturaPeso(altura, peso));
			System.out.printf("+----------------------------------------+\n");
			break;
		case "C":
			System.out.printf("Informe seu nome : ");
			nome = entrada.nextLine();
			System.out.printf("Informe seu apelido : ");
			apelido = entrada.nextLine();
			System.out.printf("Informe seu peso : ");
			peso = entrada.nextFloat();
			System.out.printf("Informe sua idade : ");
			idade = entrada.nextInt();
			System.out.printf("Informe o ano de nascimento : ");
			nascimento = entrada.nextInt();
			System.out.printf("Informe sua altura : ");
			altura = entrada.nextFloat();
			
			System.out.printf("+----------------------------------------+\n");
			System.out.println(nomeApelido(nome, apelido));
			System.out.println(idadeNascimento(idade, nascimento));
			System.out.println(alturaPeso(altura, peso));
			System.out.printf("+----------------------------------------+\n");
			break;
		default:
			System.out.println("ERRO :: Opção inválida");
			break;
		}
		
		

	}

}
