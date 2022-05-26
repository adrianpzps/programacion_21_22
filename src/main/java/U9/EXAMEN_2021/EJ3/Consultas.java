package U9.EXAMEN_2021.EJ3;

import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Consultas {

  private static List<Employee> listaEmpleados = new ArrayList<>();

  public static List<Employee> MostrarEmpleados() {

    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduzca el número de oficina: ");
    Integer nOficina = teclado.nextInt();

    try {
      Connection con = ConexionBD.getConnection();

      String sql = "SELECT * FROM employees WHERE officeCode = " + nOficina + "";

      PreparedStatement statement = con.prepareStatement(sql);

      statement.setQueryTimeout(30);

      ResultSet rs = statement.executeQuery();

      while (rs.next()) {

        Employee e =
            new Employee(
                rs.getInt("employeeNumber"),
                rs.getString("lastName"),
                rs.getString("firstName"),
                rs.getString("extension"),
                rs.getString("email"),
                rs.getInt("officeCode"),
                rs.getInt("reportsTo"),
                rs.getString("jobTitle"));

        listaEmpleados.add(e);
      }

    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
    return listaEmpleados;
  }

  public static void listaJson() {

    Gson gson = new Gson();

    String json_completo = gson.toJson(listaEmpleados);

    System.out.println(json_completo);
  }

}
