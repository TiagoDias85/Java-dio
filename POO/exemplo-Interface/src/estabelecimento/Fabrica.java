package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.copiadora.Xerox;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.equipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		equipamentoMultifuncional em = new equipamentoMultifuncional();
		Xerox xerox = new Xerox();
		Scanner scanner = new Scanner();
		Laserjet laserjet = new Laserjet();
							
		
		Impressora impressora = laserjet;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = xerox;
		
		
		impressora.imprimir();
		copiadora.copiar();
		digitalizadora.digitalizar();
		scanner.digitalizar();
	}

}
