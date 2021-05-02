import java.util.Scanner;

public class CriaContaBancaria {

	private static Scanner input;

	public static void main(String[] args) {

		ContaBancaria novaConta = new ContaBancaria();
		input = new Scanner(System.in);

		System.out.println("Informe o titular da conta : ");
		novaConta.setTitular(input.nextLine());
		System.out.println("Informe o número da conta : ");
		novaConta.setNumero(input.nextInt());
		System.out.println("Informe a agência da conta : ");
		novaConta.setAgencia(input.nextInt());
		System.out.println("Informe o saldo inicial da conta : ");
		novaConta.setSaldo(input.nextDouble());

		System.out.println("----- CONTA ------");
		System.out.println("Titular da conta : " + novaConta.getTitular());
		System.out.println("Numero da conta  : " + novaConta.getNumero());
		System.out.println("Agencia da conta : " + novaConta.getAgencia());
		System.out.println("Saldo da conta   : " + novaConta.getSaldo());
		System.out.println("------------------");

		while (true) {
			System.out.println("Caixa eletrônico");
			System.out.println("Escolha 1 para sacar");
			System.out.println("Escolha 2 para depósito");
			System.out.println("Escolha 3 para verificar o saldo");
			System.out.println("Escolha 4 para transferência");
			System.out.println("Escolha 5 para aplicar na poupança");
			System.out.println("Escolha 6 para SAIR");
			System.out.print("Escolha a operação que deseja realizar:");

			// obter a escolha do usuário
			int escolha = input.nextInt();
			switch (escolha) {
			case 1:
				System.out.print("Informe o valor que deseja sacar : ");
				// obter o dinheiro retirado do usuário
				novaConta.sacar(input.nextDouble());
				break;

			case 2:
				System.out.print("Informe o valor que deseja depositar : ");
				// obter a quantidade de depósito do usuário
				novaConta.depositar(input.nextDouble());
				break;

			case 3:
				// exibindo o saldo total do usuário
				System.out.println("");
				System.out.println("Saldo : " + novaConta.getSaldo());
				System.out.println("");
				break;

			case 4:
				// obtendo o valor a ser transferido
				System.out.println("Informe o valor a ser transferido : ");
				double valorTransferido = input.nextDouble();
				System.out.println("Informe o número da conta de destino : ");
				int destino = input.nextInt();
				novaConta.transferir(valorTransferido, destino);
				break;

			case 5:
				// obter a quantidade do valor poupado
				System.out.println("Informe o valor a ser aplicado na poupança : ");
				double valor = input.nextDouble();
				System.out.println("Informe a conta a ser aplicado na poupança : ");
				int numero = input.nextInt();
				if (numero == novaConta.getNumero()) {
					novaConta.poupanca(valor, novaConta);
				} else {
				System.out.println("Erro de validação, reveja os dados informados!");
				}
				break;

			case 6:
				// exit from the menu
				System.exit(0);
			}
		}
	}
}
