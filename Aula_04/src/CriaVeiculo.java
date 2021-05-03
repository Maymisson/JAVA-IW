import java.util.ArrayList;

public class CriaVeiculo {

	public static void main(String[] args) {
		// Classe resposável pela criação do objeto tipo veiculo
		
		Veiculo carro = new Veiculo("Chevrolet", "Gol 1.0", 4, 4, 190.0);
		Veiculo caminhao = new Veiculo("volkswagen", "9.170 Delivery", 2, 6, 220.0);
		Veiculo moto = new Veiculo("Honda", "Fan 150", 2, 160.5);
		
		// Usando Get e Set 
		moto.setMarca("Yamaha");
		moto.setModelo("Lander 150");
		
		System.out.println(carro.getModelo()); 
		System.out.println(caminhao.getVelocidade());
		
		ArrayList<Veiculo> listVeiculos = new ArrayList<>();
		listVeiculos.add(moto);
		listVeiculos.add(caminhao);
		listVeiculos.add(carro);
		
		for (Veiculo veiculo : listVeiculos) {
			System.out.println("Modelo : " + veiculo.getMarca() + 
								" | Marca : " + veiculo.getModelo() +
								" | Quant. Pneus : " + veiculo.getPneus() + 
								" | Quant. Portas : " + veiculo.getPortas() + 
								" | Velocidade Max : " + veiculo.getVelocidade());
		}

	}

}
