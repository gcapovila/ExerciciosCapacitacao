package com.gabriel.alura.java3.classeabstrata;

public class GerenteDoAbstrato extends FuncionarioAbstrata {

	public GerenteDoAbstrato(String nome, String cpf, String rg, double salario) {
		super(nome, cpf, rg, salario);
	}

	@Override // quando a classe-mãe é abstrata, é necessário sobrescrever os métodos abstratos
	public double aumentaSalario() {
		this.setSalario(this.getSalario() + this.getSalario() * 0.2);
		return this.getSalario();
	}
	
}
