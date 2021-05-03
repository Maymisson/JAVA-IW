import java.util.Scanner;

public class ExeRepeticao17 {

	private static Scanner entrada;

	public static void main(String[] args) {
		/*Escreva um algoritmo que leia um valor inicial A e uma razão R e
		imprima uma seqüência em P.G. contendo 10 valores;*/
		
		entrada = new Scanner(System.in);
		int inicial = 0, razao = 0, valorMax = 0;
		
		System.out.println("informe o valor inicial : ");
		inicial = entrada.nextInt();
		System.out.println("Informe a razão : ");
		razao = entrada.nextInt();
		System.out.println("Informe o máximo de valor : ");
		valorMax = entrada.nextInt();
		
		int i = 0;
		while (i < valorMax) {
			System.out.print(inicial);
			System.out.print(" ");
			inicial *= razao;
			i++;
		}

	}

}
