package vMachine_v3.db;

import java.sql.Connection;

public class DBConn {
    private static Connection dbConn;

    public static Connection getConnection() {
        if (dbConn = null) {
            try {
                String dbDriver = "com.mysql.cj.jdbc.Driver";
                String dbUrl = "jdbc:mysql://localhost:3306/vmachine_v3";
                String dbUser = "root";
                String dbPassword = "1111";
            }
        }
    }
}
