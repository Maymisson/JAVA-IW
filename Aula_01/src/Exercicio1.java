
public class Exercicio1 {

	public static void main(String[] args) {
		// Exercicios 01 IW-Training Aula 01
		
		/* -- Questão 01 -- */
		int fatorial3 = (3 * 2 * 1);
		int fatorial4 = (4 * fatorial3);
		int fatorial5 = (5 * fatorial4);
		int fatorial6 = (6 * fatorial5);
		int fatorial7 = (7 * fatorial6);
		System.out.println("Questão 01");
		System.out.println("----------");
		System.out.println("Fatorial de 3 : " + fatorial3);
		System.out.println("Fatorial de 4 : " + fatorial4);
		System.out.println("Fatorial de 5 : " + fatorial5);
		System.out.println("Fatorial de 6 : " + fatorial6);
		System.out.println("Fatorial de 7 : " + fatorial7);
		System.out.println("----------");
		/* ---------------- */
		
		/* -- Questão 02 -- */
		int x = 2;
		int polimonio1 = ((4*x*x*x) + (2*x*x) + (x + 10));
		int polimonio2 = ((3*x*x*x*x) + (9*x*x*x) + (9*x*x) + (x + 9));
		int polimonio3 = ((x*x*x*x) + (2*x*x*x) + (6*x*x + 1));
		int polimonio4 = ((10*x*x*x*x) + (5*x*x*x) + (4*x*x) + (x + 4));
		System.out.println("Questão 02");
		System.out.println("----------");
		System.out.println("Polinômio P(x) : " + polimonio1);
		System.out.println("Polinômio P(x) : " + polimonio2);
		System.out.println("Polinômio P(x) : " + polimonio3);
		System.out.println("Polinômio P(x) : " + polimonio4);
		System.out.println("----------");
		/* ---------------- */
		
		/* -- Questão 03 -- */
		int num = 9;
		System.out.println("Questão 03");
		System.out.println("----------");
		System.out.println("Tabuada de "+num+" > " +" Som: "+ (num +1) +" Sub: "+ (num -1) +" Mul: "+ (num *1) +" Div: "+ (num /1));
		System.out.println("Tabuada de "+num+" > " +" Som: "+ (num +2) +" Sub: "+ (num -2) +" Mul: "+ (num *2) +" Div: "+ (num /2));
		System.out.println("Tabuada de "+num+" > " +" Som: "+ (num +3) +" Sub: "+ (num -3) +" Mul: "+ (num *3) +" Div: "+ (num /3));
		System.out.println("Tabuada de "+num+" > " +" Som: "+ (num +4) +" Sub: "+ (num -4) +" Mul: "+ (num *4) +" Div: "+ (num /4));
		System.out.println("Tabuada de "+num+" > " +" Som: "+ (num +5) +" Sub: "+ (num -5) +" Mul: "+ (num *5) +" Div: "+ (num /5));
		System.out.println("Tabuada de "+num+" > " +" Som: "+ (num +6) +" Sub: "+ (num -6) +" Mul: "+ (num *6) +" Div: "+ (num /6));
		System.out.println("Tabuada de "+num+" > " +" Som: "+ (num +7) +" Sub: "+ (num -7) +" Mul: "+ (num *7) +" Div: "+ (num /7));
		System.out.println("Tabuada de "+num+" > " +" Som: "+ (num +8) +" Sub: "+ (num -8) +" Mul: "+ (num *8) +" Div: "+ (num /8));
		System.out.println("Tabuada de "+num+" > " +" Som: "+ (num +9) +" Sub: "+ (num -9) +" Mul: "+ (num *9) +" Div: "+ (num /9));
		System.out.println("----------");
		/* ---------------- */
		
		/* -- Questão 04 -- */
		double numero = 8.92;
		int numeroConvertido = (int) numero;
		String frase = "Conversor Inteiro : ";
		System.out.println("Questão 04");
		System.out.println("----------");
		System.out.println(frase + numeroConvertido);
		System.out.println("----------");
		/* ---------------- */
		
		/* -- Questão 05 -- */
		int numeral = 9;
		String primoSim = "é primo";
		String primoNao = "não é primo";
		System.out.println("Questão 05");
		System.out.println("----------");
		if (numeral % 2 == 0) {
			System.out.println(numeral + " : " +primoSim);
         	} else {
        	 	System.out.println(numeral + " : " +primoNao);
         	}
		System.out.println("----------");
		/* ---------------- */
		
		/* -- Questão 06 -- */
		String resto = "Resto da divisão é";
		System.out.println("Questão 06");
		System.out.println("----------");
		System.out.println(resto + " : " +(10 % 5));
		System.out.println(resto + " : " +(5 % 2));
		System.out.println(resto + " : " +(11 % 3));
		System.out.println(resto + " : " +(11 % 2));
		System.out.println("----------");
		/* ---------------- */
		
		/* -- Questão 07 -- */
		int total = 15; 
		int score = 15; 
	    	float porcentagem = (score * total / 100);
	    	System.out.println("Questão 07");   
	    	System.out.println("A porcentagem é = " + porcentagem + " %");
		System.out.println("----------");
		/* ---------------- */
		
		
	}

}
