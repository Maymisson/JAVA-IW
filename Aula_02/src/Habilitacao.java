import java.util.Scanner;

public class Habilitacao {
	
	private static Scanner input;

	public static void main(String[] args) {
		// TODO Comparação de 2 números inteiros 
		
		input = new Scanner(System.in);
		
		int idade = 0;
		String cnh;
		String nome;
		
		System.out.printf("Informe seu Nome : " );
		nome = input.nextLine();
		
		System.out.printf("Você possui CNH, responda SIM ou NAO : " );
		cnh = input.nextLine();
		
		// VALIDAÇÃO DE IDADE APENAS INT
		boolean validaIdade = false;
		 do {
			System.out.printf("Informe sua idade : " );
			while (true)
				try {
	            	String age = input.next();
	                idade = Integer.parseUnsignedInt(age);
	                break;
	            } catch (NumberFormatException nfe) {
	                System.out.print("Informe uma idade válida : ");
	            }
		 } while (validaIdade);
		

		// VALIDAÇÃO CNH IF e ELSE ENCADEADOS
		if (idade >= 18 && cnh.equals("SIM")) {
			System.out.println("Olá " + nome + ", informamos que você está apto a dirigir.");
		} 
		else if (idade >= 18 && cnh.equals("NAO")) { 
			System.out.println("Lamentamos " + nome + ", você não possui CNH para dirigir.");
		} 
		else if (idade < 18 && cnh.equals("SIM")) {
			System.out.println("Lamentamos " + nome + ", você não possui idade para dirigir.");
		}
		else if (idade < 18 && cnh.equals("NAO")) { 
			System.out.println("Lamentamos " + nome + ", você não possui idade nem CNH para dirigir.");
		} 
		else { 
			System.out.println("ERROR : " + nome + ", você deve informar dados validos.");
		}

	}

}
