package com.gabriel.alura.java3.polimorfismo;

public class Main {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("Fulano", "568989898", "544878", 10000);
		Funcionario funcionario = new Funcionario("Cicrano", "568989898", "544878", 2000);
		Controle controle = new Controle();
		
		System.out.println("Novo salário do gerente é: " + controle.registra(gerente));
		/* ao fazer controle.registra(gerente) estamos passando para a classe controle um objeto gerente
		 * o método registra da classe controle recebe um funcionário e chama o método aumentaSalário correspondente
		 * porém, como ao invés de receber um funcionário propriamente dito, o controle recebeu um gerente (que é um funcionário)
		 * o método registra chama o aumentaSalario da classe gerente e não da classe funcionário (mesmo que a assinatura do 
		 * método registra esteja esperando um funcionário) - sempre chama o método da classe mais específica (classe "filha")
		 * 
		 * ISSO É POLIMORFISMO!!! POIS UM GERENTE É AO MESMO TEMPO UM GERENTE E UM FUNICONÁRIO 
		 * POLIMORFISMO: É a capacidade de um objeto ser referenciado por vários tipos*/
		
		System.out.println("Novo salário do funcionário é: " + controle.registra(funcionario));
		// aqui, já chamou o método aumentaSalario da classe funcionario, pois foi passado um funcionario propriamente dito
		
		Funcionario supervisor = new Gerente("Alexandra", "568989898", "544878", 5000);
		// polimorfismo permite inclusive fazer isso: funcionario = new gerente
		
		System.out.println("Novo salário da supervisora é: " + controle.registra(supervisor));
		
	}

}
