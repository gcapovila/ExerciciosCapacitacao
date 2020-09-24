package com.gabriel.alura.java2;

public class ReferenciaDeObjetos {
	
	public static void main(String[] args) {
		
		Mesa mesa1 = new Mesa();
		mesa1.setLargura(2.8);
		
		Mesa mesa2 = mesa1; // mesa1 e mesa2 são duas referências para o mesmo objeto, NÃO são 2 objetos diferentes
		System.out.println(mesa2.getLargura()); // por isso a largura é a mesma
		
		mesa2.setComprimento(5.3);
		System.out.println(mesa1.getComprimento()); // e se mexer na 2, afeta tbm a 1
		
		System.out.println("");
		System.out.println(mesa1 + " | " + mesa2); // mostrando q é o mesmo id de objeto
		System.out.println(mesa1 == mesa2);
		
		Mesa mesa3 = new Mesa(); // agora sim é outro objeto
		mesa3.setLargura(2.8);		
		mesa3.setComprimento(5.3);
		
		System.out.println("");
		System.out.println(mesa1 + " | " + mesa3); // mesmo que o valor dos atributos seja o mesmo, ainda são objetos diferentes
		System.out.println(mesa1 == mesa3);
		
		System.out.println("");
		System.out.println(mesa1.equals(mesa3)); /* aqui compara o valor, atributo por atributo, 
											aí retorna que é igual (se o equals estiver implementado na classe Mesa) */
		
	}

}
