package com.gabriel.alura.java2;

public class MainMesa {

	public static void main(String[] args) {

		Mesa minhaMesa = new Mesa();
		Mesa outraMesa = new Mesa();
		Montador montador1 = new Montador("José");
		
		minhaMesa.setMontador(new Montador("João"));
		System.out.println("Minha mesa está montada? " + minhaMesa.isMontada());
		System.out.println("Minha mesa montada por: " + minhaMesa.getMontador().getNome());
		System.out.println("Ele(a) já montou " + minhaMesa.getMontador().getQuantidadeDeMesasMontadas() + " mesas");
		
		System.out.println("");
		montador1.montarMesa(minhaMesa);
		System.out.println("Minha mesa está montada? " + minhaMesa.isMontada());
		
		if (!montador1.montarMesa(minhaMesa)){
			minhaMesa.setMontador(montador1);
		}
		
		System.out.println("");
		System.out.println("Minha mesa montada por: " + minhaMesa.getMontador().getNome());
		
		System.out.println("");
		minhaMesa.setQuantidadeDePes(1);
		System.out.println("Minha mesa tem: " + minhaMesa.getQuantidadeDePes() + " pés");		
		minhaMesa.setQuantidadeDePes(4);
		System.out.println("Minha mesa tem: " + minhaMesa.getQuantidadeDePes() + " pés");

		
		System.out.println("");
		System.out.println("Montador 1 já montou " + montador1.getQuantidadeDeMesasMontadas() + " mesas");
		montador1.montarMesa(outraMesa);
		System.out.println("Montador(a) da minha mesa já montou " +
				minhaMesa.getMontador().getQuantidadeDeMesasMontadas() + " mesas");
		
		Montador montador2 = new Montador("Mariana");
		System.out.println("");
		System.out.println("Total de montadores: " + Montador.getTotalDeMontadores()); /* na hora de chamar um método estático, 
		 															     usamos o nome da classe e não uma instãncia de objeto */
		
	}

}
