package com.gabriel.alura.java3.classeabstrata;

public class MainDoAbstrato {

	public static void main(String[] args) {
		
		GerenteDoAbstrato gerente = new GerenteDoAbstrato("Fulano", "568989898", "544878", 8000);
		
		// uma classe abstrata n�o se permite ser instaciada (n�o pode ter objeto do tipo funcion�rio)
		// FuncionarioAbstrata funcionario = new FuncionarioAbstrata("Cicrano", "568989898", "544878", 2000); // --> n�o pode
		
		System.out.println("Novo sal�rio do gerente �: " + (gerente.aumentaSalario()));
		
	}

}
