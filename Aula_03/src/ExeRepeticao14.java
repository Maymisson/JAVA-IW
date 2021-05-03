import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExeRepeticao14 {

	private static Scanner entrada;

	public static void main(String[] args) {
		/*Faça um algoritmo estruturado que leia uma quantidade não
		determinada de números positivos. Calcule a quantidade de números
		pares e ímpares, a média de valores pares e a média geral dos
		números lidos. O número que encerrará a leitura será zero;*/
		
		entrada = new Scanner(System.in);
		double somaTotal = 0, somaPares = 0, num = 0;
		
		System.out.print("Informe a quantidade de números a serem lidos : ");
		int quant = entrada.nextInt();
		
		int numeros[] = new int[quant];
		
		List<Double> listaPares = new ArrayList<>();
		List<Double> listaImpares = new ArrayList<>();
		
		for (int i = 0; i < numeros.length ; i++) {
			System.out.println("informe o " +(i+1)+ "° número : ");
			num = entrada.nextInt();
			somaTotal += num;
			if (num <= 0) {
				System.out.println("Número inválido!");
				break;
			} else if (num % 2 == 0) {
				somaPares += num;
				listaPares.add(num);
			} else {
				listaImpares.add(num);
			}
		}
		double total = listaImpares.size() + listaPares.size();
		double mediaPares = somaPares / listaPares.size();
		double medialTotal = somaTotal / total;
		
		System.out.println("-----------------------------------");
		System.out.println("Quantidade de números pares        : " + listaPares.size());
		System.out.println("Quantidade de números impares      : " + listaImpares.size());
		System.out.println("Média de números pares             : " + mediaPares);
		System.out.println("Média total dos números informados : " + medialTotal);
		System.out.println("-----------------------------------");
	}

}
