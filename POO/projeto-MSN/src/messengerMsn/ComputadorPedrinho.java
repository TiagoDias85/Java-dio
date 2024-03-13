package messengerMsn;

import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		String appEscolhido = "msn";
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		else if(appEscolhido.equals("fcb"))
			smi = new FacebookMessenger();
		
		
		smi.enviarMensagem();
		smi.receberMensagem();
		
		
	}
	
}