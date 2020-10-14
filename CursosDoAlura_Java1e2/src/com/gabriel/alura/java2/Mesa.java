package com.gabriel.alura.java2;

public class Mesa {
	
	private double largura;
	private double comprimento;
	private int quantidadeDePes;
	private boolean montada = false;
	private Montador montador;
	
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public int getQuantidadeDePes() {
		return this.quantidadeDePes;
	}
	
	public void setQuantidadeDePes(int quantidadeDePes) {
		if (quantidadeDePes < 2){
			System.out.println("Quantidade de pés inválida");
			return; // para sair do método sem ler o resto (equivalente ao break quando tem um loop; o return sai do método)
		}
		this.quantidadeDePes = quantidadeDePes;
	}
	
	public Montador getMontador() {
		return this.montador;
	}
	public void setMontador(Montador montador) {
		this.montador = montador;
	}
	public boolean isMontada() {
		return this.montada;
	}
	public void setMontada(boolean montada) {
		this.montada = montada;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(comprimento);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(largura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (montada ? 1231 : 1237);
		result = prime * result + ((montador == null) ? 0 : montador.hashCode());
		result = prime * result + quantidadeDePes;
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
		Mesa other = (Mesa) obj;
		if (Double.doubleToLongBits(comprimento) != Double.doubleToLongBits(other.comprimento))
			return false;
		if (Double.doubleToLongBits(largura) != Double.doubleToLongBits(other.largura))
			return false;
		if (montada != other.montada)
			return false;
		if (montador == null) {
			if (other.montador != null)
				return false;
		} else if (!montador.equals(other.montador))
			return false;
		if (quantidadeDePes != other.quantidadeDePes)
			return false;
		return true;
	}
	
	
}
