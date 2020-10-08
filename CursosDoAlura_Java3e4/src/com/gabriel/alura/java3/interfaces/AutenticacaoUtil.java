package com.gabriel.alura.java3.interfaces;

public class AutenticacaoUtil {
	
	/**
	 * CLASSE QUE IMPLEMENTA OS M�TODOS QUE EXISTEM NA INTERFACE AUTENTICAVEL, PARA QUE N�O SEJA NECESS�RIO
	 * COPIAR E COLAR O C�DIGO EM TODAS AS CLASSES QUE IMPLEMENTAM ESTA INTERFACE
	 * 
	 * Se Autenticavel fosse uma classe abstrata, estes m�todos n�o precisariam ser abstratos, estariam implementados nela mesmo
	 * Mas como Autenticavel � uma interface, e interface n�o permite m�todos concretos (implementados), � necess�rio
	 * utilizar esta solu��o para que seja enfim poss�vel reutilizar c�digo
	 */
	
	private int senha;
	
	public void setSenha(int senha) {		
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if(this.senha == senha){
			System.out.println("Usu�rio autenticado com sucesso");
			return true;
		} else {
			System.out.println("Erro na autentica��o");
			return false;
		}
	}

}
