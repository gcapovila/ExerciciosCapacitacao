package com.gabriel.alura.java2;

public class Montador {
	
	private String nome;
	private int quantidadeDeMesasMontadas = 0;
	private static int totalDeMontadores = 0;  /* static significa atributo da classe Montador, não de cada objeto montador
										ou seja, para não vai ter um total para cada novo montador, mas sim um total da classe*/
	
	public Montador(String nome) {
		super();
		this.nome = nome;
		totalDeMontadores++;
	}
	
	public boolean montarMesa(Mesa mesa){
		if (!mesa.isMontada()){
			this.setQuantidadeDeMesasMontadas(getQuantidadeDeMesasMontadas() + 1);
			mesa.setMontada(true);
			return true;
		}
		return false;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidadeDeMesasMontadas() {
		return quantidadeDeMesasMontadas;
	}
	public void setQuantidadeDeMesasMontadas(int quantidadeDeMesasMontadas) {
		this.quantidadeDeMesasMontadas = quantidadeDeMesasMontadas;
	}
	public static void setTotalDeMontadores(int totalDeMontadores) {
		Montador.totalDeMontadores = totalDeMontadores; /* quando um método é estático, não pode tem this. dentro dele
		 												 * em vez disso, usamos NomeDaClasse. no lugar*/
	}
	public static int getTotalDeMontadores() {
		return totalDeMontadores;
	}	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + quantidadeDeMesasMontadas;
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
		Montador other = (Montador) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (quantidadeDeMesasMontadas != other.quantidadeDeMesasMontadas)
			return false;
		return true;
	}	

}
