package com.gabriel.capacitacao.estruturadados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {
	
	/** 
	 * @author Gabriel Capovila
	 * Classe para testar todos os conceitos do curso de estrutura de dados
	 * 
	 */

	public static void main(String[] args) {
		
		//testarVetorOuLista();
		//testarPilha();
		//testarFila();
		//testarFilaComPrioridade();
		testarVetorUsandoArraylist();
		
	}

	/**
	 *  Método que usa a classe ArayList da biblioteca java.util para testar os conceitos de vetor e lista
	 */
	private static void testarVetorUsandoArraylist() {
		ArrayList<String> vetor = new ArrayList<String>(4);
		
		vetor.add("teste 1");
		vetor.add("teste 2");
		vetor.add("teste 3");
		vetor.add("teste 4");
		vetor.add("teste 5");
		
		System.out.println(vetor.size());
		
		System.out.println(vetor.toString());
		
		System.out.println(vetor.get(1));
		System.out.println(vetor.contains("teste 3"));
		
		vetor.add(2, "teste A");
		System.out.println(vetor.toString());
		vetor.add(4, "teste B");
		System.out.println(vetor.toString());
		
		vetor.remove(2);
		System.out.println(vetor.toString());
		vetor.remove("teste B");
		System.out.println(vetor.toString());		
	}

	/**
	 *  Método que usa, para testar os conceitos de vetor e lista, a classe VetorOuListaObject, criada neste pacote
	 */
	public static void testarVetorOuLista(){
		
		VetorListaObject vetor = new VetorListaObject(4);
		
		vetor.adiciona("teste 1");
		vetor.adiciona("teste 2");
		vetor.adiciona("teste 3");
		vetor.adiciona("teste 4");
		vetor.adiciona("teste 5");
		
		System.out.println(vetor.tamanho());
		
		System.out.println(vetor.toString());
		
		System.out.println(vetor.busca(1));
		System.out.println(vetor.busca("teste 3"));
		
		vetor.adiciona(2, "teste A");
		System.out.println(vetor.toString());
		vetor.adiciona(4, "teste B");
		System.out.println(vetor.toString());
		
		vetor.remove(2);
		System.out.println(vetor.toString());
		vetor.remove("teste B");
		System.out.println(vetor.toString());
	}
	
	/**
	 *  Método que usa a classe Stack da biblioteca java.util para testar os conceitos de pilha
	 */
	public static void testarPilha(){
		
		Stack<Integer> pilha = new Stack<Integer>();
		
		System.out.println(pilha.isEmpty());
		
		pilha.push(5); // adiciona elemento no final da pilha
		pilha.push(3);
		pilha.push(8);
		pilha.push(12);
		
		System.out.println(pilha.size());
		System.out.println(pilha.isEmpty());
		System.out.println(pilha);
		
		System.out.println(pilha.peek()); // "espiar" qual é o elemento que está no topo da pilha
		
		System.out.println(pilha.pop()); // remove último elemento; retorna elemento removido
		System.out.println(pilha);
		System.out.println(pilha.peek());
	}
	
	/**
	 *  Método que usa a classe LinkedList da biblioteca java.util para testar os conceitos de fila
	 */
	public static void testarFila(){
		
		// Queue é uma interface!!!
		// ISSO NÃO FUNCIONA: Queue<Integer> fila = new Queue<Integer>();
		
		Queue<Integer> fila = new LinkedList<Integer>(); // a classe LinkedList implementa a interface Queue
		
		System.out.println(fila.isEmpty());
		
		fila.add(12); // enqueue
		fila.add(28);
		fila.add(16);
		fila.add(5);
		
		System.out.println(fila.size());
		System.out.println(fila.isEmpty());
		System.out.println(fila);
		
		System.out.println(fila.peek()); // o peek da fila "espia" o primeiro elemento (não o último)
		
		System.out.println(fila.remove()); // dequeue - remove o primeiro elemento (FIFO)
		System.out.println(fila);
		System.out.println(fila.peek());
	}
	
	/**
	 *  Método que usa a classe PriorityQueue da biblioteca java.util para testar os conceitos de fila com prioridade
	 */
	public static void testarFilaComPrioridade(){
	
		// fila com prioridade é uma fila ordenada
		
		/* se, ao invés de Integer, fosse uma fila de objetos de uma classe e
		 * essa classe tivesse implementado o método comapreTo (ver aula)
		 * https://www.youtube.com/watch?v=KNhC4Bo2rIw&list=PLGxZ4Rq3BOBrgumpzz-l8kFMw2DLERdxi&index=39
		 * 
		 * ele ordenaria conforme um atributo inteiro dessa classe que tenha 
		 * sido usado no compareTo
		 */
		
		// ver também aula https://www.youtube.com/watch?v=tAnXS9YyHAU&list=PLGxZ4Rq3BOBrgumpzz-l8kFMw2DLERdxi&index=40
		
		Queue<Integer> filaComPrioridade = new PriorityQueue<Integer>();
		
		filaComPrioridade.add(12);
		filaComPrioridade.add(28);
		filaComPrioridade.add(16);
		filaComPrioridade.add(5);
		
		System.out.println(filaComPrioridade);

	}
}
