package com.gabriel.alura.java1;

public class TiposEConversoes {

	public static void main(String[] args) {

		double resultado, salario = 1270.50;
		
		resultado = 5 / 2; // double pode receber numero inteiro (mas int n�o pode receber double)
		System.out.println(resultado); // embora resultado seja double, 5 e 2 s�o inteiros, ent�o a resposta sair� 2 inteiro
		
		resultado = 5.0 / 2; // colocar um ".0" para corrigir
		System.out.println(resultado);
		
		int teste = (int) salario; // int n�o pode receber double, necess�rio fazer cast
		System.out.println(teste);
		
		resultado = 0.1 + 0.2; // problema do double � a soma
		System.out.println(resultado);

	}

}
