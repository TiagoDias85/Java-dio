package polimorf;

public class Carro extends Veiculo {
		
	public void ligarCarro() {
		verificarCombustivel();
		verificarCambio();
		System.out.println("Ligando Carro!");
	}
	
	private void verificarCombustivel() {
		System.out.println("Verificando combustivel...");
	}
	
	private void verificarCambio() {
		System.out.println("Verificando câmbio...");
	}

}
