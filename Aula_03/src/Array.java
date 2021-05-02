
public class Array {

	public static void main(String[] args) {
		// Listas e Arrays - Exercícios - 02

		int[] inteiros = new int[4];
		// Inserindo valores
		inteiros[0] = 10;
		inteiros[1] = 20;
		inteiros[2] = 30;
		inteiros[3] = 40;
		// Atualizando valores
		inteiros[3] = 100;
		// Listando vetor por ID
		System.out.println(inteiros[3]);
		System.out.println("");
		
		// Listando todos os itens
		for (int i : inteiros) {
			System.out.println(i);
		}
		
		System.out.println("-----------------------");
		
		String[] nomes = new String[4];
		nomes[0] = "Magno";
		nomes[1] = "Maria";
		nomes[2] = "José ";
		nomes[3] = "Aldo ";
		
		nomes[3] = "João ";
		
		System.out.println(nomes[2]);
		System.out.println("");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("-----------------------");
		
		Agenda contato1 = new Agenda("Francisco", 22);
		Agenda contato2 = new Agenda("Alfredo  ", 32);
		Agenda contato3 = new Agenda("Elisberto", 18);
		Agenda contato4 = new Agenda("Pedro    ", 27);
		
		// Adicionando todos os objetos a uma array (vetor)
		Agenda contatos[] = {contato1, contato2, contato3, contato4};
		//Listando por ID
		System.out.println("Nome : " + contatos[0].getNome() + " | Idade : " + contatos[0].getIdade());
		System.out.println("");
		// Listando com interator (Obs : interator sempre é INT)
		for (int i =0 ; i < contatos.length ; i++) {
			System.out.println("Nome : " + contatos[i].getNome() + " | Idade : " + contatos[i].getIdade());
		}

	}

}
