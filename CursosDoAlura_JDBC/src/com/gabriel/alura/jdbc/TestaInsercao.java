package com.gabriel.alura.jdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.gabriel.alura.jdbc.factory.ConnectionFactory;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperarConexao();

		Statement stm = connection.createStatement(); // MÁ PRÁTICA! PERMITE SQL INJECTION... O CERTO ver TestaInsercaoComParametro
		stm.execute("INSERT INTO PRODUTO (nome, descricao) VALUES ('Mouse', 'Mouse sem fio')"
				, Statement.RETURN_GENERATED_KEYS); // return generated keys retorna os ids gerados pela query

		ResultSet rst = stm.getGeneratedKeys(); // pegando somente o id que a query gerou, diferente do getResultSet
		while(rst.next()) {
			Integer id = Integer.valueOf(rst.getInt(1));
			System.out.println("O id criado foi: " + id);
		}
		rst.close();
		stm.close();
		connection.close();
	}
}
