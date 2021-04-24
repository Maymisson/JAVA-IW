
public class Main {

	public static void main(String[] args) {

		/*
		 * 
		 * 1.Método de classe e de objeto; 
		 * 2.Listas e arrays; 
		 * 3.Estruturas de repetição;
		 * 4.Recursividade.
		 * 
		 */

		// Métodos de classe:
		System.out.println("+---------- Métodos de classe ----------+");
		System.out.println("O valor da adição é : " + MetodoDeClasse.adicao(10, 20));
		System.out.println("O valor da subtração é : " + MetodoDeClasse.subtracao(10, 20));
		System.out.println("O valor da multiplicação é : " + MetodoDeClasse.multiplicacao(10, 20));
		System.out.println("O valor da divisão é : " + MetodoDeClasse.divisao(10, 20));
		
		System.out.println("\n");
		
		// Métodos de objeto:
		MetodoDeObjeto metodoDeObjeto = new MetodoDeObjeto();
		System.out.println("+---------- Métodos de objeto ----------+");
		System.out.println("O valor da adição é : " + metodoDeObjeto.adicao(10, 20));
		System.out.println("O valor da subtração é : " + metodoDeObjeto.subtracao(10, 20));
		System.out.println("O valor da multiplicação é : " + metodoDeObjeto.multiplicacao(10, 20));
		System.out.println("O valor da divisão é : " + metodoDeObjeto.divisao(10, 20));

	}

}
