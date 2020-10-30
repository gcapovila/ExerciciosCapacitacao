
/**
 * Classe que vai ter explicação e utilização de conceitos de FQN, do pacote java.lang e da imutabilidade da classe String
 * 
 * @author Gabriel Capovila
 * 
 */

package com.gabriel.alura.java5;

import java.lang.*; /* esta linha é opcional, porque o java.lang já é automaticamente importado (por ser o pacote mais
					 * importante e indispensável) */

								// não é necessário extender Object, é automaticamente extendida
public class FQNJavaLangEStringMetodosImutabilidade extends Object {
	/* Uma classe pode ter um FQN (Full Qualified Name) que é o nome completo (pacote + classe)
 	 * No caso seria: com.gabriel.alura.java5.StringImutabilidade */

	public static void main(String[] args) {

		String nome = "  teste"; // por que é possível fazer assim, sendo que String é uma classe?
		
		/*String nome2 = new String("teste");*/ /* teoricamente deveria ser assim, mas não precisa,
											     * porque String já tem um tratamento especial que não obriga a fazer isso
											     * 
											     * Isso se chama Sintaxe object literal (sintaxe de int num = 1 por exemplo)
											     * è até melhor usar object literal porque assim a JVM pode executar várias
											     * otimizações por baixo dos panos */
		
		
		/** IMUTABILIDADE: */
		
		nome.replace("tes", "Tes"); // este método substitui uma sequencia de caracter pela outra dentro da string
		nome.toUpperCase(); // mudar tudo para letra maiúscula
		System.out.println("Nome: " + nome); // mas nenhum dos métodos acima funciona
		
		/** Isso é imutabilidade, uma vez criada uma string, ela não pode ser alterada
		 *  Para contornar, é necessário criar uma nova string, e atribuir a ela o valor após modificado: */
		
		String nomePrimeiraLetraMaiuscula = nome.replace("tes", "Tes");
		String nomeTudoMaiusculo = nome.toUpperCase();
		
		/* Eu poderia também fazer a própria String nome parar de referenciar o que estava referenciando antes (" teste")
		 * e fazer ela referênciar nome.replace("tes", "Tes"); por exemplo:
		 * 
		 * nome = nome.replace("tes", "Tes"); */ 
		
		System.out.println("");
		System.out.println("Primeira letra maiúscula: " + nomePrimeiraLetraMaiuscula + 
				"    |    Todas maiúsculas: " + nomeTudoMaiusculo);
		
		// OUTROS MÉTODOS DA CLASSE STRING:
		System.out.println("");
		System.out.println("Imprimindo caracter na posição 5: " + nomeTudoMaiusculo.charAt(4));
		System.out.println("");
		System.out.println("Imprimindo tudo a partir da posição 5: " + nome.substring(4));
		System.out.println("");
		System.out.println("Imprimindo tudo a partir da posição 5 até 6: " + nome.substring(4,6)); /* O primeiro numero (a partir
		 									da onde quero pegar) conta desde o 0, porém o segundo (até onde) conta a partir de 1 */
		System.out.println("");
		System.out.println("Imprimindo tudo sem os espaços do começo: " + nome.trim());
		// também tem métodos de coleções: indexOf, length, isEmpty e contains

	}

}
