
public class ExeRepeticao15 {

	public static void main(String[] args) {
		/*Escrever um algoritmo que gera e escreve os números ímpares entre
		100 e 200;*/
		int inicio = 100;
		int fim = 200;
				
		for (int i = inicio ; i <= fim ; i++ ) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

}
