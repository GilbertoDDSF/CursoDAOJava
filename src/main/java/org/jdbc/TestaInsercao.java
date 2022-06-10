package org.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/*
 *
 * CODIGO PARA INPUTAR DADOS
 *
 * */
public class TestaInsercao {

    public static void main(String[] args) throws SQLException {

        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.recuperarConexao();

        Statement stm = connection.createStatement();
        stm.execute("USE loja INSERT INTO dbo.[CATEGORIA] (ID,NOME) VALUES('3' ,'MOVEIS')");

    }
}



