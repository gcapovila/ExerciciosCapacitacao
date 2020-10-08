package com.gabriel.alura.java3.interfaces;

public interface Autenticavel {
	
	/* Necessidade: nova classe Cliente. Tanto cliente quanto funcionário precisam autenticar
	 * Porém, o método autentica estava na classe funcionário, e não faz sentido cliente herdar funcionário
	 * pois um clietne não é um funcionário
	 * 
	 * Criada então interface Autenticavel que vai conter o método de autenticação que antes estava na classe funcionario*/
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha); /* uma interface NÃO PERMITE IMPLEMENTAR MÉTODOS; não permite método concreto
	 											   * por isso tudo tem que ser abstract*/

}
