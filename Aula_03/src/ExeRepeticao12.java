import java.util.ArrayList;
import java.util.Scanner;

public class ExeRepeticao12 {

	private static Scanner entrada;

	public static void main(String[] args) {
		/*Desenvolver um algoritmo que leia um número não determinado de
		valores e calcule e escreva a média aritmética dos valores lidos, a
		quantidade de valores positivos, a quantidade de valores negativos
		e o percentual de valores negativos e positivos;*/
		
		entrada = new Scanner(System.in);
		int soma = 0, num = 0;
		
		System.out.print("Informe a quantidade de números a serem lidos : ");
		int quant = entrada.nextInt();
		
		int numeros[] = new int[quant];
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for (int i = 0; i < numeros.length ; i++) {
			System.out.println("informe o " +(i+1)+ "° número : ");
			num = entrada.nextInt();
			numbers.add(num);
			soma += num;
		}
		double media = (soma / numeros.length);
		
		ArrayList<Integer> negativos = new ArrayList<>();
		ArrayList<Integer> positivos = new ArrayList<>();
		for (Integer number : numbers) {
			if (number >= 0) {
				positivos.add(number);
			} else if (number < 0) {
				negativos.add(number);
			}
		}
		double numPositivos = positivos.size();
		double numNegativos = negativos.size();
		double total = numbers.size();
		System.out.println("--------------------------");
		System.out.println("Média aritimética é      : " + media);
		System.out.println("Quantidade de positivos  : " + numPositivos);
		System.out.println("Porcentagem de positivos : " + ((numPositivos / total) * 100) + "%");
		System.out.println("Quantidade de negativos  : " + numNegativos);
		System.out.println("Porcentagem de positivos : " + ((numNegativos / total) * 100) + "%");
		System.out.println("--------------------------");
	}

}
