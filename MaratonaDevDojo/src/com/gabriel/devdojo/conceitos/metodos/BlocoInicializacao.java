package com.gabriel.devdojo.conceitos.metodos;

public class BlocoInicializacao {
	
	// Antes de chamar o construtor, sempre que um objeto é instanciado, é chamado o bloco de inicialização
	
	private int[] parcelas = new int[15]; // primeiro as variáveis são inicializadas, depois chama o bloco de inicialização
	//parcelas = {1,2,3,4,5,6,7,8}; // atribuindo manualmente valores ás parcelas
	
	/* Este será bloco abaixo será o bloco de inicialização (abre e fecha chaves sem nada)
	 * Não importa onde do código ele esteja, ele será executado primeiro (logo após as variáveis serem inicializadas)
	 * E por último chama o construtor */
	
	{
		System.out.println("Dentro do bloco de inicialização");
		
		for (int i = 0; i < 15; i++){
			parcelas[i] = i+1;
			System.out.println("Parcela " + parcelas[i] + " criada");
		}
	}
	
	public BlocoInicializacao(){
		System.out.println("------------------");
		System.out.println("Dentro do construtor");
		System.out.println("Imprimindo parcelas");
		for(int parcela : parcelas){
			System.out.print(parcela + " ");
		}
	}

}
