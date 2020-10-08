package com.gabriel.alura.java3.polimorfismo;

public class Funcionario {
	
	private String nome;
	private double salario;
	private String cpf;
	private String rg;
	private String escolaridade;
	
	// construtor 1
	public Funcionario(String nome, String cpf, String rg) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	// construtor 2 --> ISSO QUE É SOBRECARGA, QUANDO TEMOS O MESMO MÉTODO MAS COM ASSINATURAS (nome + parâmetros) DIFERENTES
	public Funcionario(String nome, String cpf, String rg, double salario) {
		this(nome,cpf,rg); /* esta é uma forma de aproveitar o construtor 1, sem precisar copiar
		 					* o código dele (só funciona dentro de outro construtor */ 
		
		this.salario = salario; // e essa linha é o que diferencia o primeiro construtor do segundo
		
		// this(nome,cpf,rg); // aqui n pode, pq dentro de um construtor, a chamada a outro construtor DEVE ser a primeira linha
	}
	
	public void aumentaSalario(){
		System.out.println("");
		System.out.println("Aumentando salário de um funcionário");
		this.salario += (this.salario * 0.1);
	}
	
	// getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	
	// toString
	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + ", cpf=" + cpf + ", rg=" + rg + ", escolaridade="
				+ escolaridade + "]";
	}
	
	// equals e hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((escolaridade == null) ? 0 : escolaridade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (escolaridade == null) {
			if (other.escolaridade != null)
				return false;
		} else if (!escolaridade.equals(other.escolaridade))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(other.salario))
			return false;
		return true;
	}
}
