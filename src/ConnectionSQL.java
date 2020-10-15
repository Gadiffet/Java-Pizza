import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionSQL{

    public static List<Pizza> ListePizza() {
        List<Pizza> listePizza = new ArrayList<Pizza>();
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
                    Pizza pizzaTab = new Pizza(id, namePizza, prixPizza);
                    listePizza.add(pizzaTab);
                }
                con.close();
            } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(ConnectionSQL.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
        return listePizza;
    }

    public static List<Commande> RecapCommande(int id_commande){
        List<Commande> listeCommande = new ArrayList<Commande>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL DataSource unable to load MySQL JDBC Driver");
        }
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/projet_pizza", "root", "");
            Statement st = con.createStatement();
            String query = "SELECT id_commande, id_pizza, quantite_pizza, p.nom FROM commande c LEFT JOIN pizza p ON c.id_pizza = p.id WHERE id_commande = " + id_commande;
            ResultSet result = st.executeQuery(query);
            while (result.next()) {
                int idCommande = result.getInt("id_commande");
                int idPizza = result.getInt("id_pizza");
                int quantitePizza = result.getInt("quantite_pizza");
                String nomPizza = result.getString("nom");
                Commande commandeTab = new Commande(idCommande, idPizza, quantitePizza, nomPizza);
                listeCommande.add(commandeTab);
            }
            con.close();
        }catch (SQLException ex) {
            Logger lgr = Logger.getLogger(ConnectionSQL.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return listeCommande;
    }

    public static int RecupIdCommande(){
        int idCommande = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL DataSource unable to load MySQL JDBC Driver");
        }
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/projet_pizza", "root", "");
            Statement st = con.createStatement();
            String query = "SELECT MAX(id_commande) as id FROM commande";
            ResultSet result = st.executeQuery(query);
            if (result.next()){
                idCommande = result.getInt("id")+1;
            }
            else{
                idCommande = 1;
            }
            con.close();
        }catch (SQLException ex) {
            Logger lgr = Logger.getLogger(ConnectionSQL.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
        return idCommande;
    }
}