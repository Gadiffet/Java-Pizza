// Ce traitement utilise les sous-classes suivantes :
// - Menus          -> L'ensemble des menus de l'application
// - Boisson        -> La définition de la classe

import java.text.DecimalFormat;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // DECLARATIONS DES CONSTANTES ET VARIABLES
        String shutdown = "0"; // Constante pour l'arrêt du système
        String userOpt;        // Choix utilisateur (MainMenu)
        int idCommande;

        // TRAITEMENT PRINCIPAL
        do {
            // Affichage du menu principal
            userOpt = Menus.MainMenu();

            // Aiguillage du traitement
            switch (userOpt) {
                // Fonctionnalité de gestion du stock du distributeur
                case "1":
                    idCommande = ConnectionSQL.RecupIdCommande();
                    MenuPizza(idCommande);
                    break;
                // Fonctionnalité de gestion du stock du distributeur
                case "2":
                    Menus.RecapCommande();
                    break;
                // Fonctionnalité d'arrêt du système
                case "0":
                    break;
                // Gestion de tous les autres cas
                default:
                    break;
            }
            // Gestion de l'arrêt du système (si nécessaire)
        } while (!userOpt.equals(shutdown));
    }

    static int[] MenuPizza(int idCommande) {
        String exitFunction = "0";  // Constante pour le retour au menu principal
        String userOpt;             // Choix utilisateur (GestionStockDistributeurMenu)
        int PizzaCalzone = 0;
        int WattiPizza = 0;
        int PizzaSauceSpecialeDuChef = 0;
        DecimalFormat df = new DecimalFormat("0.00");

        do {
            // Affichage du menu pour la fonctionnalité "1. Gérer le stock"
            userOpt = Menus.MenuPizza(ConnectionSQL.ListePizza());
            
            // Aiguillage du traitement
            switch (userOpt) {
                case "1":
                    PizzaCalzone = PizzaCalzone + 1;
                    System.out.println("*---------------------------------*");
                    System.out.println("*  Pizza ajoutée dans le panier   *");
                    System.out.println("*---------------------------------*");
                    InsertSQL.InsertCommande(idCommande, 1, 1);
                    break;
                case "2":
                    WattiPizza = WattiPizza + 1;
                    System.out.println("*---------------------------------*");
                    System.out.println("*  Pizza ajoutée dans le panier   *");
                    System.out.println("*---------------------------------*");
                    InsertSQL.InsertCommande(idCommande, 2, 1);
                    break;
                case "3":
                    PizzaSauceSpecialeDuChef = PizzaSauceSpecialeDuChef + 1;
                    System.out.println("*---------------------------------*");
                    System.out.println("*  Pizza ajoutée dans le panier   *");
                    System.out.println("*---------------------------------*");
                    InsertSQL.InsertCommande(idCommande, 3, 1);
                    break;
                case "8":
                    List<Commande> listeCommande = ConnectionSQL.RecapCommande(idCommande);
                    System.out.println("* Numéro de commande : " + idCommande + " *");
                    listeCommande.forEach(x -> {
                        System.out.println("* " + x.getIdPizza() + ".  " + x.getNomPizza() + "  " + x.getQuantite() + " *");
                    });
                    break;
                default:
                    break;
            }
        } while (!userOpt.equals(exitFunction));
        int[] TotalPizza = {PizzaCalzone, WattiPizza, PizzaSauceSpecialeDuChef};
        return TotalPizza;
    }
    // static void PanierClient(TotalPizza) {
    //         System.out.println("Pizza Calzone : " + TotalPizza[0] + " WattiPizza : " + TotalPizza[1] + " Pizza Sauce Spéciale du Chef : " + TotalPizza[2]);
    //     }
}
