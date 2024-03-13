package usuário;

import iphone.aparelhoTelefonico.AparelhoTelefonico;
import iphone.aparelhoTelefonico.Discador;
import iphone.navegadorInternet.NavegadorInternet;
import iphone.navegadorInternet.Opera;
import iphone.navegadorInternet.Safari;
import iphone.reprodutorMidia.Itunes;
import iphone.reprodutorMidia.Napster;
import iphone.reprodutorMidia.ReprodutorMidia;

public class Usuário1 {
	public static void main(String[] args) {
		
		AparelhoTelefonico discador = new Discador();
		NavegadorInternet opera = new Opera();
		NavegadorInternet safari = new Safari();
		ReprodutorMidia itunes = new Itunes();
		ReprodutorMidia napster = new Napster();
		
		
		discador.atender();
		opera.exibirPagina();
		safari.AdicionarNovaAba();
		itunes.tocar();
		napster.selecionarMusica();
		
		
	
	}

}
