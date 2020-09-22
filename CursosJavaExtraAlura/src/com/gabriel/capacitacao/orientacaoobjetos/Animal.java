package com.gabriel.capacitacao.orientacaoobjetos;

public abstract class Animal {
	
	private String classificacao = new String();
	private String cor = new String();
	private Integer quantidadeDeMembros = 0;
	
	public Animal(String classificacao, String cor, Integer quantidadeDeMembros) {
		super();
		this.classificacao = classificacao;
		this.cor = cor;
		this.quantidadeDeMembros = quantidadeDeMembros;
	}
	
	// abstração
	public abstract void locomover();
	public abstract void emitirSom();
	public abstract void interagir();
	
	// encapsulamento
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Integer getQuantidadeDeMembros() {
		return quantidadeDeMembros;
	}
	public void setQuantidadeDeMembros(Integer quantidadeDeMembros) {
		this.quantidadeDeMembros = quantidadeDeMembros;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classificacao == null) ? 0 : classificacao.hashCode());
		result = prime * result + ((cor == null) ? 0 : cor.hashCode());
		result = prime * result + ((quantidadeDeMembros == null) ? 0 : quantidadeDeMembros.hashCode());
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
		Animal other = (Animal) obj;
		if (classificacao == null) {
			if (other.classificacao != null)
				return false;
		} else if (!classificacao.equals(other.classificacao))
			return false;
		if (cor == null) {
			if (other.cor != null)
				return false;
		} else if (!cor.equals(other.cor))
			return false;
		if (quantidadeDeMembros == null) {
			if (other.quantidadeDeMembros != null)
				return false;
		} else if (!quantidadeDeMembros.equals(other.quantidadeDeMembros))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Animal [classificacao=" + classificacao + ", cor=" + cor + ", quantidadeDeMembros="
				+ quantidadeDeMembros + "]";
	}	
}
