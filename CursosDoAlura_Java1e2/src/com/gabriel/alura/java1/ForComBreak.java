package com.gabriel.alura.java1;

public class ForComBreak {

	public static void main(String[] args) {

		boolean igual = false;
		
		// for que imprime um triângulo (para isso, não imprime nada se a coluna atual maior que a linha atual)
		for (int linha = 0; linha < 10; linha++){
			for (int coluna = 0; coluna < 10; coluna++){
				
				// a variável coluna vai receber o resultado da comparação de maior (true ou false)
				igual = coluna > linha;		
				
				// if em uma única linha (não recomendado) | comando break sai do loop mais interno
				if (igual) break; 
				
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
