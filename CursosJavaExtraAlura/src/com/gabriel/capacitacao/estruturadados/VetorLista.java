package com.gabriel.capacitacao.estruturadados;

/**
 * 
 * @author Gabriel Capovila
 * Classe que reproduz todos os métodos existentes na classe ArrayList, com o objetivo de entender como funciona um vetor
 * 
 */

public class VetorLista {
	
	private String[] elementos;
	private int tamanho;

	public VetorLista(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
//	public void adiciona (String elemento){
//		for (int i=0; i < this.elementos.length; i++){
//			if (this.elementos[i] == null){
//				this.elementos[i] = elemento;
//				break; // sai do loop
//			}
//		}
//	}
	
//	public void adiciona (String elemento) throws Exception{
//		if (this.tamanho < this.elementos.length){
//			this.elementos[this.tamanho] = elemento;
//			this.tamanho++;
//		} else {
//			throw new Exception("Vetor já está cheio");
//		}
//	}
	
	public boolean adiciona (String elemento){
		
		this.aumentaCapacidade();
		
		if (this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++; // assim que adicionar um elemento, o tamanho aumenta
			// tamanho sempre será posicao + 1 (ao invés de 0,1,2; vai ser 1,2,3)
			return true;
		}
		return false;
	}
	
	public boolean adiciona (int posicao, String elemento){
		
		this.aumentaCapacidade();
		
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posição inválida");
		}
		
		// mover os elementos (dar um shift no vetor)
		for (int i=this.tamanho-1; i >= posicao; i--){
			this.elementos[i+1] = this.elementos[i];
		}
		
		this.elementos[posicao] = elemento;
		this.tamanho ++;
		
		return true;
	}
	
	private void aumentaCapacidade(){
		if (this.tamanho == this.elementos.length){
			String[] elementosNovos = new String[this.elementos.length * 2];
			for (int i=0; i < this.elementos.length; i++){
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public String busca(int posicao){
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];
	}
	
	public String busca(String elemento){
		for (int i=0; i < this.tamanho; i++){
			if (this.elementos[i].equals(elemento)){
				return "Elemento encontrado na posição " + i;
			}
		}
		return "Elemento não encontrado";
	}
	
	public void remove(int posicao){
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i=posicao; i < this.tamanho-1; i++){
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}
	
	public void remove(String elemento){
		for (int i=0; i < this.tamanho; i++){
			if (this.elementos[i].equals(elemento)){
				for (int j=i; j < this.tamanho-1; j++){
					this.elementos[j] = this.elementos[j+1];
				}
				this.tamanho--;
			}
		}
	}
	
	public int tamanho(){
		return this.tamanho;
	}

	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder(); 	
		
		// montando o toString
		s.append("[");	// apenas para ficar bonitinho	
		for (int i=0; i < this.tamanho - 1; i++){ // percorrendo até a penúltima posição (tamanho - 2)
			// apenas para coloca a vírgula antes da última posição
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if (this.tamanho > 0){ // tamanho - 1 = última posição
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]"); // apenas para ficar bonitinho
		
		return s.toString();
	}
	
}
