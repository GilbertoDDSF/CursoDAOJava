package org.jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {

    public DataSource dataSource;

    public ConnectionFactory() {

        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setJdbcUrl("jdbc:sqlserver://localhost:1433;databaseName=loja;user=sa;password=GFgg*1216");
        comboPooledDataSource.setUser("sa");
        comboPooledDataSource.setPassword("GFgg*1216");

        comboPooledDataSource.setMaxPoolSize(15);

        this.dataSource = comboPooledDataSource;

    }

    public Connection recuperarConexao() throws SQLException {
        return this.dataSource.getConnection();
    }
}

