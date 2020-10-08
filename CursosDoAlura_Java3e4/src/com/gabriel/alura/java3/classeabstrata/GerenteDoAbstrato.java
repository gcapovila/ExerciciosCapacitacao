package com.gabriel.alura.java3.classeabstrata;

public class GerenteDoAbstrato extends FuncionarioAbstrata {

	public GerenteDoAbstrato(String nome, String cpf, String rg, double salario) {
		super(nome, cpf, rg, salario);
	}

	@Override // quando a classe-m�e � abstrata, � necess�rio sobrescrever os m�todos abstratos
	public double aumentaSalario() {
		this.setSalario(this.getSalario() + this.getSalario() * 0.2);
		return this.getSalario();
	}
	
}
