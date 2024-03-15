package desafioBancoJava;


public class Main {
	
	public static void main(String[] args) {
		
		Cliente tiago = new Cliente();
		tiago.setNome("Tiago");
		Cliente jhonny = new Cliente();
		jhonny.setNome("Jhonny");
		Banco contas = new Banco();
		
	
		Conta ccTiago = new ContaCorrente(tiago);
		Conta poupancaTiago = new ContaPoupança(tiago);
		Conta ccJhonny = new ContaCorrente(jhonny);
		Conta poupancaJhonny = new ContaPoupança(jhonny);

		contas.adicionarConta(ccTiago);
		contas.adicionarConta(poupancaTiago);
		contas.adicionarConta(ccJhonny);
		contas.adicionarConta(poupancaJhonny);
							
		ccTiago.depositar(100);
		
		ccTiago.imprimirExtrato();
			
		ccJhonny.transferir(15, poupancaTiago);
		
		ccJhonny.imprimirExtrato();
		
		contas.imprimirDetalhesContas();
					
	}
	
}
