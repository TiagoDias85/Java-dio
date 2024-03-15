package desafioBancoJava;

public class ContaPoupança extends Conta {
	
	public ContaPoupança(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("### Imprimindo Extrado da Conta Poupança... ### \n" );
		imprimirDetalheConta();
	}
	
	@Override
	protected void imprimirDetalheConta() {
	    super.imprimirDetalheConta();
	    System.out.println("Tipo: Conta Poupança \n -----------------------------------------");
	}
	
}
