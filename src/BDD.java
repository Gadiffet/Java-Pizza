import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BDD{

    public static void main(String[] args) {
            try {
                Class.forName("com.mysql.jdbc.Driver");  
            } catch (ClassNotFoundException e) {
                System.err.println("MySQL DataSource unable to load MySQL JDBC Driver");
            }
            String url = "jdbc:mysql://localhost/testdb";
            String user = "root";
            String password = "";
            
            try (Connection con = DriverManager.getConnection(url, user, password);
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("SELECT VERSION()")) {

                if (rs.next()) {
                    System.out.println(rs.getString(1));
                }

            } catch (SQLException ex) {
            
                Logger lgr = Logger.getLogger(BDD.class.getName());
                lgr.log(Level.SEVERE, ex.getMessage(), ex);
            }
    }
}