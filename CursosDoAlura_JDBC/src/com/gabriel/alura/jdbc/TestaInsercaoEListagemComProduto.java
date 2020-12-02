package com.gabriel.alura.jdbc;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.gabriel.alura.jdbc.dao.ProdutoDAO;
import com.gabriel.alura.jdbc.factory.ConnectionFactory;
import com.gabriel.alura.jdbc.modelo.Produto;

public class TestaInsercaoEListagemComProduto {

	public static void main(String[] args) throws SQLException {

		Produto comoda = new Produto("Cômoda", "Cômoda Vertical");

		try(Connection connection = new ConnectionFactory().recuperarConexao()) {
			
			ProdutoDAO produtoDao = new ProdutoDAO(connection);
			produtoDao.salvar(comoda);
			
			List<Produto> listaDeProdutos = produtoDao.listar();
			
			for (Produto produtoAtual : listaDeProdutos) {
				System.out.println(produtoAtual);
			}
		}
	}
}
