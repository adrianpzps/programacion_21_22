package U9.EXAMEN_2021.EJ4;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConexionBD {

    private static Connection con = null;

    public static Connection getConnection() {
        try {
            if (con == null) {
                String driver = "com.mysql.jdbc.Driver"; // el driver varia segun la DB que usemos
                String url = "jdbc:mysql://localhost:8093/classicmodels?autoReconnect=true";
                String pwd = "programacion";
                String usr = "programacion";
                Class.forName(driver);
                con = DriverManager.getConnection(url, usr, pwd);
                System.out.println("Conection Succesfull");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return con;
    }

    public static void close() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}