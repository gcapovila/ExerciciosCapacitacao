package com.gabriel.devdojo.conceitos.metodos;

public class BlocoInicializacaoMain {

	public static void main(String[] args) {

		BlocoInicializacao teste1 = new BlocoInicializacao(); /* ao simplesmente instanciar um objeto, já é chamado o bloco
		                                                      * de inicialização e depois o construtor */
		
		BlocoInicializacao teste2 = new BlocoInicializacao();
		
		BlocoInicializacao teste3 = new BlocoInicializacao();
		
		System.out.println("_______________________________");
		System.out.println("");
		
		//teste1.getTeste(); // forma errada de chamar uma constante, pois não se deve chamar pelo objeto e sim pela classe
		System.out.println(BlocoInicializacao.getTeste()); // forma certa de chamar uma constante
		
		/* Se um objeto é constante, não posso mudar a referência dele - exemplo: setFuncionario(new Funcionario)
		 * mas posso perfeitamente mudar o conteúdo do objeto referenciado (porque neste caso seus atributos não são constantes)*/
		BlocoInicializacao.getFuncionario().setNome(BlocoInicializacao.getFuncionario().getNome() + " da Silva");
		System.out.println(BlocoInicializacao.getFuncionario().getNome());
		
		/* Último conceito de constantes: uma classe constante (public final class Teste) não pode ser extendida (extends Teste)
		 * Da mesma forma, um método constante (public final void metodo) não pode ser sobrescrito (@Override)
		 * mas pode ter sobrecarga (mudar assinatura - quantidade e tipo dos atributos) */

	}

}
