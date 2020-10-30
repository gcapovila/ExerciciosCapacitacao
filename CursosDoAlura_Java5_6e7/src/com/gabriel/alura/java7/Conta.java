package com.gabriel.alura.java7;

public class Conta {
	
	private int agencia;
	private int numero;
	private String titular;

	public Conta(int agencia, int numero, String titular) {
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}	

	/* quando implementado, faz uma compara��o ocorrer atributo por atributo, e n�o o objeto em si
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj; // est� fazendo cast de um tipo mais gen�rico (Object) para um mais espec�fico (Conta)
		if (agencia != other.agencia)
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}*/

	@Override
	public String toString() {
		return "Conta: ag�ncia " + agencia + ", n�mero " + numero + ", titular: " + titular;
	}	

}
