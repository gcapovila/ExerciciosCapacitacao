package com.gabriel.alura.java4;

public class MinhaExcecao extends Exception { /* Se o tipo da exce��o for RuntimeException, n�o � necess�rio declarar o
 											   * "throws" ao declarar o m�todo. Por�m, se for apenas Exception, precisa 
 											   * 
 											   * Quando se extende direto Exception, estamos praticando um tipo de exce��o
 											   * chamado Checked (verificado pelo compilador)
 											   * Por isso o throws deve ficar expl�cito na assinatura do m�todo (ou ent�o o
 											   * m�todo precisa de um try catch para tratar a exce��o)
 											   * 
 											   * J� quando se extende RuntimeException, estamos praticando um tipo de exce��o
 											   * chamado Unchecked (n�o verificado pelo compilador) - por isso n�o usa throws */
	
	// Precisa do construtor se eu quiser que minha exce��o receba uma mensagem
	
	public MinhaExcecao(String msg){
		super(msg); // chamando o construtor da classe m�e (Exception) e passando a mensagem para ele
	}
	
	public MinhaExcecao(){
		super(); // chamando o construtor sem par�metros da classe m�e (Exception)
	}

}
