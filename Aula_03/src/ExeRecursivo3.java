import java.util.Scanner;

public class ExeRecursivo3 {

	private static Scanner entrada;

	public static void main(String[] args) {
		// Usando recursividade, imprima a sequência numérica dos n números;
		
		entrada = new Scanner(System.in);
		System.out.println("Informe o número final da sequência : ");
		recursividade.sequencia(entrada.nextInt());

	}
	
	public static class recursividade {
		public static void sequencia (int n) {
			for (int i = 0 ; i <= n ; i++) {
				System.out.println(i);
			}
		}
	}

}
