import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

public class Menus {
    private static Scanner scan = new Scanner(System.in);
    private static DecimalFormat df = new DecimalFormat("0.00");

    // MENU PRINCIPAL DE L'APPLICATION
    public static void MainMenu(int idCommande) {
        JFrame frame = new JFrame("Pizzéria Thédovasé");

        JLabel label = new JLabel("Bienvenue ! Choisisser une option :", JLabel.CENTER);

        JPanel panel = new JPanel();

        JButton btnCommande = new JButton("Commander une Pizza");
        JButton btnPayer = new JButton("Payer vos Pizza");
        JButton btnArret = new JButton("Arret du système");

        panel.add(btnCommande);
        panel.add(btnPayer);
        panel.add(btnArret);

        btnCommande.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Main.MenuPizza(idCommande);
            }
        });

        frame.setLayout(null);
        label.setBounds(300,200, 200, 100);
        frame.add(label);
        panel.setBounds(150, 300, 500, 100);
        frame.add(panel);

        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        /*System.out.println("");
        System.out.println("* 0.          *");
        System.out.println("*-----------------------------*");
        System.out.print("* -> Option : ");*/
        // On retourne le choix utilisateur
        // return userOpt;
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
