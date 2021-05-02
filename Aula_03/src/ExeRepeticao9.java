import java.util.Scanner;

public class ExeRepeticao9 {

	private static Scanner entrada;

	public static void main(String[] args) {
		// Dado 10 números, determine o número maior e menor;
		
		entrada = new Scanner(System.in);
		int valor[] = new int[10];
		
		/*Para o maior elemento, basta inicializar a variavel maior com o primeiro elemento do vetor.
		E pro menor elemento, você pode usar o Integer.MAX_VALUE; Ou seja, 
		ele vai armazenar na variavel menor o maior valor que uma variável int por armazenar.*/
		
		int maior = valor[0],  menor = Integer.MAX_VALUE; 
		
		for (int i = 0; i < valor.length; i++) {
			System.out.println("Digite o " +(i+1)+ "° valor : ");
			valor[i] = entrada.nextInt();
			if (valor[i] > maior) {
				maior = valor[i];
			}
		}
		for (int j =0; j < valor.length; j++) {
			if(valor[j] < menor) {
				menor = valor[j];
			}
		}
		System.out.println("Maior valor : " + maior);
		System.out.println("Menor valor : " + menor);
	}

}
