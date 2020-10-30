package com.gabriel.devdojo.conceitos.metodos;

public class BlocoInicializacaoMain {

	public static void main(String[] args) {

		BlocoInicializacao teste1 = new BlocoInicializacao(); /* ao simplesmente instanciar um objeto, j� � chamado o bloco
		                                                      * de inicializa��o e depois o construtor */
		
		BlocoInicializacao teste2 = new BlocoInicializacao();
		
		BlocoInicializacao teste3 = new BlocoInicializacao();
		
		System.out.println("_______________________________");
		System.out.println("");
		
		//teste1.getTeste(); // forma errada de chamar uma constante, pois n�o se deve chamar pelo objeto e sim pela classe
		System.out.println(BlocoInicializacao.getTeste()); // forma certa de chamar uma constante
		
		/* Se um objeto � constante, n�o posso mudar a refer�ncia dele - exemplo: setFuncionario(new Funcionario)
		 * mas posso perfeitamente mudar o conte�do do objeto referenciado (porque neste caso seus atributos n�o s�o constantes)*/
		BlocoInicializacao.getFuncionario().setNome(BlocoInicializacao.getFuncionario().getNome() + " da Silva");
		System.out.println(BlocoInicializacao.getFuncionario().getNome());
		
		/* �ltimo conceito de constantes: uma classe constante (public final class Teste) n�o pode ser extendida (extends Teste)
		 * Da mesma forma, um m�todo constante (public final void metodo) n�o pode ser sobrescrito (@Override)
		 * mas pode ter sobrecarga (mudar assinatura - quantidade e tipo dos atributos) */

	}

}
