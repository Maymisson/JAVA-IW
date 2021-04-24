import java.util.Scanner;

public class OperacaoMatematica {

	private Scanner input;

	public void opeeracaoClasse() {

		input = new Scanner(System.in);

		System.out.printf("Informe o 1° numero inteiro : ");
		int num1 = input.nextInt();
		System.out.printf("Informe o 2° numero inteiro : ");
		int num2 = input.nextInt();
		System.out.printf("\n\n");
		
		System.out.printf("+-------- Operação de classe --------+");
		System.out.println();
		System.out.printf("O valor da adição é : %.2f %n", MetodoDeClasse.adicao(num1, num2));
		System.out.printf("O valor da subtração é : %.2f %n", MetodoDeClasse.subtracao(num1, num2));
		System.out.printf("O valor da multiplicação é : %.2f %n", MetodoDeClasse.multiplicacao(num1, num2));
		System.out.printf("O valor da divisão é : %.2f %n", MetodoDeClasse.divisao(num1, num2));
		System.out.printf("*** OBS: Potência é igual 1° elevado ao 2° número ***\n");
		System.out.printf("O valor da potência é : %.2f %n", MetodoDeClasse.potenciacao(num1, num2));
		System.out.printf("O valor da radiciação é : %.2f %n", MetodoDeClasse.radiciacao(num1, num2));
		Interna.fatorial(num1, num2);
		Interna.fibonacci(num1, num2);
		Interna.ParesImpares(num1, num2);
		System.out.printf("+------------------------------------+\n\n");
	}

	public void opeeracaoClasse2() {

		input = new Scanner(System.in);

		System.out.printf("Informe o 1° numero inteiro : ");
		double num1 = input.nextDouble();
		System.out.printf("Informe o 2° numero inteiro : ");
		double num2 = input.nextDouble();
		System.out.printf("Informe o 3° numero inteiro : ");
		double num3 = input.nextDouble();
		System.out.printf("\n\n");

		System.out.printf("+-------- Operação de classe --------+");
		System.out.println();
		System.out.printf("O valor da adição é : %.2f %n", MetodoDeClasse.adicao(num1, num2, num3));
		System.out.printf("O valor da subtração é : %.2f %n", MetodoDeClasse.subtracao(num1, num2, num3));
		System.out.printf("O valor da multiplicação é : %.2f %n", MetodoDeClasse.multiplicacao(num1, num2, num3));
		System.out.printf("O valor da divisão é : %.2f %n", MetodoDeClasse.divisao(num1, num2, num3));
		System.out.printf("*** OBS: Potência é igual 1° elevado ao 2° número ***\n");
		System.out.printf("O valor da potência é : %.2f %n", MetodoDeClasse.potenciacao(num1, num2, num3));
		System.out.printf("O valor da radiciação é : %.2f %n", MetodoDeClasse.radiciacao(num1, num2, num3));
		Interna.fatorial(num1, num2, num3);
		Interna.fibonacci(num1, num2, num3);
		Interna.ParesImpares(num1, num2, num3);
		System.out.printf("+------------------------------------+\n\n");
	}

	public void opeeracaoObjeto() {

		MetodoDeObjeto metodoDeObjeto = new MetodoDeObjeto();
		
		input = new Scanner(System.in);

		System.out.printf("Informe o 1° numero inteiro : ");
		int num1 = input.nextInt();
		System.out.printf("Informe o 2° numero inteiro : ");
		int num2 = input.nextInt();
		System.out.printf("\n\n");

		System.out.printf("+-------- Operação de objeto --------+");
		System.out.println();
		System.out.printf("O valor da adição é : %.2f %n", metodoDeObjeto.adicao(num1, num2));
		System.out.printf("O valor da subtração é : %.2f %n", metodoDeObjeto.subtracao(num1, num2));
		System.out.printf("O valor da multiplicação é : %.2f %n", metodoDeObjeto.multiplicacao(num1, num2));
		System.out.printf("O valor da divisão é : %.2f %n", metodoDeObjeto.divisao(num1, num2));
		System.out.printf("*** OBS: Potência é igual 1° elevado ao 2° número ***\n");
		System.out.printf("O valor da potência é : %.2f %n", metodoDeObjeto.potenciacao(num1, num2));
		System.out.printf("O valor da radiciação é : %.2f %n", metodoDeObjeto.radiciacao(num1, num2));
		Interna.fatorial(num1, num2);
		Interna.fibonacci(num1, num2);
		Interna.ParesImpares(num1, num2);
		System.out.printf("+------------------------------------+\n\n");
	}

	public void opeeracaoObjeto2() {

		MetodoDeObjeto metodoDeObjeto = new MetodoDeObjeto();
		
		input = new Scanner(System.in);

		System.out.printf("Informe o 1° numero inteiro : ");
		double num1 = input.nextDouble();
		System.out.printf("Informe o 2° numero inteiro : ");
		double num2 = input.nextDouble();
		System.out.printf("Informe o 3° numero inteiro : ");
		double num3 = input.nextDouble();
		System.out.printf("\n\n");

		System.out.printf("+-------- Operação de objeto --------+");
		System.out.println();
		System.out.printf("O valor da adição é : %.2f %n", metodoDeObjeto.adicao(num1, num2, num3));
		System.out.printf("O valor da subtração é : %.2f %n", metodoDeObjeto.subtracao(num1, num2, num3));
		System.out.printf("O valor da multiplicação é : %.2f %n", metodoDeObjeto.multiplicacao(num1, num2, num3));
		System.out.printf("O valor da divisão é : %.2f %n", metodoDeObjeto.divisao(num1, num2, num3));
		System.out.printf("*** OBS: Potência é igual 1° elevado ao 2° número ***\n");
		System.out.printf("O valor da potência é : %.2f %n", metodoDeObjeto.potenciacao(num1, num2, num3));
		System.out.printf("O valor da radiciação é : %.2f %n", metodoDeObjeto.radiciacao(num1, num2, num3));
		Interna.fatorial(num1, num2, num3);
		Interna.fibonacci(num1, num2, num3);
		Interna.ParesImpares(num1, num2, num3);
		System.out.printf("+------------------------------------+\n\n");
	}

}
