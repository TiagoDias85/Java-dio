package iphone.reprodutorMidia;

public class Itunes implements ReprodutorMidia {

	@Override
	public void tocar() {
		System.out.println("Reproduzindo música no Itunes!");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música no Itunes!");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando música no Itunes!");
		
	}
	

}
