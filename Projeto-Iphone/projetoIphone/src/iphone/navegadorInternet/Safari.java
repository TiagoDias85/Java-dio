package iphone.navegadorInternet;

public class Safari implements NavegadorInternet 
{

	public void exibirPagina() {
		System.out.println("Abrindo nova aba no Safari!");
	}

	public void AdicionarNovaAba() {
		System.out.println("Adicionando nova aba no Safari!");
	}

	
	public void atualizarPagina() {
		System.out.println("Atualizando Página no Safari!");
	}

}
