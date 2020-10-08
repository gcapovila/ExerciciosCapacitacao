package com.gabriel.alura.java3.interfaces;

public interface Autenticavel {
	
	/* Necessidade: nova classe Cliente. Tanto cliente quanto funcion�rio precisam autenticar
	 * Por�m, o m�todo autentica estava na classe funcion�rio, e n�o faz sentido cliente herdar funcion�rio
	 * pois um clietne n�o � um funcion�rio
	 * 
	 * Criada ent�o interface Autenticavel que vai conter o m�todo de autentica��o que antes estava na classe funcionario*/
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha); /* uma interface N�O PERMITE IMPLEMENTAR M�TODOS; n�o permite m�todo concreto
	 											   * por isso tudo tem que ser abstract*/

}
