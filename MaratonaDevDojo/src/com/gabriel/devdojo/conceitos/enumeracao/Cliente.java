package com.gabriel.devdojo.conceitos.enumeracao;

public class Cliente {
	
	private String nome;
	public static final int PESSOA_FISICA = 1;
	public static final int PESSOA_JURIDICA = 2;
	private int tipo;
	
	public Cliente(String nome, int tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		String nomeTipo;
		
		if (this.tipo == 1){
			nomeTipo = "Pessoa física";
		} else { // dessa forma, a pessoa pode passar qualquer valor... não necessariamente 1 ou 2... mas deveria ser um dos dois
			nomeTipo = "Pessoa jurídica";
		}
		
		return "Cliente --> Nome: " + nome + ", Tipo: " + nomeTipo;
	}
	
	

}
