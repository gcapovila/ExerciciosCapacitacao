package com.gabriel.capacitacao.orientacaoobjetos;

public class OoMain {

	public static void main(String[] args) {

		Peixe meuPeixe = new Peixe("dourado", "laranja", 2, true);
		
		System.out.println(meuPeixe.toString());
		System.out.println("-------------");
		
		meuPeixe.emitirSom();
		meuPeixe.interagir();
		meuPeixe.interagir(false);
		meuPeixe.interagir(true);
		meuPeixe.locomover();
		
		System.out.println("-------------");
		
		meuPeixe.setCor("azul");
		meuPeixe.setQuantidadeDeMembros(3);
		
		System.out.println("Peixe mudou: nova cor = " + meuPeixe.getCor() + 
				"| nova quantidade de membros = " + meuPeixe.getQuantidadeDeMembros());
		
		OvoDePeixe novoOvo = new OvoDePeixe("ovo", "transparente", 0, "circular");
		
		System.out.println("-------------");
		
		meuPeixe.botarOvo(novoOvo);
		
		System.out.println(novoOvo.toString());
		System.out.println(meuPeixe.toString());
		
		OvoDePeixe novoOvo2 = new OvoDePeixe("ovo", "bege", 0, "oval");
		
		System.out.println("-------------");
		
		meuPeixe.botarOvo(novoOvo2);
		
		System.out.println(novoOvo2.toString());
		System.out.println(meuPeixe.toString());
				
		System.out.println("-------------");		
		System.out.println("Ovo de peixe na posição 1: " + meuPeixe.getOvos().get(1));
		meuPeixe.getOvos().get(1).emitirSom();
		meuPeixe.getOvos().get(1).interagir();
		meuPeixe.getOvos().get(1).locomover();
		System.out.println("Formato: " + meuPeixe.getOvos().get(1).getFormato());
	}

}
