package com.gabriel.alura.java3.interfaces;

public class Cliente implements Pessoa, Autenticavel { /* é possível uma classe implementar mais de uma interface (separa com ,)
 														* porém não pode herdar mais de uma classe (extends não aceita vírgula) */

	
	/*
	 * Obrigatório implementar os métodos da interface autenticável e pessoa
	 */
	
	//private int senha; // esta linha não vai ser mais usada, ver comentário abaixo
	
	AutenticacaoUtil autenticador; // objeto que vai contornar a situação do comentário escrito no método abaixo
	public Cliente(){ // construtor vai ajudar a contornar a situação do comentário escrito no método abaixo
		this.autenticador  = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		
		/* this.senha = senha;*/ /* Acabou sendo necessário copiar e colar o mesmo código em todas as classes que implementam
								  * a interface Autenticavel, pois não pode ter implementação de métodos na interface
								  * Para evitar esse problema e permitir a reutilização de código, foi criada a classe
								  * AutenticacaoUtil. Ela vai ter a implementação dos métodos e as classes que implementam a 
								  * interface Autenticavel vai apenas chamá-la */ 
		
		this.autenticador.setSenha(senha); // chamando setSenha da classe AutenticacaoUtil
		
	}
	

	@Override
	public boolean autentica(int senha) {
		
		/*if(this.senha == senha){
			System.out.println("Usuário autenticado com sucesso");
			return true;
		} else {
			System.out.println("Erro na autenticação");
			return false;
		}*/ /* VER COMENTÁRIO DO MÉTODO ACIMA */
		
		return this.autenticador.autentica(senha); // chamando autentica da classe AutenticacaoUtil
		
	}

	@Override
	public void caminhar() {
		System.out.println("Caminhando");
	}

}
