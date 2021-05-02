import java.util.Scanner;

public class ExeRepeticao5 {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int entrada;

        scanner = new Scanner(System.in);
        System.out.println("Informar um número: ");
        entrada = scanner.nextInt();

        int multiplicador = 1;
        while(multiplicador <= 9)
        {
            int resultado = entrada * multiplicador;
            System.out.print(" - ");
            System.out.print(resultado);   
            multiplicador++;
        }

	}

}
