package com.gabriel.capacitacao.orientacaoobjetos;

import java.util.ArrayList;

public class Peixe extends Animal {
	
	private Boolean peixeDeAguaSalgada;
	private ArrayList<OvoDePeixe> ovosDoPeixe = new ArrayList<OvoDePeixe>();
	
	// herança e abstração
	public Peixe(String classificacao, String cor, Integer quantidadeDeMembros, Boolean peixeDeAguaSalgada) {
		super(classificacao, cor, quantidadeDeMembros);
		this.peixeDeAguaSalgada = peixeDeAguaSalgada;
	}

	// sobrecarga (sobrescrita de método)
	@Override
	public void locomover() {
		System.out.println("Nadando");		
	}

	@Override
	public void emitirSom() {
		System.out.println("Glub");
	}

	@Override
	public void interagir() {
		System.out.println("Pulando");
	}
	
	@Override
	public String toString() {
		return "Peixe: [Peixe de água salgada = " + peixeDeAguaSalgada + "| Quantidade de ovos = " + ovosDoPeixe.size()
				+ "| Classificação = " + getClassificacao() + "| Cor = " + getCor()
				+ "| Quantidade de membros = " + getQuantidadeDeMembros() + "]";
	}

	// sobrecarga
	public void interagir(Boolean comida){
		if (comida){
			System.out.println("Comendo");
		} else {
			System.out.println("Com fome");
		}
	}

	// encapsulamento
	public Boolean getPeixeDeAguaSalgada() {
		return peixeDeAguaSalgada;
	}

	public void setPeixeDeAguaSalgada(Boolean peixeDeAguaSalgada) {
		this.peixeDeAguaSalgada = peixeDeAguaSalgada;
	}

	public ArrayList<OvoDePeixe> getOvos() {
		return ovosDoPeixe;
	}

	// relacionamento entre classes
	public void botarOvo(OvoDePeixe novoOvo){
		this.ovosDoPeixe.add(novoOvo);
	}
	
}
