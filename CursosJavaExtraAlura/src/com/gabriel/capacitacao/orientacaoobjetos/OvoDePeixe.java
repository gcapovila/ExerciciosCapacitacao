package com.gabriel.capacitacao.orientacaoobjetos;

public class OvoDePeixe extends Animal{
	
	private String formato;
	
	public OvoDePeixe(String classificacao, String cor, Integer quantidadeDeMembros, String formato) {
		super(classificacao, cor, quantidadeDeMembros);
		this.formato = formato;
	}

	@Override
	public void locomover() {
		System.out.println("N�o se mexe");
	}

	@Override
	public void emitirSom() {
		System.out.println("N�o tem som");
	}

	@Override
	public void interagir() {
		System.out.println("N�o interage");
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}
}
