package org.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class TestaRemocao {

    public static void main(String[] args) throws SQLException {

        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.recuperarConexao();

        //CRIA UMA QUERY
        PreparedStatement stm = connection.prepareStatement("USE SUCOS_VENDAS DELETE FROM [TABELA DE CLIENTES] WHERE (CPF) = ?");
        stm.setString(1,"0987954299");
        stm.execute();

       int linhasModificadas = stm.getUpdateCount();
        System.out.println("Quantidade de linhas modificadas = " + linhasModificadas);
    }
}
