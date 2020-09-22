package com.gabriel.capacitacao.conceitosiniciais;

import java.util.Scanner;

public class TiposPrimitivos {
	
	/** 
	 * @author Gabriel Capovila
	 * 
	 * Classe para fazer testes b�sicos, aplicando conceitos que envolvem os tipos primitivos do Java
	 * al�m de conceitos de estruturas condicionais e estruturas de repeti��o
	 * 
	*/

	public static void main(String[] args) {
		
		// Declarando vari�veis de tipos primitivos
		char letra = 'A';
		int inteiro = 15;
		float flutuante = 12.95f;
		double real = 27.35;
		boolean logico = false;
		int numSorte = 0;
		
		System.out.println("Minha letra �: " + letra);
		
		// Estrutura de repeti��o for + estruturas condicionais if e operador tern�rio
		for(int i = 0; i <= inteiro; i++){		
			
			logico = i == inteiro ? true : false; // if (i == inteiro){ logico = true; } else { logico = false;}
			
			if (logico){
				System.out.println("Digite n�mero da sorte");
				Scanner teclado = new Scanner(System.in);
				numSorte = teclado.nextInt();
				System.out.println("Meu n�mero �: " + numSorte);
				
				letra = 'B';
			}
			
			System.out.println("Minha letra �: " + letra);
			
			logico = false;
		}
		
		System.out.println("------------------------");
		
		// Estrutura while + operadores l�gicos
		int j = 0;
		while (j <= inteiro){			
			flutuante += 0.05f;
			real += 0.05d;
			if ((flutuante > 13.7f) || (real > 28.0 && real < 28.1)){
				System.out.println("Flutuante = " + flutuante + "| Real = " + real);
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
