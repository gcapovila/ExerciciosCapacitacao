package com.gabriel.alura.java3.interfaces;

public class AutenticacaoUtil {
	
	/**
	 * CLASSE QUE IMPLEMENTA OS MÉTODOS QUE EXISTEM NA INTERFACE AUTENTICAVEL, PARA QUE NÃO SEJA NECESSÁRIO
	 * COPIAR E COLAR O CÓDIGO EM TODAS AS CLASSES QUE IMPLEMENTAM ESTA INTERFACE
	 * 
	 * Se Autenticavel fosse uma classe abstrata, estes métodos não precisariam ser abstratos, estariam implementados nela mesmo
	 * Mas como Autenticavel é uma interface, e interface não permite métodos concretos (implementados), é necessário
	 * utilizar esta solução para que seja enfim possível reutilizar código
	 */
	
	private int senha;
	
	public void setSenha(int senha) {		
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if(this.senha == senha){
			System.out.println("Usuário autenticado com sucesso");
			return true;
		} else {
			System.out.println("Erro na autenticação");
			return false;
		}
	}

}
