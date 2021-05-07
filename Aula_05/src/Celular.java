
public class Celular {
	
	public String modelo;
	public String marca;
	public double tamanhoTela;
	public double peso;
	public Bateria bateria;
	
	public Celular(String modelo, String marca, double tamanhoTela, double peso, Bateria bateria) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.tamanhoTela = tamanhoTela;
		this.peso = peso;
		this.bateria = bateria;
	}
	
	public Celular(String modelo, double peso, Bateria bateria) {
		super();
		this.modelo = modelo;
		this.peso = peso;
		this.bateria = bateria;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getTamanhoTela() {
		return tamanhoTela;
	}

	public void setTamanhoTela(double tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Bateria getBateria() {
		return bateria;
	}

	public void setBateria(Bateria bateria) {
		this.bateria = bateria;
	}
	
}
