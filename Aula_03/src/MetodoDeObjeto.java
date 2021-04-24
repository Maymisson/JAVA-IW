import java.util.ArrayList;
import java.util.List;

/*
Métodos de objeto: método não estático que é acessado e invocado
diretamente pelo o objeto da classe. Há necessidade de instanciar um
objeto.
*/

public class MetodoDeObjeto {
	
	public double adicao (double num1, double num2) {
		return num1 + num2;
	}
	
	public double adicao (double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}
	
	public double subtracao (double num1, double num2) {
		return num1 - num2;
	}
	
	public double subtracao (double num1, double num2, double num3) {
		return num1 - num2 - num3;
	}
	
	public double multiplicacao (double num1, double num2) {
		return num1 * num2;
	}
	
	public double multiplicacao (double num1, double num2, double num3) {
		return num1 * num2 * num3;
	}
	
	public double divisao (double num1, double num2) {
		return num1 / num2;
	}
	
	public double divisao (double num1, double num2, double num3) {
		return num1 / num2 / num3;
	}
	
	public double potenciacao (double num1, double num2) {
		return Math.pow(num1, num2);
	}
	
	public double potenciacao (double num1, double num2, double num3) {
		double expoente = num2 * num3; 
		return Math.pow(num1, expoente);
	}
	
	public double radiciacao (double num1, double num2) {
		return Math.pow (num1, 1.0 / num2);
	}
	
	public double radiciacao (double num1, double num2, double num3) {
		double expoente = num2 * num3; 
		return Math.pow(num1, 1.0 / expoente);
	}
	
	public List<List<Double>> listaParesImpares(List<Double> list) {
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
