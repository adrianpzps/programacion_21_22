package U9.ENTREGABLE_20_21;

import java.sql.*;
import java.util.Scanner;

public class Consultas {

    Connection con = ConexionBD.getConnection();

    Scanner teclado = new Scanner(System.in);

    public void FiltroPrecio() {

    System.out.println("Introduzca un precio: ");
    Integer precio = teclado.nextInt();

        try {
            String sql = "SELECT productName, buyPrice FROM `products` WHERE buyPrice > ?";
            PreparedStatement prepstatement = con.prepareStatement(sql);
            prepstatement.setQueryTimeout(30);

            prepstatement.setInt(1, precio);

            ResultSet rs = prepstatement.executeQuery();

            while (rs.next()) {

                rs.getString("productName");
                rs.getDouble("buyPrice");

                System.out.println(rs.getString("productName") + ", " + rs.getDouble("buyPrice"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
}

    public void InfoPagos() {

        System.out.println("Introduzca el número del cliente: ");
        Integer numemp = teclado.nextInt();

        try {
            String sql = "SELECT c.customerName, p.checkNumber, p.paymentDate, p.amount FROM customers c JOIN payments p ON c.customerNumber=p.customerNumber WHERE c.customerNumber = ?";
            PreparedStatement prepstatement = con.prepareStatement(sql);
            prepstatement.setQueryTimeout(30);

            prepstatement.setInt(1, numemp);

            ResultSet rs = prepstatement.executeQuery();

            while (rs.next()) {

                rs.getString("customerName");
                rs.getString("checkNumber");
                rs.getString("paymentDate");
                rs.getDouble("amount");

                System.out.println(rs.getString("customerName") + ", " + rs.getString("checkNumber") + ", " + rs.getString("paymentDate") + ", " + rs.getDouble("amount"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void informeCategoria() {

        System.out.println("Introduzca la categoria: ");
        String categoria = teclado.next();

        try {
            String sql = "SELECT p.productName, o.quantityOrdered, o.priceEach FROM products p JOIN orderdetails o ON p.productCode=o.productCode WHERE p.productLine = ?";
            PreparedStatement prepstatement = con.prepareStatement(sql);
            prepstatement.setQueryTimeout(30);

            prepstatement.setString(1, categoria);

            ResultSet rs = prepstatement.executeQuery();

            while (rs.next()) {

                rs.getString("productName");
                rs.getInt("quantityOrdered");
                rs.getDouble("priceEach");

                System.out.println(rs.getString("productName") + ", " + rs.getInt("quantityOrdered") + ", " + rs.getDouble("priceEach"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
