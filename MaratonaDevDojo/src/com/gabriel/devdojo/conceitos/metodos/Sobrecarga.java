package com.gabriel.devdojo.conceitos.metodos;

public class Sobrecarga {
	
	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario("Gabriel", "4444444", "4444444"); /* testando o construtor 1 da classe 
	 										       									  * Funcionario */
		
		Funcionario funcionario2 = new Funcionario("Mateus", "5689898", "7875454", 2200); /* testando construtor 2 da mesma classe
	 																	Este construtor 2 é uma sobrecarga no construtor 1*/
		
		System.out.println("Funcionário 1: " + funcionario1.getNome() + " | Funcionário 2: " + funcionario2.getNome());
	
	}

}
