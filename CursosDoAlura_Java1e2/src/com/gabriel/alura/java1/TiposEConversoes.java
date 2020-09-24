package com.gabriel.alura.java1;

public class TiposEConversoes {

	public static void main(String[] args) {

		double resultado, salario = 1270.50;
		
		resultado = 5 / 2; // double pode receber numero inteiro (mas int não pode receber double)
		System.out.println(resultado); // embora resultado seja double, 5 e 2 são inteiros, então a resposta sairá 2 inteiro
		
		resultado = 5.0 / 2; // colocar um ".0" para corrigir
		System.out.println(resultado);
		
		int teste = (int) salario; // int não pode receber double, necessário fazer cast
		System.out.println(teste);
		
		resultado = 0.1 + 0.2; // problema do double é a soma
		System.out.println(resultado);

	}

}
