import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Celular cell = new Celular("A30s", "Samsung", 15.5, 1.3, new Bateria("ITIL", "AA+", 400, 12));
		Celular cell2 = new Celular("N20", "Nokia", 13.5, 2.5, new Bateria("BAT", "BB+", 500, 24));
		// Metodo construtor sobrecarregado
		Celular cell3 = new Celular("Asus", 10.3, new Bateria("BAT", "BB+", 500, 24));
		
		System.out.println("--- INFO DO CELULAR -- ");
		System.out.println(cell.getModelo());
		System.out.println(cell.getMarca());
		System.out.println(cell.getTamanhoTela());
		System.out.println(cell.getPeso());
		System.out.println("--- INFO DA BATERIA -- ");
		System.out.println(cell.getBateria().getMarca());
		System.out.println(cell.getBateria().getTipo());
		System.out.println(cell.getBateria().getCiclo());
		System.out.println(cell.getBateria().getVolts());
		System.out.println("---------------------- ");
		
		ArrayList<Celular> listCelular = new ArrayList<>();
		listCelular.add(cell);
		listCelular.add(cell2);
		listCelular.add(cell3);
		
		System.out.println("\n");
		System.out.println("--- LISTA DE CELULARES -- ");
		System.out.println("\n");
		for (Celular c : listCelular) {
			System.out.println("--- INFO DO CELULAR -- ");
			System.out.println(c.getModelo());
			System.out.println(c.getMarca());
			System.out.println(c.getTamanhoTela());
			System.out.println(c.getPeso());
			System.out.println("--- INFO DA BATERIA -- ");
			System.out.println(c.getBateria().getMarca());
			System.out.println(c.getBateria().getTipo());
			System.out.println(c.getBateria().getCiclo());
			System.out.println(c.getBateria().getVolts());
			System.out.println("---------------------- ");
		}
	}

}
