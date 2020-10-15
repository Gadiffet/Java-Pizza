import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertSQL {
    public static void InsertCommande(int idCommande, int idPizza, int quantitePizza){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL DataSource unable to load MySQL JDBC Driver");
        }
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/projet_pizza", "root", "");
            Statement st = con.createStatement();
            String query = "SELECT id_commande, id_pizza FROM commande WHERE id_commande="+idCommande+" AND id_pizza="+idPizza;
            ResultSet result = st.executeQuery(query);
            if(result.next()){
                String query2 = "UPDATE commande SET quantite_pizza=quantite_pizza+1 WHERE id_commande="+idCommande+" AND id_pizza="+idPizza;
                st.executeUpdate(query2);
            }
            else {
                String query3 = "INSERT INTO commande(id_commande, id_pizza, quantite_pizza) VALUES ("+idCommande+", "+idPizza+", "+quantitePizza+")";
                st.executeUpdate(query3);
            }
            con.close();
        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(ConnectionSQL.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }
}
