package com.gabriel.alura.java3.polimorfismo;

public class Main {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("Fulano", "568989898", "544878", 10000);
		Funcionario funcionario = new Funcionario("Cicrano", "568989898", "544878", 2000);
		Controle controle = new Controle();
		
		System.out.println("Novo sal�rio do gerente �: " + controle.registra(gerente));
		/* ao fazer controle.registra(gerente) estamos passando para a classe controle um objeto gerente
		 * o m�todo registra da classe controle recebe um funcion�rio e chama o m�todo aumentaSal�rio correspondente
		 * por�m, como ao inv�s de receber um funcion�rio propriamente dito, o controle recebeu um gerente (que � um funcion�rio)
		 * o m�todo registra chama o aumentaSalario da classe gerente e n�o da classe funcion�rio (mesmo que a assinatura do 
		 * m�todo registra esteja esperando um funcion�rio) - sempre chama o m�todo da classe mais espec�fica (classe "filha")
		 * 
		 * ISSO � POLIMORFISMO!!! POIS UM GERENTE � AO MESMO TEMPO UM GERENTE E UM FUNICON�RIO 
		 * POLIMORFISMO: � a capacidade de um objeto ser referenciado por v�rios tipos*/
		
		System.out.println("Novo sal�rio do funcion�rio �: " + controle.registra(funcionario));
		// aqui, j� chamou o m�todo aumentaSalario da classe funcionario, pois foi passado um funcionario propriamente dito
		
		Funcionario supervisor = new Gerente("Alexandra", "568989898", "544878", 5000);
		// polimorfismo permite inclusive fazer isso: funcionario = new gerente
		
		System.out.println("Novo sal�rio da supervisora �: " + controle.registra(supervisor));
		
	}

}
