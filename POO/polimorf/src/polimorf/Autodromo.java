package polimorf;

public class Autodromo {
	public static void main(String[] args) {
		Carro Jeep = new Carro();
		Jeep.setNomeVeiculo("Jeep");
		Jeep.setChassi("159556655");
		exibirChassi(Jeep);
		exibirNome(Jeep);
		Jeep.ligarCarro();
		
		System.out.println("");
		
		Carro monza = new Carro();
		monza.setNomeVeiculo("Monza");
		monza.setChassi("12563336");
		exibirChassi(monza);
		exibirNome(monza);
		monza.ligarCarro();
		

		System.out.println("");
		
		
		Moto z400 = new Moto();
		z400.setNomeVeiculo("z400");
		z400.setChassi("58966365");
		exibirChassi(z400);
		exibirNome1(z400);
		z400.ligarMoto();
		
		
	}

	public static void exibirChassi(Carro carro) {
		String chassi = carro.getChassi();
		System.out.println("O chassi é: " + chassi);
		
	}
	
	public static void exibirNome (Carro carro) {
		String nomeVeiculo = carro.getNomeVeiculo();
		System.out.println("Veículo Selecionado: " + nomeVeiculo);
		
	}
	
	public static void exibirNome1 (Moto moto) {
		String nomeVeiculo = moto.getNomeVeiculo();
		System.out.println("Veículo Selecionado: " + nomeVeiculo);
		
	}
	
	public static void exibirChassi(Moto moto) {
		String chassi = moto.getChassi();
		System.out.println("O chassi é: " + chassi);
		
	}
	
	public static void exibirNome (Moto moto) {
		String nomeVeiculo = moto.getNomeVeiculo();
		System.out.println("Veículo Selecionado: " + nomeVeiculo);
		
	}
		
	
}
