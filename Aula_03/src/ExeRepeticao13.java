import java.util.ArrayList;
import java.util.Scanner;

public class ExeRepeticao13 {

	private static Scanner entrada;

	public static void main(String[] args) {
		/*Escrever um algoritmo que leia uma quantidade desconhecida de
		números e conte quantos deles estão nos seguintes intervalos:
		[0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve
		terminar quando for lido um número negativo;*/
		
		entrada = new Scanner(System.in);
		int num = 0;
		
		System.out.print("Informe a quantidade de números a serem lidos : ");
		int quant = entrada.nextInt();
		
		int numeros[] = new int[quant];
		
		ArrayList<Integer> intervalo1 = new ArrayList<>();
		ArrayList<Integer> intervalo2 = new ArrayList<>();
		ArrayList<Integer> intervalo3 = new ArrayList<>();
		ArrayList<Integer> intervalo4 = new ArrayList<>();
		
		for (int i = 0; i < numeros.length ; i++) {
			System.out.println("informe o " +(i+1)+ "° número : ");
			num = entrada.nextInt();
			if (num >= 0 && num <= 25) {
				intervalo1.add(num);
			} else if (num > 25 && num <= 50) {
				intervalo2.add(num);
			} else if (num > 50 && num <= 75) {
				intervalo3.add(num);
			} else if (num > 75 && num <= 100) {
				intervalo4.add(num);
			} else {
				System.out.println("Valor inválido!");
				break;
			}
		}
		System.out.println("");
		System.out.println("Intervalo [0-25]   : " + intervalo1.size());
		System.out.println("Intervalo [26-50]  : " + intervalo2.size());
		System.out.println("Intervalo [51-75]  : " + intervalo3.size());
		System.out.println("Intervalo [76-100] : " + intervalo4.size());

	}

}
