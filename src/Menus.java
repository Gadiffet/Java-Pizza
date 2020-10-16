import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menus {
    private static Scanner scan = new Scanner(System.in);
    private static DecimalFormat df = new DecimalFormat("0.00");


    // MENU PRINCIPAL DE L'APPLICATION
    public static String MainMenu() {
        JFrame frame = new JFrame("Arti'Pizza");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(720, 720);
        frame.setVisible(true);

        JLabel label = new JLabel("Bienvenue !");
        frame.add(label);

        //On définie le panel
        JPanel panel = new JPanel();

        JButton btn1 = new JButton("Commander une Pizza");
        JButton btn2 = new JButton("Payer vos Pizza ");      
        JButton btn3 = new JButton("Arret du systeme ");   

        // Ajouter les boutons au frame
        panel.add(btn1); 
        panel.add(btn2);
        panel.add(btn3); 
         
        // Ajouter label et panel au frame
        frame.add(label);
        frame.add(panel);

        String userOpt = scan.next();
        // On retourne le choix utilisateur
        return userOpt;
    }

    // MENU POUR LA COMMANDE
    public static String MenuPizza(List<Pizza> listePizza) { 
        System.out.println("*---------------------------------*");
        listePizza.forEach(x -> {
            System.out.println("* " + x.getIdPizza() + "  " + x.getNomPizza() + "  " + df.format(x.getPrixPizza()) + "€  *");
        });
        System.out.println("*---------------------------------*");
        System.out.println("* 8. Récapitulatif de la commande *");
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
