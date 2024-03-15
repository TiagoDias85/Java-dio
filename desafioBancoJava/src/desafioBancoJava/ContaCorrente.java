package desafioBancoJava;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("### Imprimindo Extrado da Conta Corrente... ### \n" );
		imprimirDetalheConta();			
			
	}
	
	@Override
	protected void imprimirDetalheConta() {
	    super.imprimirDetalheConta();
	    System.out.println("Tipo: Conta Corrente \n -----------------------------------------");
	}

	
}

 