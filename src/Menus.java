import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
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
                frame.dispose();
            }
        });

        frame.setLayout(new GridLayout(2, 1));
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
    public static void MenuPizza(List<Pizza> listePizza) {
        JFrame frame = new JFrame("Pizzéria Thédovasé");

        JLabel label = new JLabel("Liste des pizzas");
        frame.add(label);

        JPanel panel = new JPanel();

        listePizza.forEach(x -> {
            JButton btn = new JButton(x.getNomPizza() + "  " + df.format(x.getPrixPizza()) + "€");
            panel.add(btn);
        });

        JPanel panel2 = new JPanel();

        JButton btnRecap = new JButton("Récapitulatif de la commande");
        JButton btnMenu = new JButton("Revenir au menu principal");

        panel2.add(btnRecap);
        panel2.add(btnMenu);

        frame.setLayout(new GridLayout(2, 1));
        label.setBounds(300,200, 200, 100);
        frame.add(label);
        panel.setBounds(150, 350, 600, 100);
        frame.add(panel);
        panel2.setBounds(200, 500, 500, 100);
        frame.add(panel2);

        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
//        String userOpt = scan.next();
    }

     // MENU POUR LE RECAP. COMMANDE
     public static void RecapCommande(int idCommande) {
         JFrame frame = new JFrame("Pizzéria Thédovasé");

         JLabel label = new JLabel("Bienvenue ! Choisisser une option :", JLabel.CENTER);

         JPanel panel = new JPanel();

         JButton btnCommande = new JButton("Commander une Pizza");
         JButton btnPayer = new JButton("Payer vos Pizza");
         JButton btnArret = new JButton("Arret du système");

         panel.add(btnCommande);
         panel.add(btnPayer);
         panel.add(btnArret);

         frame.setLayout(null);
         label.setBounds(300,200, 200, 100);
         frame.add(label);
         panel.setBounds(150, 300, 500, 100);
         frame.add(panel);

         frame.setSize(800, 800);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
    }
}
