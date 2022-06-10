package org.jdbc;

import java.sql.*;


public class TestaInsercaoComParametro {

    public static void main(String[] args) throws SQLException {

        ConnectionFactory connectionFactory = new ConnectionFactory();
        try (Connection connection = connectionFactory.recuperarConexao()) {

            connection.setAutoCommit(false);

                try (PreparedStatement stm = connection.prepareStatement("USE SUCOS_VENDAS INSERT INTO dbo.[TABELA DE CLIENTES] (CPF ,NOME) VALUES(? , ?)",
                    Statement.RETURN_GENERATED_KEYS)) {

                AdicionarVariavel("1111111115", "Jonas", stm);

                connection.commit();
            } catch (Exception e) {
                connection.close();
                e.printStackTrace();
                System.out.println("ROLLBACK EXECUTADO");
                connection.rollback();
            }
        }
    }

    private static void AdicionarVariavel(String cpf, String nome, PreparedStatement stm) throws SQLException {
        stm.setString(1, cpf);
        stm.setString(2, nome);
        stm.execute();


        ResultSet rst = stm.getGeneratedKeys();
        while (rst.next()) {
            int id = rst.getInt(1);

            System.out.println("Os dados criados foram: " + id);


        }

    }
}









