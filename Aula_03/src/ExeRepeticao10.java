
public class ExeRepeticao10 {

	public static void main(String[] args) {
		// Imprima os valores das diagonais primárias e secundárias;

		int n = 3;
		int matriz[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Diagonal Primária");
		
		for (int k = 0; k < n; k++)
			System.out.print(matriz[k][k] + " ");

		System.out.println("");

		System.out.println("Diagonal Secundária");
		for (int k = 0; k < n; k++)
			System.out.print(matriz[k][n - 1 - k] + " ");
	}

}
