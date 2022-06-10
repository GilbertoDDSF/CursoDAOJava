package org.jdbc;

import java.sql.*;

/*
*
* CODIGO PARA VERIFICAR SELECT
*
* */

public class TestaListagem {
    public static void main(String[] args) throws SQLException {

        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection= connectionFactory.recuperarConexao();

        PreparedStatement stm = connection.prepareStatement("USE SUCOS_VENDAS SELECT NOME , CPF FROM [TABELA DE CLIENTES]");
        stm.execute();

        ResultSet rst = stm.getResultSet();

        while (rst.next()){
            String nome =rst.getString("NOME");
            String cpf = rst.getString("CPF");
            System.out.println(nome + " | " + "CPF " + cpf);
        }
        connection.close();
    }
}
