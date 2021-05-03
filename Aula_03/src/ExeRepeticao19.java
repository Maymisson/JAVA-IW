import java.util.Scanner;

public class ExeRepeticao19 {

	private static Scanner entrada;

	public static void main(String[] args) {
		// Elabore um algoritmo para gerar as sequências de fibonacci.

		entrada = new Scanner(System.in);
		System.out.println("Informe a quantidade de termos : ");
		int termos = entrada.nextInt(); 
		// Usando recursividade 
		for (int i = 0; i < termos; i++) {
			System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t");
		}

	}
	
	// Classe responsável pelo calculo Fibonacci
	public static class Fibonacci {
		// Metodo Fibonacci 
		static long fibo(int n) {
			if (n < 2) {
				return n;
			} else {
				return fibo(n - 1) + fibo(n - 2);
			}
		}
	}
}
