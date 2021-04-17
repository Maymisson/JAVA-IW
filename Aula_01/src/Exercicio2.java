
public class Exercicio2 {

	public static void main(String[] args) {
		// Exercicios 02 IW-Training Aula 01
		
		/* -- Questão 01 -- */
		double mediaAritimetica1 = (3.3 + 10 + 7 + 2.3) / 4;
		double mediaAritimetica2 = (5.1 + 11 + 5 + 20.33) / 4;
		double mediaAritimeticaFinal = (mediaAritimetica1 + mediaAritimetica2) / 2;
		System.out.println("Questão 01");
		System.out.println("----------");
		System.out.printf("Média aritimética 1 é : %.2f %n", mediaAritimetica1);
		System.out.printf("Média aritimética 2 é : %.2f %n", mediaAritimetica2);
		System.out.printf("A média aritimética final é : %.2f %n", mediaAritimeticaFinal);
		System.out.println("----------");
		/* ---------------- */
		
		/* -- Questão 02 -- */
		double mediaHarmonica1 = 4 / (1/6 + 1/8 + 1/1 + 1/2.3);
		double mediaHarmonica2 = 5 / (1/9.1 + 1/3 + 1/3 + 1/17 + 1/14.9);
		double somaMediaHarmonica = (mediaHarmonica1 + mediaHarmonica2);
		System.out.println("Questão 02");
		System.out.println("----------");
		System.out.printf("Média Harmônica 1 é : %.2f %n", mediaHarmonica1);
		System.out.printf("Média Harmônica 2 é : %.2f %n", mediaHarmonica2);
		System.out.printf("A soma das médias harmônicas é : %.2f %n", somaMediaHarmonica);
		System.out.println("----------");
		/* ---------------- */
		
		/* -- Questão 03 -- */
		double ponto1 = 3, ponto2 = 2.3, ponto3 = 2, ponto4 = 7.2;
		double valor1 = 6, valor2 = 8, valor3 = 4.3, valor4 = 5.4;
		double mediaPonderada1 = ((ponto1 * valor1) + (ponto2 * valor2)) / (ponto1 + ponto2);
		double mediaPonderada2 = ((ponto3 * valor3) + (ponto4 * valor4)) / (ponto3 + ponto4);
		double mediaPonderadaFinal = (mediaPonderada1 + mediaPonderada2) / 2 ;
		System.out.println("Questão 03");
		System.out.println("----------");
		System.out.printf("Média Ponderada 1 é : %.2f %n", mediaPonderada1);
		System.out.printf("Média Ponderada 2 é : %.2f %n", mediaPonderada2);
		System.out.printf("A média ponderada final é : %.2f %n", mediaPonderadaFinal);
		System.out.println("----------");
		/* ---------------- */
		
		/* -- Questão 04 -- */
		double expressaoNumerica1 = 10 / ((3*(4+(3-9*10.0/45)-3)+10)-3);
		System.out.println("Questão 04");
		System.out.println("----------");
		System.out.printf("Expressão numérica 1 é : %.2f \n", expressaoNumerica1);
		System.out.println("----------");
		/* ---------------- */
		
		/* -- Questão 05 -- */
		double expressaoNumerica2 = 4 + ((3-(+10*(3*8.0/5+10)/+2)+10)-90);
		System.out.println("Questão 05");
		System.out.println("----------");
		System.out.printf("Expressão numérica 2 é : %.2f %n", expressaoNumerica2);
		System.out.println("----------");
		/* ---------------- */
		
		/* -- Questão 06 -- */
		// 4x² + 3x + 2 = 0 (Formula -> /\ = b² -4.a.c)
		double coeficientea= 4.0, coeficienteb=3.0, coeficientec= 2.0;
		double delta = coeficienteb*coeficienteb - 4 * coeficientea * coeficientec;
		double verticex = -coeficienteb / (2 * coeficientea);
		double verticey = -delta / (4 * coeficientea);
		System.out.println("Questão 06");
		System.out.println("----------");
		System.out.printf("Binômio discriminante = %.2f %n", delta);
		System.out.printf("Vértice X da parábola : %.3f %n", verticex);
		System.out.printf("Vértice Y da parábola : %.3f %n", verticey);
		System.out.println("----------");
		/* ---------------- */

	}

}
