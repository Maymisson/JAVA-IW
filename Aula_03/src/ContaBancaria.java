
public class ContaBancaria {

	private double saldo;
	private int agencia;
	private int numero;
	private String titular;

	// --- Metodos comportamentais ---
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("");
		System.out.println("Deposito de : " + valor + " realizado com sucesso!");
		System.out.println("");
	}

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("");
			System.out.println("Saque de : " + valor + " realizado com sucesso!");
			System.out.println("");
			return true;
		}
		System.out.println("");
		System.out.println("Saldo insuficiente para saque");
		System.out.println("");
		return false;
	}

	public boolean transferir(double valor, int destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("");
			System.out.println("Transferência de : " + valor + " para conta : " + destino + " realizada com sucesso!");
			System.out.println("");
			return true;
		}
		System.out.println("");
		System.out.println("Saldo insuficiente para transferência");
		System.out.println("");
		return false;
	}
	
	public boolean poupanca(double valor, ContaBancaria conta) {
		if (this.saldo >= valor) {
			this.saldo += valor;
			conta.depositar(valor * (0.02 *30));
			System.out.println("");
			System.out.println("Valor aplicado na poupança : " + valor + " , rendimento de 0,02% dia");
			System.out.println("Valor mensal do rendimento a ser resgatado : " + (valor * (0.02 *30)));
			System.out.println("");
			return true;
		}
		System.out.println("");
		System.out.println("Saldo insuficiente para transferência");
		System.out.println("");
		return false;
	}

	// --- Metodos Getters e Setters ---
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

}
