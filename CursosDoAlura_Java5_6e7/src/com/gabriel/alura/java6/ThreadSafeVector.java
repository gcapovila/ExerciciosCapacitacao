package com.gabriel.alura.java6;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ThreadSafeVector {

	public static void main(String[] args) {

		/**
		 * UM VECTOR pode ser executado paralelamente em duas (ou mais) pilhas de execu��o; dois (+) mains (isso � thread safe)
		 * 
		 * Quando temos esse tipo de situa��o, e desejamos que as execu��es sejam feitas em paralelo, em cima de uma mesma lista,
		 * utilizamos o java.util.Vector. Este tipo de opera��o s� funciona dessa forma, o ArrayList e o LinkedList n�o servem
		 * 
		 * Mais Vector deve ser usado em �ltimo e extremo caso, pois a utiliza��o dele tem alto custo em desempenho
		 * Assim, se n�o for estritamente necess�rio, � melhor utilizar ArrayList, que � mais eficiente 
		 * 
		 */
		
		// Mesmo c�digo da classe Equals, apenas mudando de ArrayList para LinkedList:
		
				List<Conta> lista = new Vector<Conta>(); // Vector tamb�m implementa a interface List

		        Conta cc = new Conta(22, 11, "Marcos");
		        lista.add(cc);

		        Conta cc2 = new Conta(22, 22, "J�lia");
		        lista.add(cc2);

		        Conta cc3 = new Conta(22, 22, "Alex");
		        Conta cc4 = cc2;
		        
		        System.out.println("J� existe CC2? " + lista.contains(cc2));
		        System.out.println("J� existe CC3? " + lista.contains(cc3));
		        System.out.println("J� existe CC4? " + lista.contains(cc4));

	}

}
