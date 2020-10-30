package com.gabriel.devdojo.conceitos.metodos;

public class BlocoInicializacaoMaeComConstantes {
	
	static {
		System.out.println("");
		System.out.println("Bloco de inicialização estático da classe-mãe");
		/* todas as classes que extendem uma classe com bloco de inicialização, vai rodar primeiro os blocos de inicialização
		 * estáticos dela, e depois sempre que criado um objeto dessa classe, o bloco de inicialização não-estático da mãe
		 * 
		 * Se a mãe tiver um bloco estático, vai rodar ele antes de qualquer coisa*/
		
		
		/*TESTE_CONSTANTE = 300;*/ /* se a constante (ver abaixo) é estática e não foi inicializada, inicializar
		 							* dentro de um bloco de inicialização constante */
		
	}
	
	{
		System.out.println("Bloco de inicialização não-estático da mãe");
	}
	
	private static final double TESTE_CONSTANTE = 200; // assim se declara uma constante, e é obrigatório inicializar
	
//	public BlocoInicializacaoMaeComConstantes(){
//		TESTE_CONSTANTE = 300; // caso a constante não foi inicializada e não for estática, pode-se inicializar no construtor
//	}
	
	public static double getTeste(){
		return TESTE_CONSTANTE; // não pode existir set para constante, pois o valor dela não pode ser modificado
	}
	
	// podemos inclusive fazer objetos constantes
	public static final Funcionario FUNCIONARIO = new Funcionario("Maria", "456977", "578955");
	
	public static Funcionario getFuncionario() {
		return FUNCIONARIO;
	}

}
