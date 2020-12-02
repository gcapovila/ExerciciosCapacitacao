package com.gabriel.alura.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.gabriel.alura.jdbc.factory.ConnectionFactory;

public class TestaInsercaoComParametro {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = new ConnectionFactory();
		try(Connection connection = factory.recuperarConexao()){ /* isso � um try with resorces, para n�o ter que sempre dar close
																  * na Connection */

			connection.setAutoCommit(false); /* este bloco evita que o m�todo "execute" da linha 42 fa�a um commit
			 								  * assim temos controle do que desejamos ou n�o commitar */

			try (PreparedStatement stm =  // isso � um try with resorces, para n�o ter que sempre dar close na PreparedStatement
					connection.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
					){ // prepareStatement � boa pr�tica, pois evita sql injection. mas temos que dizer o que s�o os ?, ver m�todo
				adicionarVariavel("SmartTV", "45 polegadas", stm);
				adicionarVariavel("Radio", "Radio de bateria", stm);

				connection.commit(); // se teve sucesso ele faz o commit manual
				
				// stm.close(); // n�o precisa se for try with resources (a classe PreparedStatement estende a AutoCloseable)
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("ROLLBACK EXECUTADO");
				connection.rollback(); // se teve erro ele faz o rollback manual
			}
		}
		
		// connection.close(); // n�o precisa se for try with resources (a classe Connection estende a AutoCloseable)
	}

	private static void adicionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
		stm.setString(1, nome); // aqui dizemos o que vai ser o primeiro ? do PreparedStatement
		stm.setString(2, descricao); // aqui dizemos o que vai ser o segundo ? do PreparedStatement

		if(nome.equals("Radio")) {
			throw new RuntimeException("N�o foi poss�vel adicionar o produto");
		}

		stm.execute();

		try(ResultSet rst = stm.getGeneratedKeys()){
			while(rst.next()) {
				Integer id = rst.getInt(1);
				System.out.println("O id criado foi: " + id);
			}
		}
		
		// rst.close(); // n�o precisa se for try with resources (a classe ResultSet estende a AutoCloseable)
	}
}


