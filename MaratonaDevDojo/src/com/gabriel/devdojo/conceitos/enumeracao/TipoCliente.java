package com.gabriel.devdojo.conceitos.enumeracao;

public enum TipoCliente {	
	
	/**
	 * Isto aqui � um Enum (um tipo diferente de classe | - bot�o direito -> new -> Enum)
	 * 
	 * Ele declara atributos especiais, sendo que ao chamar um enum em uma classe, voc� s� pode passar o valor de um dos
	 * atribustos que est�o declados nele
	 * 
	 * Ao inv�s de criar um Enum como uma classe, tamb�m � poss�vel criar dentro de uma classe normal j� existente
	 * tratando o Enum como se fosse um m�todo:
	 
	 public enum TipoCliente {
	 	PESSOA_FISICA, PESSOA_JURIDICA;
	 }
	  
	 */
	
	
	/* PESSOA_FISICA, PESSOA_JURIDICA; */ /* Em um Enum, todos os atributos s�o automaticamente constantes, ou seja,
	                                       * n�o precisa do "public static final" */
	
	// Na forma acima, estamos declarando apenas o noem das constantes
	PESSOA_FISICA(1, "Pessoa f�sica"), PESSOA_JURIDICA(2, "Pessoa jur�dica"); 
								   /* Dessa forma estamos declarando tanto o nome da constante quanto atributos dela
	 								* Isso nos obriga a criar um construtor que receba, no caso, um int e String (ver abaixo) */
	
	public String teste; // um enum pode ter atributos normais tamb�m, por�m devem ser declarados ap�s as onstantes de enum
	
	// Construtor (opcional) que recebe os atributos da constante (n�o pode ser chamado em outra classe)
	private int numero;
	private String nome;
	private TipoCliente(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	// Get que obt�m o n�mero do tipo (somente se as constantes foram declaradas da forma "PESSOA_FISICA(1), PESSOA_JURIDICA(2)"
	public int getNumero() {
		return numero;
	}
	
	// Get que obt�m o nome do tipo (somente se as constantes foram declaradas da forma "PESSOA_FISICA("teste")"
	public String getNome() {
		return nome;
	}
	
	/**
	 * constant specific class body
	 * 
	 * Eu poderia sobrescrever um dos m�todos do enum coaso a constante chamada seja algo espec�fico
	 * 
	 * Para isso, l� no come�o, onde declaro as constantes, se eu quisesse sobrescrever um m�todo somente caso fosse PF, seria:
	 
	 PESSOA_FISICA(1, "Pessoa f�sica") {
	 	public String getNome() {
			return "testando";
		}	 
	 } , PESSOA_JURIDICA(2, "Pessoa jur�dica"); // pessoa jur�dica chama o m�todo normal, sem sobrescrever
	  
	 * 
	 */

}
