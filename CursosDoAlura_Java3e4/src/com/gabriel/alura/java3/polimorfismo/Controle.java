package com.gabriel.alura.java3.polimorfismo;

public class Controle {
	
	public double registra(Funcionario f){ /* este m�todo vai receber um funcion�rio, mas pode tamb�m receber um gerente,
	 									    * pois um gerente � um funcion�rio */
		f.aumentaSalario();
		return f.getSalario();
		
	}

}
