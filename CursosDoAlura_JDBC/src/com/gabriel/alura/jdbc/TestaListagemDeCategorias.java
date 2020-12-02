package com.gabriel.alura.jdbc;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.gabriel.alura.jdbc.dao.CategoriaDAO;
import com.gabriel.alura.jdbc.factory.ConnectionFactory;
import com.gabriel.alura.jdbc.modelo.Categoria;
import com.gabriel.alura.jdbc.modelo.Produto;

public class TestaListagemDeCategorias {

	public static void main(String[] args) throws SQLException {

		try(Connection connection = new ConnectionFactory().recuperarConexao()) {
			CategoriaDAO categoriaDAO = new CategoriaDAO(connection);	
			List<Categoria> listaDeCategorias = categoriaDAO.listarComProduto();
			
			for (Categoria categoriaAtual : listaDeCategorias) {
				
				System.out.println(categoriaAtual.getNome());
				for(Produto produto : categoriaAtual.getProdutos()) {
					System.out.println(categoriaAtual.getNome() + " - " + produto.getNome());
				}
				
			}
		}
	}
}
