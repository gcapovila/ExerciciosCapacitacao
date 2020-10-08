package com.gabriel.alura.java3.polimorfismo;

public class Gerente extends Funcionario {

	public Gerente(String nome, String cpf, String rg) {
		super(nome, cpf, rg); /* uma coisa que não acontece no poliforfismo é manter o construtor 
		 					   * mesmo que gerente seja um funcionário, ainda precisa existir um construtor para o gerente 
		 					   * no caso, fiz o construtor do gerente chamar o construtor da sua classe mãe (funcionário)
		 					   * passando para ele os parâmetros recebidos */
	}
	
	public Gerente(String nome, String cpf, String rg, double salario) {
		super(nome, cpf, rg, salario);
	}
	
	public void aumentaSalario(){
		System.out.println("");
		System.out.println("Aumentando salário de um gerente");
		this.setSalario(this.getSalario() + this.getSalario() * 0.2);
	}

}
