import java.util.ArrayList;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class Lista {

	public static void main(String[] args) {
		// Listas e Arrays - Exercícios - 01
		
		// Lista do tipo String
		ArrayList<String> endereco = new ArrayList<>();
		
		// Inserção a lista
		endereco.add("Rua Mario Mamede 360");
		endereco.add("Avenida 13 de maio 554");
		endereco.add("Rua Rosendo chagas 670");
		endereco.add("Rua Francisco chagas 670");
		// Atualização valor da lista
		endereco.set(3, "Rua Joaquim tavora 800");
		// Removendo valor da lista
		endereco.remove(3);
		// Recuperando valor da lista;
		endereco.get(0);
		// Listar por ID 
		System.out.println(endereco.get(1));
		System.out.println("");
		// Listar todos os itens da lista
		System.out.println(endereco);
		
		System.out.println("-----------------------");
		
		ArrayList<Integer> inteiro = new ArrayList<>();
		inteiro.add(1);
		inteiro.add(2);
		inteiro.add(3);
		inteiro.add(4);
		
		inteiro.set(3, 5);
		inteiro.remove(3);
		System.out.println(inteiro.get(0));
		System.out.println("");
		System.out.println(inteiro);
		
		System.out.println("-----------------------");
		
		Aluno aluno1 = new Aluno("Magno", 900);
		Aluno aluno2 = new Aluno("Maria", 800);
		Aluno aluno3 = new Aluno("João ", 700);
		Aluno aluno4 = new Aluno("Silva", 600);
		
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(aluno1);
		alunos.add(aluno2);
		alunos.add(aluno3);
		alunos.add(aluno4);
		// Listando por ID
		System.out.println("Nome : " + alunos.get(0).getNome() + " | Pontos : " + alunos.get(0).getPontos());
		System.out.println("");
		// Listando com interator (Obs : interator sempre é INT)
		for (int i =0 ; i < alunos.size() ; i++) {
			System.out.println("Nome : " + alunos.get(i).getNome() + " | Pontos : " + alunos.get(i).getPontos());
		}
		
	}

}
