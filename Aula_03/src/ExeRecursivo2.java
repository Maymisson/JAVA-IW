import java.util.Scanner;

public class ExeRecursivo2 {

	private static Scanner entrada;

	public static void main(String[] args) {
		// Usando recursividade, faça a soma dos n números;
		
		entrada = new Scanner(System.in);
		System.out.println("Informe o ultimo número da soma : " );
		// Usando recursividade
		somaNumeros.soma(entrada.nextInt());
	}
	
	public static class somaNumeros{
		// Metodo da utilização da recursividade
		public static void soma(int x) {
			int soma = 0;
			for (int i = 0 ; i <= x ; i++) {
				 soma += i;
			}
			System.out.println("A soma dos números é : " + soma);
		}
	}

}
