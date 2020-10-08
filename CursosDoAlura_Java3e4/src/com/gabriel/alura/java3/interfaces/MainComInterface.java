package com.gabriel.alura.java3.interfaces;

public class MainComInterface {

	public static void main(String[] args) {
		
		GerenteComInterface gerente1 = new GerenteComInterface("Alessandra", "125689", "544878", 8000);
		
		// perfeitamente poss�vel instanciar um objeto de uma interface (n�o classe); polimorfismo funciona pra interface
		Autenticavel gerente2 = new GerenteComInterface("Fulano", "568989898", "544878", 8000); // gerente � um autenticavel
		
		Pessoa cliente1 = new Cliente(); // cliente � uma pessoa, mas n�o � autentic�vel!!!!!!!!!
		Cliente cliente2 = new Cliente();
		
		gerente1.setSenha(5689);
		gerente2.setSenha(7888);
		// cliente1.setSenha(5455); // cliente1 n�o � autenticavel, s� � pessoa
		cliente2.setSenha(5455);
		
		System.out.println("------------------");
		gerente1.caminhar(); // gerente1 pode caminha porque implementa pessoa
		// gerente2.caminhar(); m�todo caminhar n�o existe aqui pq cliente2 � autenticavel mas n�o � pessoa (rsrs) 
		cliente1.caminhar();
		cliente2.caminhar();
		
		System.out.println("------------------");
		gerente1.autentica(1234); //false
		gerente1.autentica(5689); //true
		gerente2.autentica(7888); //true
		gerente2.autentica(5689); //false
		cliente2.autentica(9999); //false
		cliente2.autentica(5455); //true
		
	}

}
