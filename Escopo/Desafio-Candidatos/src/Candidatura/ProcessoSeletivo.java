package Candidatura;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
	public static void main(String[] args) {
		imprimirSelecionados();
	}
	
	static void imprimirSelecionados () {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		System.out.println("Imprimindo lista de candidatos e seu respectivo Indice: ");
		for(int indice = 0; indice <  candidatos.length; indice++)
			System.out.println("O canditato " + candidatos[indice] +  " está no Indice" + (indice+1));
		
		//forma abreviada de usar o laço for usando for each
		
		for(String candidato : candidatos)
			System.out.println("Olá " + candidato);
		
	}
	
	static void selecaoCandidatos() {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
		
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		
		while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O Candidato(a) " + candidato + " Solicitou o Salário de: " + salarioPretendido );
			if(salarioPretendido <= salarioBase) {
				System.out.println("O candidato(a) " + candidato + " foi Selecionado(a)");
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
	
	}
	
	static double valorPretendido() {
	     return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}else if(salarioBase == salarioPretendido)
			{System.out.println("RETORNAR COM CONTRA PROPOSTA");			
			}
		else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
	
}
