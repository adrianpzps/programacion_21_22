package U9.ENTREGABLE_20_21;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {

    Connection con = ConexionBD.getConnection();

    public void nuevoempleadoyclientes() {

        try {

            String sql =
                    "INSERT INTO `employees` (`employeeNumber`,`lastName`,`firstName`,`extension`,`email`,`officeCode`,`reportsTo`,`jobTitle`)\n"
                            + "VALUES (?,?,?,?,?,?,?,?);";
            PreparedStatement prepstatement = con.prepareStatement(sql);
            prepstatement.setQueryTimeout(30);

            prepstatement.setInt(1, 2);
            prepstatement.setString(2, "pepe");
            prepstatement.setString(3, "asd");
            prepstatement.setString(4, "asd");
            prepstatement.setString(5, "000000000");
            prepstatement.setString(6, "1");
            prepstatement.setInt(7, 1002);
            prepstatement.setString(8, "asd");

            prepstatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        try {

            String sql =
                    "INSERT INTO `customers` (`customerNumber`,`customerName`,`contactLastName`,`contactFirstName`,`phone`,`addressLine1`,`postalCode`,`city`,`state`,`addressLine2`,`country`,`salesRepEmployeeNumber`,`creditLimit`)\n"
                            + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement prepstatement = con.prepareStatement(sql);
            prepstatement.setQueryTimeout(30);

            prepstatement.setInt(1, 3);
            prepstatement.setString(2, "asdf");
            prepstatement.setString(3, "asdf");
            prepstatement.setString(4, "asdf");
            prepstatement.setString(5, "asdf");
            prepstatement.setString(6, "asdf");
            prepstatement.setString(7, "asdf");
            prepstatement.setString(8, "asdf");
            prepstatement.setString(9, "asdf");
            prepstatement.setString(10, "asdf");
            prepstatement.setString(11, "asdf");
            prepstatement.setInt(12, 2);
            prepstatement.setDouble(13, 99.9);

            prepstatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        try {

            String sql =
                    "INSERT INTO `customers` (`customerNumber`,`customerName`,`contactLastName`,`contactFirstName`,`phone`,`addressLine1`,`postalCode`,`city`,`state`,`addressLine2`,`country`,`salesRepEmployeeNumber`,`creditLimit`)\n"
                            + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement prepstatement = con.prepareStatement(sql);
            prepstatement.setQueryTimeout(30);

            prepstatement.setInt(1, 4);
            prepstatement.setString(2, "asdf");
            prepstatement.setString(3, "asdf");
            prepstatement.setString(4, "asdf");
            prepstatement.setString(5, "asdf");
            prepstatement.setString(6, "asdf");
            prepstatement.setString(7, "asdf");
            prepstatement.setString(8, "asdf");
            prepstatement.setString(9, "asdf");
            prepstatement.setString(10, "asdf");
            prepstatement.setString(11, "asdf");
            prepstatement.setInt(12, 2);
            prepstatement.setDouble(13, 99.9);

            prepstatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void inserofiytrasl() {

        try {

            String sql =
                    "INSERT INTO `offices` (`officeCode`,`city`,`phone`,`addressLine1`,`addressLine2`,`state`,`country`,`postalCode`,`territory`)\n"
                            + "VALUES (?,?,?,?,?,?,?,?,?);";
            PreparedStatement prepstatement = con.prepareStatement(sql);
            prepstatement.setQueryTimeout(30);

            prepstatement.setString(1, "8");
            prepstatement.setString(2, "Tokio");
            prepstatement.setString(3, "asd");
            prepstatement.setString(4, "asd");
            prepstatement.setString(5, "asd");
            prepstatement.setString(6, "asd");
            prepstatement.setString(7, "asd");
            prepstatement.setString(8, "asd");
            prepstatement.setString(9, "asd");

            prepstatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        try {

            String sql = "UPDATE employees SET officeCode = ? WHERE officeCode = ?";
            PreparedStatement prepstatement = con.prepareStatement(sql);
            prepstatement.setQueryTimeout(30);

            prepstatement.setString(1, "8");
            prepstatement.setString(2, "5");

            prepstatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }


}
