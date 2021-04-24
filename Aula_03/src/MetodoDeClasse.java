import java.util.ArrayList;
import java.util.List;

/*
Métodos de classe: método estático que é acessado e invocado
diretamente pela classe. Não há necessidade de instanciar um objeto.
*/

class MetodoDeClasse {
	
	public static double adicao (double num1, double num2) {
		return num1 + num2;
	}
	
	public static double adicao (double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}
	
	public static double subtracao (double num1, double num2) {
		return num1 - num2;
	}
	
	public static double subtracao (double num1, double num2, double num3) {
		return num1 - num2 - num3;
	}
	
	public static double multiplicacao (double num1, double num2) {
		return num1 * num2;
	}
	
	public static double multiplicacao (double num1, double num2, double num3) {
		return num1 * num2 * num3;
	}
	
	public static double divisao (double num1, double num2) {
		return num1 / num2;
	}
	
	public static double divisao (double num1, double num2, double num3) {
		return num1 / num2 / num3;
	}
	
	public static double potenciacao (double num1, double num2) {
		return Math.pow(num1, num2);
	}
	
	public static double potenciacao (double num1, double num2, double num3) {
		double expoente = num2 * num3; 
		return Math.pow(num1, expoente);
	}
	
	public static double radiciacao (double num1, double num2) {
		return Math.pow (num1, 1.0 / num2);
	}
	
	public static double radiciacao (double num1, double num2, double num3) {
		double expoente = num2 * num3; 
		return Math.pow(num1, 1.0 / expoente);
	}
	
	public static List<List<Double>> listaParesImpares(List<Double> list) {
		List<Double> listaPares = new ArrayList<>();
		List<Double> listaImpares = new ArrayList<>();

		list.forEach(numbers -> {
			if (numbers % 2 == 0)
				listaPares.add(numbers);
			else
				listaImpares.add(numbers);
		});
		List<List<Double>> resultado = new ArrayList<>();

		resultado.add(listaPares);

		resultado.add(listaImpares);

		return resultado;
	}
	
}
