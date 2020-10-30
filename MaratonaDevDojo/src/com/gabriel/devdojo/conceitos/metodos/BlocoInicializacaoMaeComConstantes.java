package com.gabriel.devdojo.conceitos.metodos;

public class BlocoInicializacaoMaeComConstantes {
	
	static {
		System.out.println("");
		System.out.println("Bloco de inicializa��o est�tico da classe-m�e");
		/* todas as classes que extendem uma classe com bloco de inicializa��o, vai rodar primeiro os blocos de inicializa��o
		 * est�ticos dela, e depois sempre que criado um objeto dessa classe, o bloco de inicializa��o n�o-est�tico da m�e
		 * 
		 * Se a m�e tiver um bloco est�tico, vai rodar ele antes de qualquer coisa*/
		
		
		/*TESTE_CONSTANTE = 300;*/ /* se a constante (ver abaixo) � est�tica e n�o foi inicializada, inicializar
		 							* dentro de um bloco de inicializa��o constante */
		
	}
	
	{
		System.out.println("Bloco de inicializa��o n�o-est�tico da m�e");
	}
	
	private static final double TESTE_CONSTANTE = 200; // assim se declara uma constante, e � obrigat�rio inicializar
	
//	public BlocoInicializacaoMaeComConstantes(){
//		TESTE_CONSTANTE = 300; // caso a constante n�o foi inicializada e n�o for est�tica, pode-se inicializar no construtor
//	}
	
	public static double getTeste(){
		return TESTE_CONSTANTE; // n�o pode existir set para constante, pois o valor dela n�o pode ser modificado
	}
	
	// podemos inclusive fazer objetos constantes
	public static final Funcionario FUNCIONARIO = new Funcionario("Maria", "456977", "578955");
	
	public static Funcionario getFuncionario() {
		return FUNCIONARIO;
	}

}
