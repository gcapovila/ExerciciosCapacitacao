package com.gabriel.capacitacao.conceitosiniciais;

import java.util.Scanner;

public class VariaveisComClassesInvolucro {
	
	/** 
	 * @author Gabriel Capovila
	 * 
	 * Classe para fazer testes b�sicos, aplicando conceitos que envolvem as classes inv�lucro do Java
	 * al�m de conceitos de estruturas condicionais e estruturas de repeti��o
	 * 
	 * O c�digo � o mesmo da classe de tipos primitivos, apenas alterando para classes inv�lucro e fazendo as
	 * altera��es de sintaxe necess�rias
	 * 
	*/

	public static void main(String[] args) {
		
		// Declarando vari�veis de tipos primitivos
		Character letra = new Character('A');
		Integer inteiro = new Integer(15);
		Float flutuante = new Float(12.95f);
		Double real = new Double(27.35);
		Boolean logico = new Boolean(false);
		String textoSorte = new String();
		
		System.out.println("Minha letra �: " + letra.charValue());
		
		// Estrutura de repeti��o for + estruturas condicionais if e operador tern�rio
		for(int i = 0; i <= inteiro.intValue(); i++){		
			
			Integer intParaComparar = (Integer) i;
			logico = inteiro.equals(intParaComparar) ? true : false;
			
			if (logico){
				System.out.println("Digite o texto da sorte");
				Scanner teclado = new Scanner(System.in);
				textoSorte = teclado.next();
				System.out.println("Texto da sorte digitado: " + textoSorte);
				
				letra = 'B';
			}
			
			System.out.println("Minha letra �: " + letra);
			
			logico = false;
		}
		
		System.out.println("------------------------");
		
		// Estrutura while + operadores l�gicos
		int j = 0;
		while (j <= inteiro.intValue()){			
			flutuante += 0.05f;
			real += 0.05d;
			if ((flutuante.floatValue() > 13.7f) || (real.doubleValue() > 28.0 && real.doubleValue() < 28.1)){
				System.out.println("Flutuante = " + flutuante.toString() + "| Real = " + real.toString());
			}
			j++;
		}
		
		System.out.println("------------------------");
		
		// Estrutura do while + estrutura condicional switch
		do{
			switch(inteiro){
			case 14:
				System.out.println("Entrou no switch quando o inteiro � 14");
				break;
			case 10:
				System.out.println("Entrou no switch quando o inteiro � 10");
				break;
			case 7:
				System.out.println("Entrou no switch quando o inteiro � 7");
				break;
			default:
				System.out.println("Inteiro = " + inteiro);
			}
			
			inteiro --;
			
		} while (inteiro > 0);

	}

}
