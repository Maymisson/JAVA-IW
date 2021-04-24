import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Interna {

	public static void fibonacci(double num1, double num2) {

		double fibonacci = MetodoDeClasse.adicao(num1, num2);

		if (num1 < num2) {
			System.out.println("Sequência Fibonacci " + num1 + " , " + num2 + " : " + fibonacci);
		} else if (num1 > num2) {
			System.out.println("Sequência Fibonacci " + num2 + " , " + num1 + " : " + fibonacci);
		} else {
			System.out.println("Valores iguais ou  inválido!");
		}
	}

	public static void fibonacci(double num1, double num2, double num3) {

		double fibonacci = MetodoDeClasse.adicao(num1, num2, num3);

		if (num1 < num2) {
			if (num2 < num3) {
				System.out.println("Sequência Fibonacci " + num1 + " , " + num2 + " , " + num3 + " : " + fibonacci);
			} else if (num1 < num3) {
				System.out.println("Sequência Fibonacci " + num1 + " , " + num3 + " , " + num2 + " : " + fibonacci);
			} else {
				System.out.println("Sequência Fibonacci " + num3 + " , " + num1 + " , " + num2 + " : " + fibonacci);
			}
		} else if (num2 < num3) {
			if (num1 < num3) {
				System.out.println("Sequência Fibonacci " + num2 + " , " + num1 + " , " + num3 + " : " + fibonacci);
			} else {
				System.out.println("Sequência Fibonacci " + num2 + " , " + num3 + " , " + num1 + " : " + fibonacci);
			}
		} else {
			System.out.println("Sequência Fibonacci " + num3 + " , " + num2 + " , " + num1 + " : " + fibonacci);
		}
	}

	public static void fatorial(double num1, double num2) {

		double total;

		ArrayList<Double> listFatorial = new ArrayList<>();
		listFatorial.add(num1);
		listFatorial.add(num2);

		for (Double factor : listFatorial) {
			total = factor;

			while (factor > 1) {
				total = total * (factor - 1);
				factor--;
			}

			System.out.printf("O Fatorial é : %.2f %n", total);
		}

	}

	public static void fatorial(double num1, double num2, double num3) {

		double total;

		ArrayList<Double> listFatorial = new ArrayList<>();
		listFatorial.add(num1);
		listFatorial.add(num2);
		listFatorial.add(num3);

		for (Double factor : listFatorial) {
			total = factor;

			while (factor > 1) {
				total = total * (factor - 1);
				factor--;
			}

			System.out.printf("O Fatorial é : %.2f %n", total);
		}

	}
	
	public static void ParesImpares(double num1, double num2) {
		List<List<Double>> listaParesImpares = MetodoDeClasse.listaParesImpares(Arrays.asList(num1, num2));

		System.out.println("Impressao dos Numeros Pares");
		List<Double> listaPares = listaParesImpares.get(0);
		listaPares.forEach(System.out::println);

		System.out.println("Impressao dos Numeros Impares");
		List<Double> listaImpares = listaParesImpares.get(1);
		listaImpares.forEach(System.out::println);
	}

	public static void ParesImpares(double num1, double num2, double num3) {
		List<List<Double>> listaParesImpares = MetodoDeClasse.listaParesImpares(Arrays.asList(num1, num2, num3));

		System.out.println("Impressao dos Numeros Pares");
		List<Double> listaPares = listaParesImpares.get(0);
		listaPares.forEach(System.out::println);

		System.out.println("Impressao dos Numeros Impares");
		List<Double> listaImpares = listaParesImpares.get(1);
		listaImpares.forEach(System.out::println);
	}

}
