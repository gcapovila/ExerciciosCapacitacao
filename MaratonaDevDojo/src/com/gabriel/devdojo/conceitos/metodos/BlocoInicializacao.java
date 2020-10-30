package com.gabriel.devdojo.conceitos.metodos;

public class BlocoInicializacao extends BlocoInicializacaoMaeComConstantes {
	
	// Antes de chamar o construtor, sempre que um objeto é instanciado, é chamado o bloco de inicialização
	
	private int[] parcelas = new int[5]; // primeiro as variáveis são inicializadas, depois chama o bloco de inicialização
	//parcelas = {1,2,3,4,5,6,7,8}; // atribuindo manualmente valores ás parcelas
	
	/* Este será bloco abaixo será o bloco de inicialização (abre e fecha chaves sem nada)
	 * Não importa onde do código ele esteja, ele será executado primeiro (logo após as variáveis serem inicializadas)
	 * E por último chama o construtor */
	
	{
		System.out.println("Dentro do bloco de inicialização de um objeto");
		
		for (int i = 0; i < 5; i++){
			parcelas[i] = i+1;
			System.out.println("Parcela " + parcelas[i] + " criada");
		}
		
		contador ++; /* se contador não fosse estático, aqui sempre virariaa 1 (porque iniciaria como 0 para cada objeto)
		       		  * como é estático, cada novo objeto fará contador ++. Se tiver 10 objetos, contador será 10 */
		
		// Outra coisa, mesmo eu só declarando int contador ali embaixo, a declaração é chamada antes do bloco de inicialização
		System.out.println("Contador = " + contador);
		System.out.println("---------");
	}	
	
	// Variável para testes. Ela é estática, ou seja, da classe e não de cada objeto
	private static int contador = 0;
	
	// Construtor da classe será chamado depois do bloco de inicialização, mesmo que no código esteja antes
	public BlocoInicializacao(){
		System.out.println("Dentro do construtor do objeto " + contador);
		System.out.println("Imprimindo parcelas");
		for(int parcela : parcelas){
			System.out.print(parcela + " ");
		}
		System.out.println(" ");
		System.out.println("--------------------");
	}
	
	/* Caso haja um bloco de inicialização estático, este será executado ainda antes do bloco de inicialização normal
	 * Além disso, um bloco de inicialização estático é executado uma única vez. Já o não estático é executado cada vez
	 * que um objeto é instanciado (ver a variável contador no bloco de inicialização não estático lá em cima)*/
	static {
		System.out.println(" ");
		System.out.println("Bloco de inicialização estático 1. Contador = " + contador);
	}
	
	// Se tem mais de um bloco de inicialização, eles são executados na ordem que são apresentados no código
	static {
		System.out.println("Bloco de inicialização estático 2");
		System.out.println("------------------");
	}

}
