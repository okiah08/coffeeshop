
package com.mycompany.coffieeshop.DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InventoryDB {
    private static final String URL =
            "jdbc:mysql://localhost:3307/productinventory";

    private static final String USER = "root";
    private static final String PASSWORD = "kia13@08";

    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(
                URL, USER, PASSWORD
        );
    }
}
