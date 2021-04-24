import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

	// Exercicios 02 IW-Training Aula 02

	private static Scanner entrada;

	// -- Metodos Logicos -- //

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

	private static List<List<Integer>> listaParesImpares(List<Integer> numeros) {
		// Instancia uma lista para numeros pares e uma para os impares
		List<Integer> listaPares = new ArrayList<>();
		List<Integer> listaImpares = new ArrayList<>();

		// Para cadas numero na lista de numeros passados no parametro faça
		numeros.forEach(numbers -> {
			// Se o numero for divisivel por 2 adicione-o a lista de pares
			if (numbers % 2 == 0)
				listaPares.add(numbers);
			// Senao adicione-o a lista de impares
			else
				listaImpares.add(numbers);
		});
		// Criasse uma Lista de Listas de inteiro
		List<List<Integer>> resultado = new ArrayList<>();

		// Adicionasse a lista de numeros pares
		resultado.add(listaPares);

		// Adicionasse a lista de numeros impares
		resultado.add(listaImpares);

		// O resultado sera uma lista onde no indice 0 voce
		// tera uma lista contendo os numeros pares e no indice 1
		// uma lista dos numeros impares
		return resultado;
	}
	
	

	// -- Metodos das questões -- //

	public static void questaoOne() {
		String operacao;
		int numero1, numero2;
		double number1, number2, number3;
		
		System.out.println("\n");
		System.out.printf("+-------------Questão 01-------------+\n");

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
			System.out.printf("Informe o 3° numero : ");
			number3 = entrada.nextDouble();
			System.out.println("A subtração entre os 3 é : " + Exercicio2.subtracao(number1, number2, number3));
			break;
		case "**":
			System.out.printf("Informe o 1° numero : ");
			number1 = entrada.nextDouble();
			System.out.printf("Informe o 2° numero : ");
			number2 = entrada.nextDouble();
			System.out.printf("Informe o 3° numero : ");
			number3 = entrada.nextDouble();
			System.out.println("A multiplicação entre os 3 é : " + Exercicio2.multiplicacao(number1, number2, number3));
			break;
		case "//":
			System.out.printf("Informe o 1° numero : ");
			number1 = entrada.nextDouble();
			System.out.printf("Informe o 2° numero : ");
			number2 = entrada.nextDouble();
			System.out.printf("Informe o 3° numero : ");
			number3 = entrada.nextDouble();
			System.out.println("A divisão entre os 3 é : " + Exercicio2.divisao(number1, number2, number3));
			break;
		default:
			System.out.println("ERRO :: Opção inválida");
			break;
		}
	}

	public static void questaoTwo() {
		String nome, apelido;
		float altura, peso;
		int idade, nascimento;
		
		System.out.println("\n");
		System.out.printf("+-------------Questão 02-------------+\n");

		entrada = new Scanner(System.in);

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

	}

	public static void questaoThree() {

		int num1, num2, num3;
		
		System.out.println("\n");
		System.out.printf("+-------------Questão 03-------------+\n");

		entrada = new Scanner(System.in);

		System.out.printf("Informe o 1° numero : ");
		num1 = entrada.nextInt();
		System.out.printf("Informe o 2° numero : ");
		num2 = entrada.nextInt();
		System.out.printf("Informe o 3° numero : ");
		num3 = entrada.nextInt();
		List<List<Integer>> listaParesImpares = listaParesImpares(Arrays.asList(num1, num2, num3));

		System.out.println("Impressao dos Numeros Pares");
		List<Integer> listaPares = listaParesImpares.get(0);
		listaPares.forEach(System.out::println);

		System.out.println("Impressao dos Numeros Impares");
		List<Integer> listaImpares = listaParesImpares.get(1);
		listaImpares.forEach(System.out::println);

	}

	public static void questaoFor() {
		int num1, num2, num3;
		
		System.out.println("\n");
		System.out.printf("+-------------Questão 04-------------+\n");

		entrada = new Scanner(System.in);

		System.out.printf("Informe o 1° numero : ");
		num1 = entrada.nextInt();
		System.out.printf("Informe o 2° numero : ");
		num2 = entrada.nextInt();
		System.out.printf("Informe o 3° numero : ");
		num3 = entrada.nextInt();

		if ((num1 > num2 && num1 < num3) || (num1 > num3 && num1 < num2)) {
			System.out.println("Numero " + num1 + " esta entre " + num2 + " e " + num3);
		} else if ((num2 > num1 && num2 < num3) || (num2 > num3 && num2 < num1)) {
			System.out.println("Numero " + num2 + " esta entre " + num1 + " e " + num3);
		} else if ((num3 > num1 && num3 < num2) || (num3 > num2 && num3 < num1)) {
			System.out.println("Numero " + num3 + " esta entre " + num1 + " e " + num2);
		} else {
			System.out.println("Numeros identicos ou inválidos!");
		}
	}

	public static void questaoFive() {
		int num1, num2, num3, num4;
		
		System.out.println("\n");
		System.out.printf("+-------------Questão 05-------------+\n");

		entrada = new Scanner(System.in);

		System.out.printf("Informe o 1° numero : ");
		num1 = entrada.nextInt();
		System.out.printf("Informe o 2° numero : ");
		num2 = entrada.nextInt();
		System.out.printf("Informe o 3° numero : ");
		num3 = entrada.nextInt();
		System.out.printf("Informe o 4° numero : ");
		num4 = entrada.nextInt();
		
		System.out.println("\n");
		System.out.printf("+------------------------------------+\n");
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(num1);
		list.add(num2);
		list.add(num3);
		list.add(num4);
		
		for (Integer numero : list) {
			if (numero % 2 == 0 && numero >= 0) {
				System.out.println(numero + " é par e positivo ");
			} else if (numero % 2 == 0 && numero < 0) {
				System.out.println(numero + " é par e negativo ");
			} else if (numero % 2 != 0 && numero >= 0) {
				System.out.println(numero + " é impar e positivo ");
			} else if (numero % 2 != 0 && numero < 0) {
				System.out.println(numero + " é impar e negativo ");
			} else {
				System.out.println(numero + " é inválido! ");
			}
		}
		System.out.printf("+------------------------------------+\n");
	}

}
