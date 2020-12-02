package com.gabriel.alura.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.gabriel.alura.jdbc.factory.ConnectionFactory;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();

		PreparedStatement stm = connection.prepareStatement("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
		stm.execute();
		ResultSet rst = stm.getResultSet(); // result set retorna a lista de resultados da query (com todos os campos da tabela)
		while(rst.next()) {
			Integer id = Integer.valueOf(rst.getInt("ID"));
			String nome = rst.getString("NOME");
			String descricao = rst.getString("DESCRICAO");
			System.out.println(id);
			System.out.println(nome);
			System.out.println(descricao);
		}
		rst.close();
		stm.close();
		connection.close();
	}
}
