
public class Bateria {
	
	public String marca;
	public String tipo;
	public double ciclo;
	public int volts;
	
	
	public Bateria(String marca, String tipo, double ciclo, int volts) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.ciclo = ciclo;
		this.volts = volts;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public double getCiclo() {
		return ciclo;
	}


	public void setCiclo(double ciclo) {
		this.ciclo = ciclo;
	}


	public int getVolts() {
		return volts;
	}


	public void setVolts(int volts) {
		this.volts = volts;
	}
	
}
