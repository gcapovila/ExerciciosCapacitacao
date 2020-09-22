package com.gabriel.capacitacao.estruturadados;

public class VetorListaObject {
	
	/**
	 * Esta classe � exatamente igual � VetorOuLista, mas ao inv�s de ser um
	 * vetor de String, � um vetor de Object, generalizando o tipo
	 * (pode ser um vetor de qualquer tipo de objeto - inclusive de uma classe)
	 * 
	 * Implementa��o n�o recomendada, pois permite que um vetor aceite mais de 
	 * um tipo diferente de dados, o que vai contra a regra do que � um vetor
	 * 
	 * Para resolver:
	 * https://www.youtube.com/watch?v=9CEnlGWAyFU&list=PLGxZ4Rq3BOBrgumpzz-l8kFMw2DLERdxi&index=11
	 * 
	 * Ou ent�o, usar Arraylist :)
	 */
	
	private Object[] elementos;
	private int tamanho;

	public VetorListaObject(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}
	
	public boolean adiciona (Object elemento){
		
		this.aumentaCapacidade();
		
		if (this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++; // assim que adicionar um elemento, o tamanho aumenta
			// tamanho sempre ser� posicao + 1 (ao inv�s de 0,1,2; vai ser 1,2,3)
			return true;
		}
		return false;
	}
	
	public boolean adiciona (int posicao, Object elemento){
		
		this.aumentaCapacidade();
		
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posi��o inv�lida");
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
			Object[] elementosNovos = new String[this.elementos.length * 2];
			for (int i=0; i < this.elementos.length; i++){
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public Object busca(int posicao){
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		return this.elementos[posicao];
	}
	
	public String busca(Object elemento){
		for (int i=0; i < this.tamanho; i++){
			if (this.elementos[i].equals(elemento)){
				return "Elemento encontrado na posi��o " + i;
			}
		}
		return "Elemento n�o encontrado";
	}
	
	public void remove(int posicao){
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posi��o inv�lida");
		}
		for (int i=posicao; i < this.tamanho-1; i++){
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}
	
	public void remove(Object elemento){
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
		for (int i=0; i < this.tamanho - 1; i++){ // percorrendo at� a pen�ltima posi��o (tamanho - 2)
			// apenas para coloca a v�rgula antes da �ltima posi��o
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if (this.tamanho > 0){ // tamanho - 1 = �ltima posi��o
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]"); // apenas para ficar bonitinho
		
		return s.toString();
	}

}
