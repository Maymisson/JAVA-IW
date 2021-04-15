
public class Exercicios {

	public static void main(String[] args) {
		// Exercicios 01 IW-Training Aula 01
		
		/* -- Questão 01 -- */
		int fat3 = (3 * 2 * 1);
		int fat4 = (4 * fat3);
		int fat5 = (5 * fat4);
		int fat6 = (6 * fat5);
		int fat7 = (7 * fat6);
		System.out.println("Questão 01");
		System.out.println("----------");
		System.out.println("Fatorial de 3 : " + fat3);
		System.out.println("Fatorial de 4 : " + fat4);
		System.out.println("Fatorial de 5 : " + fat5);
		System.out.println("Fatorial de 6 : " + fat6);
		System.out.println("Fatorial de 7 : " + fat7);
		System.out.println("----------");
		/* ---------------- */
		
		/* -- Questão 02 -- */
		int x = 1;
		int p1 = (4*x^3 + 2*x^2 + x + 10);
		int p2 = (3*x^4 + 9*x^3 + 9*x^2 + x + 9);
		int p3 = (x^4 + 2*x^3 + 6*x^2 + 1);
		int p4 = (10*x^4 + 5*x^3 + 4*x^2 + x + 4);
		System.out.println("Questão 02");
		System.out.println("----------");
		System.out.println("Polinômio P(x) : " + p1);
		System.out.println("Polinômio P(x) : " + p2);
		System.out.println("Polinômio P(x) : " + p3);
		System.out.println("Polinômio P(x) : " + p4);
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
		double n = 8.92;
		int a = (int) n;
		String c = "Conversor Inteiro : ";
		System.out.println("Questão 04");
		System.out.println("----------");
		System.out.println(c + a);
		System.out.println("----------");
		/* ---------------- */
		
		/* -- Questão 05 -- */
		int i = 10;
		String primo = "é primo";
		String nprimo = "não é primo";
		System.out.println("Questão 05");
		System.out.println("----------");
		if (i % 2 == 0) {
			System.out.println(i + " : " +primo);
         	} else {
        	 	System.out.println(i + " : " +nprimo);
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
