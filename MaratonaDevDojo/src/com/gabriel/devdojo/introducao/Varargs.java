package com.gabriel.devdojo.introducao;

import java.util.ArrayList;

public class Varargs {
	
	public static void main(String[] args) {
		
		somaArray(10,20,5,5,15);
		
	}
	
	private static void somaArray (int... numeros){ // sintaxe: primero o tipo, depois ... e depois o nome do array local
		/* equivale a somaArray (int[] numeros) -- a diferen�a � que com essa sintaxe int[], o m�todo s� recebe um int[]
		 * por�m, com varargs, o m�todo pode receber um {1,2,3,4,5} direto, sem precisar criar um int[] */
		int soma = 0;
		for(int numero : numeros){
			soma += numero;
		}
		System.out.println("Soma = " + soma);
	}
	
}
