package com.gabriel.alura.java4;

public class MinhaExcecao extends Exception { /* Se o tipo da exceção for RuntimeException, não é necessário declarar o
 											   * "throws" ao declarar o método. Porém, se for apenas Exception, precisa 
 											   * 
 											   * Quando se extende direto Exception, estamos praticando um tipo de exceção
 											   * chamado Checked (verificado pelo compilador)
 											   * Por isso o throws deve ficar explícito na assinatura do método (ou então o
 											   * método precisa de um try catch para tratar a exceção)
 											   * 
 											   * Já quando se extende RuntimeException, estamos praticando um tipo de exceção
 											   * chamado Unchecked (não verificado pelo compilador) - por isso não usa throws */
	
	// Precisa do construtor se eu quiser que minha exceção receba uma mensagem
	
	public MinhaExcecao(String msg){
		super(msg); // chamando o construtor da classe mãe (Exception) e passando a mensagem para ele
	}
	
	public MinhaExcecao(){
		super(); // chamando o construtor sem parâmetros da classe mãe (Exception)
	}

}
