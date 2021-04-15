
public class Exercicios2 {

	public static void main(String[] args) {
		// Exercicios 02 IW-Training Aula 01
		
		/* -- Questão 01 -- */
		double m1 = (3.3 + 10 + 7 + 2.3) / 4;
		double m2 = (5.1 + 11 + 5 + 20.33) / 4;
		double ms = (m1 + m2) / 2;
		System.out.println("Questão 01");
		System.out.println("----------");
		System.out.printf("Média aritimética 1 é : %.2f %n", m1);
		System.out.printf("Média aritimética 2 é : %.2f %n", m2);
		System.out.printf("A média aritiméticas final é : %.2f %n", ms);
		System.out.println("----------");
		/* ---------------- */
		
		/* -- Questão 02 -- */
		double mh1 = 4 / (1/6 + 1/8 + 1/1 + 1/2.3);
		double mh2 = 5 / (1/9.1 + 1/3 + 1/3 + 1/17 + 1/14.9);
		double mhf = (mh1 + mh2);
		System.out.println("Questão 02");
		System.out.println("----------");
		System.out.printf("Média Harmônica 1 é : %.2f %n", mh1);
		System.out.printf("Média Harmônica 2 é : %.2f %n", mh2);
		System.out.printf("A soma das médias harmônicas é : %.2f %n", mhf);
		System.out.println("----------");
		/* ---------------- */
		
		/* -- Questão 03 -- */
		double p1 = 3, p2 = 2.3, p3 = 2, p4 = 7.2;
		double v1 = 6, v2 = 8, v3 = 4.3, v4 = 5.4;
		double mp1 = ((p1 * v1) + (p2 * v2)) / p1 + p2;
		double mp2 = ((p3 * v3) + (p4 * v4)) / p3 + p4;
		double mpf = (mp1 + mp2) / 2 ;
		System.out.println("Questão 03");
		System.out.println("----------");
		System.out.printf("Média Ponderada 1 é : %.2f %n", mp1);
		System.out.printf("Média Ponderada 2 é : %.2f %n", mp2);
		System.out.printf("A média ponderada final é : %.2f %n", mpf);
		System.out.println("----------");
		/* ---------------- */
		
		/* -- Questão 04 -- */
		double en1 = 10 / ((3*(4+(3-9*10.0/45)-3)+10)-3);
		System.out.println("Questão 04");
		System.out.println("----------");
		System.out.printf("Expressão numérica 1 é : %.2f \n", en1);
		System.out.println("----------");
		/* ---------------- */
		
		/* -- Questão 05 -- */
		double en2 = 4 + ((3-(+10*(3*8.0/5+10)/+2)+10)-90);
		System.out.println("Questão 05");
		System.out.println("----------");
		System.out.printf("Expressão numérica 2 é : %.2f %n", en2);
		System.out.println("----------");
		/* ---------------- */
		
		/* -- Questão 06 -- */
		// 4x² + 3x + 2 = 0 (Formula -> /\ = b² -4.a.c)
		double a = 4.0, b=3.0, c= 2.0;
		double bk = b*b - 4 * a * c;
		double x = -b / (2 * a);
		double y = -bk / (4 * a);
		System.out.println("Questão 06");
		System.out.println("----------");
		System.out.printf("Binômio discriminante = %.2f %n", bk);
		System.out.printf("Vértice X da parábola : %.3f %n", x);
		System.out.printf("Vértice Y da parábola : %.3f %n", y);
		System.out.println("----------");
		/* ---------------- */

	}

}
