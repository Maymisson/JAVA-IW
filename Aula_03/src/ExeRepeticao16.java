import java.util.Scanner;

public class ExeRepeticao16 {

	private static Scanner entrada;

	public static void main(String[] args) {
		/*Escreva um algoritmo que leia um valor inicial A e uma razão R e
		imprima uma seqüência em P.A. contendo 10 valores;*/
		
		/*int n;
		int soma = 0;
		entrada = new Scanner(System.in);
		System.out.println("Informe a quantidade de valores : ");
		n = entrada.nextInt();
		
		// solução com WHILE
		int i = 1;
		while(i <= n) {
			soma += i;
			i++;
		}
		System.out.println("Soma = " + soma);
		
		// segunda solução 
		soma = ((1 + n) * n) / 2;
		System.out.println("Soma = " + soma);*/
		
		entrada = new Scanner(System.in);
		int inicial = 0, razao = 0, valorMax = 0;
		//int an = inicial;
		
		System.out.println("informe o valor inicial : ");
		inicial = entrada.nextInt();
		System.out.println("Informe a razão : ");
		razao = entrada.nextInt();
		System.out.println("Informe a quantidade de valores : ");
		valorMax = entrada.nextInt();
		
		int quantidade[] = new int[valorMax];
		int i = 0;
		while (i < quantidade.length) {
			System.out.print(inicial);
			System.out.print(" ");
			inicial += razao;
			i++;
		}
		
		System.out.println("\n");
		
		for (i = 0 ; i < quantidade.length ; i++) {
			System.out.print(inicial);
			System.out.print(" ");
			inicial += razao;
		}
	}

}
