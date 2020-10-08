package com.gabriel.alura.java3.polimorfismo;

public class Controle {
	
	public double registra(Funcionario f){ /* este método vai receber um funcionário, mas pode também receber um gerente,
	 									    * pois um gerente é um funcionário */
		f.aumentaSalario();
		return f.getSalario();
		
	}

}
