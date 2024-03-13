package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class equipamentoMultifuncional implements Digitalizadora, Impressora, Copiadora{

	
	public void copiar() {
		System.out.println("Copiando via Multifuncional");		
	}
	
	public void imprimir() {
		System.out.println("Imprimindo via Multifuncional");	
		
	}

	public void digitalizar() {
		System.out.println("Digitalizando via Multifuncional");
		
	}

	
}
