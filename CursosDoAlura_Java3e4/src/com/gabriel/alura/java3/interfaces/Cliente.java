package com.gabriel.alura.java3.interfaces;

public class Cliente implements Pessoa, Autenticavel { /* � poss�vel uma classe implementar mais de uma interface (separa com ,)
 														* por�m n�o pode herdar mais de uma classe (extends n�o aceita v�rgula) */

	
	/*
	 * Obrigat�rio implementar os m�todos da interface autentic�vel e pessoa
	 */
	
	//private int senha; // esta linha n�o vai ser mais usada, ver coment�rio abaixo
	
	AutenticacaoUtil autenticador; // objeto que vai contornar a situa��o do coment�rio escrito no m�todo abaixo
	public Cliente(){ // construtor vai ajudar a contornar a situa��o do coment�rio escrito no m�todo abaixo
		this.autenticador  = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		
		/* this.senha = senha;*/ /* Acabou sendo necess�rio copiar e colar o mesmo c�digo em todas as classes que implementam
								  * a interface Autenticavel, pois n�o pode ter implementa��o de m�todos na interface
								  * Para evitar esse problema e permitir a reutiliza��o de c�digo, foi criada a classe
								  * AutenticacaoUtil. Ela vai ter a implementa��o dos m�todos e as classes que implementam a 
								  * interface Autenticavel vai apenas cham�-la */ 
		
		this.autenticador.setSenha(senha); // chamando setSenha da classe AutenticacaoUtil
		
	}
	

	@Override
	public boolean autentica(int senha) {
		
		/*if(this.senha == senha){
			System.out.println("Usu�rio autenticado com sucesso");
			return true;
		} else {
			System.out.println("Erro na autentica��o");
			return false;
		}*/ /* VER COMENT�RIO DO M�TODO ACIMA */
		
		return this.autenticador.autentica(senha); // chamando autentica da classe AutenticacaoUtil
		
	}

	@Override
	public void caminhar() {
		System.out.println("Caminhando");
	}

}
