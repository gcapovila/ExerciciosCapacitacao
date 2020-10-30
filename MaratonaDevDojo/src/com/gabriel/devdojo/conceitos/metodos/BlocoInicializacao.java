package com.gabriel.devdojo.conceitos.metodos;

public class BlocoInicializacao extends BlocoInicializacaoMaeComConstantes {
	
	// Antes de chamar o construtor, sempre que um objeto � instanciado, � chamado o bloco de inicializa��o
	
	private int[] parcelas = new int[5]; // primeiro as vari�veis s�o inicializadas, depois chama o bloco de inicializa��o
	//parcelas = {1,2,3,4,5,6,7,8}; // atribuindo manualmente valores �s parcelas
	
	/* Este ser� bloco abaixo ser� o bloco de inicializa��o (abre e fecha chaves sem nada)
	 * N�o importa onde do c�digo ele esteja, ele ser� executado primeiro (logo ap�s as vari�veis serem inicializadas)
	 * E por �ltimo chama o construtor */
	
	{
		System.out.println("Dentro do bloco de inicializa��o de um objeto");
		
		for (int i = 0; i < 5; i++){
			parcelas[i] = i+1;
			System.out.println("Parcela " + parcelas[i] + " criada");
		}
		
		contador ++; /* se contador n�o fosse est�tico, aqui sempre virariaa 1 (porque iniciaria como 0 para cada objeto)
		       		  * como � est�tico, cada novo objeto far� contador ++. Se tiver 10 objetos, contador ser� 10 */
		
		// Outra coisa, mesmo eu s� declarando int contador ali embaixo, a declara��o � chamada antes do bloco de inicializa��o
		System.out.println("Contador = " + contador);
		System.out.println("---------");
	}	
	
	// Vari�vel para testes. Ela � est�tica, ou seja, da classe e n�o de cada objeto
	private static int contador = 0;
	
	// Construtor da classe ser� chamado depois do bloco de inicializa��o, mesmo que no c�digo esteja antes
	public BlocoInicializacao(){
		System.out.println("Dentro do construtor do objeto " + contador);
		System.out.println("Imprimindo parcelas");
		for(int parcela : parcelas){
			System.out.print(parcela + " ");
		}
		System.out.println(" ");
		System.out.println("--------------------");
	}
	
	/* Caso haja um bloco de inicializa��o est�tico, este ser� executado ainda antes do bloco de inicializa��o normal
	 * Al�m disso, um bloco de inicializa��o est�tico � executado uma �nica vez. J� o n�o est�tico � executado cada vez
	 * que um objeto � instanciado (ver a vari�vel contador no bloco de inicializa��o n�o est�tico l� em cima)*/
	static {
		System.out.println(" ");
		System.out.println("Bloco de inicializa��o est�tico 1. Contador = " + contador);
	}
	
	// Se tem mais de um bloco de inicializa��o, eles s�o executados na ordem que s�o apresentados no c�digo
	static {
		System.out.println("Bloco de inicializa��o est�tico 2");
		System.out.println("------------------");
	}

}
