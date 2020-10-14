package com.gabriel.alura.java2;

public class MainMesa {

	public static void main(String[] args) {

		Mesa minhaMesa = new Mesa();
		Mesa outraMesa = new Mesa();
		Montador montador1 = new Montador("Jos�");
		
		minhaMesa.setMontador(new Montador("Jo�o"));
		System.out.println("Minha mesa est� montada? " + minhaMesa.isMontada());
		System.out.println("Minha mesa montada por: " + minhaMesa.getMontador().getNome());
		System.out.println("Ele(a) j� montou " + minhaMesa.getMontador().getQuantidadeDeMesasMontadas() + " mesas");
		
		System.out.println("");
		montador1.montarMesa(minhaMesa);
		System.out.println("Minha mesa est� montada? " + minhaMesa.isMontada());
		
		if (!montador1.montarMesa(minhaMesa)){
			minhaMesa.setMontador(montador1);
		}
		
		System.out.println("");
		System.out.println("Minha mesa montada por: " + minhaMesa.getMontador().getNome());
		
		System.out.println("");
		minhaMesa.setQuantidadeDePes(1);
		System.out.println("Minha mesa tem: " + minhaMesa.getQuantidadeDePes() + " p�s");		
		minhaMesa.setQuantidadeDePes(4);
		System.out.println("Minha mesa tem: " + minhaMesa.getQuantidadeDePes() + " p�s");

		
		System.out.println("");
		System.out.println("Montador 1 j� montou " + montador1.getQuantidadeDeMesasMontadas() + " mesas");
		montador1.montarMesa(outraMesa);
		System.out.println("Montador(a) da minha mesa j� montou " +
				minhaMesa.getMontador().getQuantidadeDeMesasMontadas() + " mesas");
		
		Montador montador2 = new Montador("Mariana");
		System.out.println("");
		System.out.println("Total de montadores: " + Montador.getTotalDeMontadores()); /* na hora de chamar um m�todo est�tico, 
		 															     usamos o nome da classe e n�o uma inst�ncia de objeto */
		
	}

}
