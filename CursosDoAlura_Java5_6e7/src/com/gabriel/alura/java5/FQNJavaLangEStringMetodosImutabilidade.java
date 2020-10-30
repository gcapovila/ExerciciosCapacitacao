
/**
 * Classe que vai ter explica��o e utiliza��o de conceitos de FQN, do pacote java.lang e da imutabilidade da classe String
 * 
 * @author Gabriel Capovila
 * 
 */

package com.gabriel.alura.java5;

import java.lang.*; /* esta linha � opcional, porque o java.lang j� � automaticamente importado (por ser o pacote mais
					 * importante e indispens�vel) */

								// n�o � necess�rio extender Object, � automaticamente extendida
public class FQNJavaLangEStringMetodosImutabilidade extends Object {
	/* Uma classe pode ter um FQN (Full Qualified Name) que � o nome completo (pacote + classe)
 	 * No caso seria: com.gabriel.alura.java5.StringImutabilidade */

	public static void main(String[] args) {

		String nome = "  teste"; // por que � poss�vel fazer assim, sendo que String � uma classe?
		
		/*String nome2 = new String("teste");*/ /* teoricamente deveria ser assim, mas n�o precisa,
											     * porque String j� tem um tratamento especial que n�o obriga a fazer isso
											     * 
											     * Isso se chama Sintaxe object literal (sintaxe de int num = 1 por exemplo)
											     * � at� melhor usar object literal porque assim a JVM pode executar v�rias
											     * otimiza��es por baixo dos panos */
		
		
		/** IMUTABILIDADE: */
		
		nome.replace("tes", "Tes"); // este m�todo substitui uma sequencia de caracter pela outra dentro da string
		nome.toUpperCase(); // mudar tudo para letra mai�scula
		System.out.println("Nome: " + nome); // mas nenhum dos m�todos acima funciona
		
		/** Isso � imutabilidade, uma vez criada uma string, ela n�o pode ser alterada
		 *  Para contornar, � necess�rio criar uma nova string, e atribuir a ela o valor ap�s modificado: */
		
		String nomePrimeiraLetraMaiuscula = nome.replace("tes", "Tes");
		String nomeTudoMaiusculo = nome.toUpperCase();
		
		/* Eu poderia tamb�m fazer a pr�pria String nome parar de referenciar o que estava referenciando antes (" teste")
		 * e fazer ela refer�nciar nome.replace("tes", "Tes"); por exemplo:
		 * 
		 * nome = nome.replace("tes", "Tes"); */ 
		
		System.out.println("");
		System.out.println("Primeira letra mai�scula: " + nomePrimeiraLetraMaiuscula + 
				"    |    Todas mai�sculas: " + nomeTudoMaiusculo);
		
		// OUTROS M�TODOS DA CLASSE STRING:
		System.out.println("");
		System.out.println("Imprimindo caracter na posi��o 5: " + nomeTudoMaiusculo.charAt(4));
		System.out.println("");
		System.out.println("Imprimindo tudo a partir da posi��o 5: " + nome.substring(4));
		System.out.println("");
		System.out.println("Imprimindo tudo a partir da posi��o 5 at� 6: " + nome.substring(4,6)); /* O primeiro numero (a partir
		 									da onde quero pegar) conta desde o 0, por�m o segundo (at� onde) conta a partir de 1 */
		System.out.println("");
		System.out.println("Imprimindo tudo sem os espa�os do come�o: " + nome.trim());
		// tamb�m tem m�todos de cole��es: indexOf, length, isEmpty e contains

	}

}
