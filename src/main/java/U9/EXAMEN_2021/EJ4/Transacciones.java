package U9.EXAMEN_2021.EJ4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {

    // insertarLineaProducto() que inserte los datos de una línea de producto nueva (productLine)
    // y al menos dos productos asociados (products) a dicha línea de productos nueva.

    public static void insertarLineaProducto() {

        Connection con = ConexionBD.getConnection();

        try {
            con.setAutoCommit(false);

            String sql = "INSERT INTO productlines VALUES (?, ?, ?, ?)";
            PreparedStatement prepstatement = con.prepareStatement(sql);

            prepstatement.setString(1, "Sacapuntas");
            prepstatement.setString(2, "asd");
            prepstatement.setString(3, null);
            prepstatement.setString(4, null);

            prepstatement.executeUpdate();

            sql = "INSERT INTO products VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            prepstatement = con.prepareStatement(sql);

            prepstatement.setString(1, "S99_9999");
            prepstatement.setString(2, "asdf");
            prepstatement.setString(3, "Sacapuntas");
            prepstatement.setString(4, "asd");
            prepstatement.setString(5, "asd");
            prepstatement.setString(6, "asd");
            prepstatement.setInt(7, 1);
            prepstatement.setDouble(8, 2);
            prepstatement.setDouble(9, 3);

            prepstatement.executeUpdate();

            sql = "INSERT INTO products VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            prepstatement = con.prepareStatement(sql);

            prepstatement.setString(1, "S99_9998");
            prepstatement.setString(2, "asdf");
            prepstatement.setString(3, "Sacapuntas");
            prepstatement.setString(4, "asd");
            prepstatement.setString(5, "asd");
            prepstatement.setString(6, "asd");
            prepstatement.setInt(7, 1);
            prepstatement.setDouble(8, 2);
            prepstatement.setDouble(9, 3);

            prepstatement.executeUpdate();

            con.commit();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            try {
                if (con != null) {
                    System.out.println("ERROR de insercción. Se realiza rollback");
                    con.rollback();
                }
            } catch (SQLException throwables) {
                System.out.println("Error en rollback");
                throwables.printStackTrace();
            }
        }

    }

}
