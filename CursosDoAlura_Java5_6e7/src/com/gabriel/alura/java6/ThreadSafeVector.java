package com.gabriel.alura.java6;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ThreadSafeVector {

	public static void main(String[] args) {

		/**
		 * UM VECTOR pode ser executado paralelamente em duas (ou mais) pilhas de execução; dois (+) mains (isso é thread safe)
		 * 
		 * Quando temos esse tipo de situação, e desejamos que as execuções sejam feitas em paralelo, em cima de uma mesma lista,
		 * utilizamos o java.util.Vector. Este tipo de operação só funciona dessa forma, o ArrayList e o LinkedList não servem
		 * 
		 * Mais Vector deve ser usado em último e extremo caso, pois a utilização dele tem alto custo em desempenho
		 * Assim, se não for estritamente necessário, é melhor utilizar ArrayList, que é mais eficiente 
		 * 
		 */
		
		// Mesmo código da classe Equals, apenas mudando de ArrayList para LinkedList:
		
				List<Conta> lista = new Vector<Conta>(); // Vector também implementa a interface List

		        Conta cc = new Conta(22, 11, "Marcos");
		        lista.add(cc);

		        Conta cc2 = new Conta(22, 22, "Júlia");
		        lista.add(cc2);

		        Conta cc3 = new Conta(22, 22, "Alex");
		        Conta cc4 = cc2;
		        
		        System.out.println("Já existe CC2? " + lista.contains(cc2));
		        System.out.println("Já existe CC3? " + lista.contains(cc3));
		        System.out.println("Já existe CC4? " + lista.contains(cc4));

	}

}
