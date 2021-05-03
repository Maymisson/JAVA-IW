
public class Veiculo {
	
	// Classe de criação de veiculos;
	
	public String marca;
	public String modelo;
	public int portas;
	public int pneus;
	public double velocidade;
	
	public Veiculo(String marca, String modelo, int portas, int pneus, double velocidade) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.portas = portas;
		this.pneus = pneus;
		this.velocidade = velocidade;
	}
	// Sobrecarga do metodo contrutor
	public Veiculo(String marca, String modelo, int pneus, double velocidade) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.pneus = pneus;
		this.velocidade = velocidade;
	}
	
	// Metodos Getters e Setters
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public int getPneus() {
		return pneus;
	}
	public void setPneus(int pneus) {
		this.pneus = pneus;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
}
