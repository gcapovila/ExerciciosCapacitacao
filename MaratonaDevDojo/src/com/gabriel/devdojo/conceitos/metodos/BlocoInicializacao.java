package com.gabriel.devdojo.conceitos.metodos;

public class BlocoInicializacao {
	
	// Antes de chamar o construtor, sempre que um objeto � instanciado, � chamado o bloco de inicializa��o
	
	private int[] parcelas = new int[15]; // primeiro as vari�veis s�o inicializadas, depois chama o bloco de inicializa��o
	//parcelas = {1,2,3,4,5,6,7,8}; // atribuindo manualmente valores �s parcelas
	
	/* Este ser� bloco abaixo ser� o bloco de inicializa��o (abre e fecha chaves sem nada)
	 * N�o importa onde do c�digo ele esteja, ele ser� executado primeiro (logo ap�s as vari�veis serem inicializadas)
	 * E por �ltimo chama o construtor */
	
	{
		System.out.println("Dentro do bloco de inicializa��o");
		
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
