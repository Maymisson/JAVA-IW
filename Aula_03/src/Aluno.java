
public class Aluno implements Comparable<Aluno> {

	private final String nome;
	private int pontos;

	public Aluno(String nome, int pontos) {
		this.nome = nome;
		this.pontos = pontos;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public String getNome() {
		return nome;
	}
	
	/*Quando implementamos a interface Comparable, precisamos preencher o campo do generics_ com o tipo de objeto que queremos comparar, 
	nesse caso queremos comparar com Aluno mesmo. Por fim, precisamos implementar o método compareTo().
	A regra de ordenação usando o método compareTo() compara dois objetos (alunos) e funciona da seguinte maneira:
	Para alocar o aluno mais a esquerda da lista, retornamos -1.
	Para alocar o aluno mais a direita da lista, retornamos 1.
	quando retornamos 0 significa que os alunos comparados são iguais e não alteram suas posições.*/
	
	@Override
	public int compareTo(Aluno outroAluno) {
		if (this.pontos > outroAluno.getPontos()) {
			return -1;
		}
		if (this.pontos < outroAluno.getPontos()) {
			return 1;
		}
		return 0;
	}
	
	/*Estamos indicando que se os pontos do aluno forem maior, mande ele mais para esquerda (-1), 
	se for menor, mande para a direita (1) e se os alunos forem iguais não faça nada (0).*/

}
