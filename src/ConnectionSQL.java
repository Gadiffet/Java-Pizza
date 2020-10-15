import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionSQL{

    public static List<Pizza> listePizza() {
        List<Pizza> listePizza = new ArrayList<>();
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                System.err.println("MySQL DataSource unable to load MySQL JDBC Driver");
            }
            
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/projet_pizza", "root", "");
                Statement st = con.createStatement();
                String query = "SELECT * FROM pizza";
                ResultSet result = st.executeQuery(query);
                while (result.next()) {
                    int id = result.getInt("id");
                    String namePizza = result.getString("nom");
                    double prixPizza = result.getDouble("prix");
                    Pizza pizza = new Pizza(id, namePizza, prixPizza);
                    listePizza.add(pizza);
                }
                con.close();
            } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(ConnectionSQL.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        return listePizza;
    }
}