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

    // MENU POUR LA GESTION DU STOCK DU DISTRIBUTEUR
    public static String MenuPizza() {
        System.out.println("*---------------------------------*");
        System.out.println("* 1. Pizza Calzone                *");
        System.out.println("* 2. WattiPizza                   *");
        System.out.println("* 3. Pizza Sauce Spéciale du Chef *");
        System.out.println("*---------------------------------*");
        System.out.println("* 0. Revenir au menu principal    *");
        System.out.println("*---------------------------------*");
        System.out.print("* -> Option : ");
        String userOpt = scan.next();
        System.out.print(userOpt);
        // On retourne le choix utilisateur
        return userOpt;
    }
}
