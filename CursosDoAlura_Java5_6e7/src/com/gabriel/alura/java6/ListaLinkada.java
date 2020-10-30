package com.gabriel.alura.java6;

import java.util.LinkedList;

public class ListaLinkada {

	public static void main(String[] args) {
		
		/**
		 * VANTAGENS DO ARRAYLIST: acesso fácil a qualquer elemento aleatório
		 * Se adicionamos elementos em um array, e queremos acessar qualquer posição, através do índice do elemento
		 * é possível encontrá-lo facilmente
		 * 
		 * Além disso, adicionar novos elementos em um array é um processo simples, desde que não seja ultrapassada sua
		 * capacidade de armazenamento. Se desejarmos adicionar um novo elemento, o ArrayList sabe automaticamente qual a próxima
		 * posição livre, e ele é inserido. Iteração também é algo tranquilo de se fazer em um array
		 * 
		 * 
		 * DESVANTAGENS: sua capacidade é limitada ao seu tamanho no momento da criação, ou seja, uma vez que sua capacidade acaba,
		 * é necessária a criação de um novo array, com capacidade maior, e copiar os elementos daquele para este armazenamento
		 * 
		 * Ainda, se quisermos remover um elemento, o array não permitirá que existam "buracos" em sua lista e, sendo assim,
		 * deslocará todas as posições de todos os outros elementos para cobrir esse "buraco"
		 * 
		 * -----------------------------------------------------------------------
		 * 
		 * UM LINKEDLIST (lista encadeada) associa cada elemento adicionado a seus "vizinhos". Cada vez que um elemento é
		 * adicionado, ele se lembrará do elemento que foi adicionado anteriormente. Da mesma forma, o primeiro elemento se lembra
		 * daquele que o segue e assim sucessivamente. Sabemos que estamos no final da lista quando atingimos um elemento
		 * que não possui um próximo
		 * 
		 * Neste tipo de lista, apagar um elemento não causa grande impacto à ela como um todo, pois ela descarta o elemento mas
		 * mantém a conexão que este elemento possuía com o seguinte e o anterior, apenas "dizendo" para eles que o elemento
		 * que estava no meio deles não existe mais, e que agora eles estão conectados diretamente
		 * 
		 * DESVANTAGEM: Diferentemente do array, não temos como acessar uma determinada posição diretamente
		 * Se quisermos, por exemplo, acessar a posição 3, temos que iniciar na primeira e seguir, até atingirmos a desejada
		 * 
		 */
		
		// Mesmo código da classe Equals, apenas mudando de ArrayList para LinkedList:
		
		LinkedList<Conta> lista = new LinkedList<Conta>(); /* tanto ArrayList como LinkedList implementam a interface List
		 													* do pacote java.util */

        Conta cc = new Conta(22, 11, "José");
        lista.add(cc);

        Conta cc2 = new Conta(22, 22, "Marcos");
        lista.add(cc2);

        Conta cc3 = new Conta(22, 22, "Alex");
        Conta cc4 = cc2;
        
        System.out.println("Já existe CC2? " + lista.contains(cc2));
        System.out.println("Já existe CC3? " + lista.contains(cc3));
        System.out.println("Já existe CC4? " + lista.contains(cc4));
	}

}
