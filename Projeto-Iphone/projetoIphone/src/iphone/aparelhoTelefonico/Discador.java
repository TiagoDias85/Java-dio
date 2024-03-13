package iphone.aparelhoTelefonico;

public class Discador implements AparelhoTelefonico  {
	public void ligar() {
		System.out.println("Discando via discador default...");
	}

	public void atender() {
		System.out.println("Chamada atendida...");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Chamando Correio de Voz...");
	}
	

}
