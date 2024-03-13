package iphone.reprodutorMidia;

public class Napster implements ReprodutorMidia {
	@Override
	public void tocar() {
		System.out.println("Reproduzindo música no Napster!");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música no Napster!");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando música no Napster!");
		
	}
}
