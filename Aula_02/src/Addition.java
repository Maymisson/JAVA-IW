import java.util.Scanner;

public class Addition {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO programa utiliza a classe Scanner 
		
		input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		
		System.out.printf("Entre com o primeiro numero : " );
		number1 = input.nextInt();
		System.out.printf("Entre com o segundo numero : " );
		number2 = input.nextInt();
		
		sum = number1 + number2;
		
		System.out.printf("Soma é %d\n", sum);

	}

}
