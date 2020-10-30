package com.gabriel.devdojo.conceitos.enumeracao;

public class MainCliente {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Juliano", Cliente.PESSOA_FISICA); // passando a constante como valor --> ver classe Cliente
		
		// dessa forma, a pessoa pode passar qualquer valor... não necessariamente 1 ou 2... mas deveria ser um dos dois
		Cliente cliente2 = new Cliente("Juliana", 10); // funciona normalmente, embora não devesse permitir o valor 10
		
		System.out.println(cliente1);
		System.out.println(cliente2);
		
		System.out.println("----------------------------");
		
		// a classe TipoCliente (na verdade é uma enumeração - botão direito -> new -> enum) contorna esse problema
		ClienteComEnum clienteComEnum1 = new ClienteComEnum("Marcos", TipoCliente.PESSOA_FISICA, /* não aceita nada que seja
		 												diferente de: TipoCliente.PESSOA_FISICA ou TipoCliente.PESSOA_JURIDICA */
				
				ClienteComEnum.TipoPagamento.APRAZO); /* Se o Enum foi declarado como método e não classe, é necesário chamá-lo
				 									   * através da classe onde ele está (no caso, ClienteComEnum.) */
		
		System.out.println(clienteComEnum1);

	}

}
