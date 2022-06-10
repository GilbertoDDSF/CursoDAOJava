package org.jdbc.modelo;

import org.jdbc.ConnectionFactory;
import org.jdbc.dao.ProdutoDAO;

import java.sql.*;
import java.util.List;

public class TestaInsercaoElistagemComProduto {

    public static void main(String[] args) throws SQLException {

        Produto comoda = new Produto("Comoda", "Comoda Vertical");

        try (Connection connection = new ConnectionFactory().recuperarConexao()) {

            ProdutoDAO produtoDAO = new ProdutoDAO(connection);

            produtoDAO.salvar(comoda);

            List<Produto> listaDeProdutos = produtoDAO.listar();
            listaDeProdutos.forEach(System.out::println);
        }
    }
}



