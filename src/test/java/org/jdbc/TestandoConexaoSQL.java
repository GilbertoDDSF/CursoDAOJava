package org.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestandoConexaoSQL {

    @Test
    public void deveConectarAoBancoDeDados() throws SQLException {

        Connection con = DriverManager.
                getConnection("jdbc:sqlserver://localhost:1433;databaseName=Teste;user=sa;password=GFgg*1216");
        con.close();
        System.out.println("Conexao encerrada!");
    }
}
