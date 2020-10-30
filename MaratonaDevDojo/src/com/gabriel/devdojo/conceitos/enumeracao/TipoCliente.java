package com.gabriel.devdojo.conceitos.enumeracao;

public enum TipoCliente {	
	
	/**
	 * Isto aqui é um Enum (um tipo diferente de classe | - botão direito -> new -> Enum)
	 * 
	 * Ele declara atributos especiais, sendo que ao chamar um enum em uma classe, você só pode passar o valor de um dos
	 * atribustos que estão declados nele
	 * 
	 * Ao invés de criar um Enum como uma classe, também é possível criar dentro de uma classe normal já existente
	 * tratando o Enum como se fosse um método:
	 
	 public enum TipoCliente {
	 	PESSOA_FISICA, PESSOA_JURIDICA;
	 }
	  
	 */
	
	
	/* PESSOA_FISICA, PESSOA_JURIDICA; */ /* Em um Enum, todos os atributos são automaticamente constantes, ou seja,
	                                       * não precisa do "public static final" */
	
	// Na forma acima, estamos declarando apenas o noem das constantes
	PESSOA_FISICA(1, "Pessoa física"), PESSOA_JURIDICA(2, "Pessoa jurídica"); 
								   /* Dessa forma estamos declarando tanto o nome da constante quanto atributos dela
	 								* Isso nos obriga a criar um construtor que receba, no caso, um int e String (ver abaixo) */
	
	public String teste; // um enum pode ter atributos normais também, porém devem ser declarados após as onstantes de enum
	
	// Construtor (opcional) que recebe os atributos da constante (não pode ser chamado em outra classe)
	private int numero;
	private String nome;
	private TipoCliente(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	// Get que obtém o número do tipo (somente se as constantes foram declaradas da forma "PESSOA_FISICA(1), PESSOA_JURIDICA(2)"
	public int getNumero() {
		return numero;
	}
	
	// Get que obtém o nome do tipo (somente se as constantes foram declaradas da forma "PESSOA_FISICA("teste")"
	public String getNome() {
		return nome;
	}
	
	/**
	 * constant specific class body
	 * 
	 * Eu poderia sobrescrever um dos métodos do enum coaso a constante chamada seja algo específico
	 * 
	 * Para isso, lá no começo, onde declaro as constantes, se eu quisesse sobrescrever um método somente caso fosse PF, seria:
	 
	 PESSOA_FISICA(1, "Pessoa física") {
	 	public String getNome() {
			return "testando";
		}	 
	 } , PESSOA_JURIDICA(2, "Pessoa jurídica"); // pessoa jurídica chama o método normal, sem sobrescrever
	  
	 * 
	 */

}
