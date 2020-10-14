import java.util.List;
import java.util.Scanner;

public class Menus {
    private static Scanner scan = new Scanner(System.in);

    // MENU PRINCIPAL DE L'APPLICATION
    public static String MainMenu() {
        System.out.println("*-----------------------------*");
        System.out.println("* 1. Commander une Pizza      *");
        System.out.println("* 2. Payer vos Pizza          *");
        System.out.println("*-----------------------------*");
        System.out.println("* 0. Arret du systeme         *");
        System.out.println("*-----------------------------*");
        System.out.print("* -> Option : ");
        String userOpt = scan.next();
        // On retourne le choix utilisateur
        return userOpt;
    }

    // MENU POUR LA COMMANDE
    public static String MenuPizza(List<Pizza> listePizza) { 
        System.out.println("*---------------------------------*");
        listePizza.forEach(x -> {
            System.out.println("* " + x.getIdPizza() + "  " + x.getNomPizza() + "  " + x.getPrixPizza() + "€  *");
        });
        System.out.println("*---------------------------------*");
        System.out.println("* 0. Revenir au menu principal    *");
        System.out.println("*---------------------------------*");
        System.out.print("* -> Option : ");
        String userOpt = scan.next();
        // On retourne le choix utilisateur
        return userOpt;
    }

     // MENU POUR LE RECAP. COMMANDE
     public static String RecapCommande() {
        System.out.println("*---------------------------------*");
        System.out.println("* Vos Pizza Commandé :            *");
        System.out.println("*                   *");
        System.out.println("*  *");
        System.out.println("*---------------------------------*");
        System.out.println("* 0. Revenir au menu principal    *");
        System.out.println("*---------------------------------*");
        System.out.print("* -> Option : ");
        String userOpt = scan.next();
        // On retourne le choix utilisateur
        return userOpt;
    }
}
