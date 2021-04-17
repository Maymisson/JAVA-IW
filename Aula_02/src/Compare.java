import java.util.Scanner;

public class Compare {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO Comparação de 2 números inteiros 
		
		input = new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.printf("Entre com o primeiro numero : " );
		number1 = input.nextInt();
		System.out.printf("Entre com o segundo numero : " );
		number2 = input.nextInt();
		
		if (number1 == number2) 
			System.out.printf("%d == %d\n", number1, number2);
			
		if (number1 != number2) 
			System.out.printf("%d != %d\n", number1, number2);
		
		if (number1 < number2) 
			System.out.printf("%d < %d\n", number1, number2);
		
		if (number1 > number2) 
			System.out.printf("%d > %d\n", number1, number2);
		
		if (number1 <= number2) 
			System.out.printf("%d <= %d\n", number1, number2);
		
		if (number1 >= number2) 
			System.out.printf("%d >= %d\n", number1, number2);

	}

}
