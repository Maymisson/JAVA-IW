
public class ExeRepeticao2 {

	public static void main(String[] args) {
		/*Desenvolver um algoritmo que efetue a soma de todos os números
		ímpares que são múltiplos de três e que se encontram no conjunto
		dos números de 1 até 500.*/
		
		for (int i = 0 ; i < 501 ; i+=3) {
			System.out.print(" - ");
			System.out.print(i);
		}
		System.out.println("\n");
		for (int a = 0 ; a <=500 ; a ++ ) {
			if (a % 3 == 0) {
				System.out.print(" - ");
				System.out.print(a);
			}
		}
		
	}
}
