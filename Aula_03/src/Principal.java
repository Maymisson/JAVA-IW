
public class Principal {

	public static void main(String[] args) {
		
		// Métodos de classe:
		System.out.println("O valor da adição é : " + MetodoDeClasse.adicao(10, 20));
		System.out.println("O valor da subtração é : " + MetodoDeClasse.subtracao(10, 20));
		System.out.println("O valor da multiplicação é : " + MetodoDeClasse.multiplicacao(10, 20));
		System.out.println("O valor da divisão é : " + MetodoDeClasse.divisao(10, 20));
		
		// Métodos de objeto:
		MetodoDeObjeto metodoDeObjeto = new MetodoDeObjeto();
		
		System.out.println("O valor da adição é : " + metodoDeObjeto.adicao(10, 20));
		System.out.println("O valor da subtração é : " + metodoDeObjeto.subtracao(10, 20));
		System.out.println("O valor da multiplicação é : " + metodoDeObjeto.multiplicacao(10, 20));
		System.out.println("O valor da divisão é : " + metodoDeObjeto.divisao(10, 20));
	}

}
