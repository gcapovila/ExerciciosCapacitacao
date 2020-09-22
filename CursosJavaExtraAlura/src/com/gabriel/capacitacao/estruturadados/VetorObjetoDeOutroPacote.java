package com.gabriel.capacitacao.estruturadados;
import java.util.ArrayList;

import com.gabriel.capacitacao.orientacaoobjetos.*;

public class VetorObjetoDeOutroPacote {
	
	/**
	 * Método que vai testar o uso de objetos de outro pacote ao criar um ArrayList
	 */
	public static void main(String[] args) {
		
		ArrayList<Peixe> peixes = new ArrayList<Peixe>();
	
		Peixe peixe1 = new Peixe("tubarao", "branco", 3, true);
		Peixe peixe2 = new Peixe("beta", "marrom", 2, false);
		Peixe peixe3 = new Peixe("baiacu", "marrom", 2, true);
		
		peixes.add(peixe1);
		peixes.add(peixe2);
		peixes.add(new Peixe("arraia", "branca", 0, true));
		
		exibeClassificacoes(peixes);
		
		// adiciona novo peixe na posição 1 do vetor e empurra os demais elementos para frente
		peixes.add(1, new Peixe("outros", "amarelo", 2, true));
		
		exibeClassificacoes(peixes);
		
		System.out.println();
		System.out.println();
		System.out.println(peixes.size());
		System.out.println();
		System.out.println(peixes.get(2).getClassificacao()); // mostra o peixe que está na posição 2
		System.out.println(peixes.contains(peixe1)); // retorna true se achar o peixe 1 no vetor
		System.out.println(peixes.contains(peixe3));
		System.out.println(peixes.indexOf(peixe2)); // retorna a posição do objeto no vetor, se existir (senão, retorna -1)
		System.out.println(peixes.indexOf(peixe3));
		
		peixes.add(peixe3); // estado atual do vetor: tubarao, outros, beta, arraia, baiacu
		
		peixes.remove(3); // removeu a arraia		
		exibeClassificacoes(peixes);
		
		peixes.remove(peixe3); // removeu o baiacu		
		exibeClassificacoes(peixes);
		
		peixes.clear(); //removeu tudo
		exibeClassificacoes(peixes);
		
	}
	
	private static void exibeClassificacoes(ArrayList<Peixe> peixes){
		// pula linha
		System.out.println();
		System.out.print("| ");
		
		// for each para imprimir somente a classificação de cada peixe
		for (Peixe i: peixes){
			System.out.print(i.getClassificacao() + " | ");
		}
	}
	
}
