import java.util.Scanner;

public class ExeRecursivo1 {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		System.out.println("Informe o número limite para soma dos pares : ");
		int num = entrada.nextInt();
		// Usando a recursividade
		System.out.println("A soma dos pares é : " + somaRecursiva.somaPares(num));
	}
	
	// Classe recursiva para operação de somar números pares
	public static class somaRecursiva {
		public static int somaPares(int n) {
			if (n == 0) return 0; 
			if (n % 2 == 0) return n + somaPares(n -1);	
			return somaPares(n -1);
		}
	}

}
