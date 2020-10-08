package com.gabriel.alura.java3.classeabstrata;

public class MainDoAbstrato {

	public static void main(String[] args) {
		
		GerenteDoAbstrato gerente = new GerenteDoAbstrato("Fulano", "568989898", "544878", 8000);
		
		// uma classe abstrata não se permite ser instaciada (não pode ter objeto do tipo funcionário)
		// FuncionarioAbstrata funcionario = new FuncionarioAbstrata("Cicrano", "568989898", "544878", 2000); // --> não pode
		
		System.out.println("Novo salário do gerente é: " + (gerente.aumentaSalario()));
		
	}

}
