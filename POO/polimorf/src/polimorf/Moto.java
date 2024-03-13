package polimorf;

public class Moto extends Veiculo {
		
	public void ligarMoto() {
		verificarCombustivel();
		verificarCambio();
		System.out.println("Ligando Moto!");
	}
	
	private void verificarCombustivel() {
		System.out.println("Verificando combustivel...");
	}
	
	private void verificarCambio() {
		System.out.println("Verificando câmbio...");
	}


}
