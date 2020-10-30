package com.gabriel.alura.java6;

import java.util.LinkedList;

public class ListaLinkada {

	public static void main(String[] args) {
		
		/**
		 * VANTAGENS DO ARRAYLIST: acesso f�cil a qualquer elemento aleat�rio
		 * Se adicionamos elementos em um array, e queremos acessar qualquer posi��o, atrav�s do �ndice do elemento
		 * � poss�vel encontr�-lo facilmente
		 * 
		 * Al�m disso, adicionar novos elementos em um array � um processo simples, desde que n�o seja ultrapassada sua
		 * capacidade de armazenamento. Se desejarmos adicionar um novo elemento, o ArrayList sabe automaticamente qual a pr�xima
		 * posi��o livre, e ele � inserido. Itera��o tamb�m � algo tranquilo de se fazer em um array
		 * 
		 * 
		 * DESVANTAGENS: sua capacidade � limitada ao seu tamanho no momento da cria��o, ou seja, uma vez que sua capacidade acaba,
		 * � necess�ria a cria��o de um novo array, com capacidade maior, e copiar os elementos daquele para este armazenamento
		 * 
		 * Ainda, se quisermos remover um elemento, o array n�o permitir� que existam "buracos" em sua lista e, sendo assim,
		 * deslocar� todas as posi��es de todos os outros elementos para cobrir esse "buraco"
		 * 
		 * -----------------------------------------------------------------------
		 * 
		 * UM LINKEDLIST (lista encadeada) associa cada elemento adicionado a seus "vizinhos". Cada vez que um elemento �
		 * adicionado, ele se lembrar� do elemento que foi adicionado anteriormente. Da mesma forma, o primeiro elemento se lembra
		 * daquele que o segue e assim sucessivamente. Sabemos que estamos no final da lista quando atingimos um elemento
		 * que n�o possui um pr�ximo
		 * 
		 * Neste tipo de lista, apagar um elemento n�o causa grande impacto � ela como um todo, pois ela descarta o elemento mas
		 * mant�m a conex�o que este elemento possu�a com o seguinte e o anterior, apenas "dizendo" para eles que o elemento
		 * que estava no meio deles n�o existe mais, e que agora eles est�o conectados diretamente
		 * 
		 * DESVANTAGEM: Diferentemente do array, n�o temos como acessar uma determinada posi��o diretamente
		 * Se quisermos, por exemplo, acessar a posi��o 3, temos que iniciar na primeira e seguir, at� atingirmos a desejada
		 * 
		 */
		
		// Mesmo c�digo da classe Equals, apenas mudando de ArrayList para LinkedList:
		
		LinkedList<Conta> lista = new LinkedList<Conta>(); /* tanto ArrayList como LinkedList implementam a interface List
		 													* do pacote java.util */

        Conta cc = new Conta(22, 11, "Jos�");
        lista.add(cc);

        Conta cc2 = new Conta(22, 22, "Marcos");
        lista.add(cc2);

        Conta cc3 = new Conta(22, 22, "Alex");
        Conta cc4 = cc2;
        
        System.out.println("J� existe CC2? " + lista.contains(cc2));
        System.out.println("J� existe CC3? " + lista.contains(cc3));
        System.out.println("J� existe CC4? " + lista.contains(cc4));
	}

}
