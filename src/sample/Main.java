package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args)
    {
        JFrame fenetre = new JFrame();
        fenetre.setVisible(true);

        // D�finit le titre de la fen�tre
        fenetre.setTitle("Projet Finance");

        // D�finit taille de la fen�tre
        fenetre.setSize(500, 500);
        //Emp�che la redimension de la fen�tre
        fenetre.setResizable(false);

        //Nous demandons maintenant � notre objet de se positionner au centre
        fenetre.setLocationRelativeTo(null);

        //Termine le processus lorsqu'on clique sur la croix rouge
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pan = new JPanel();
        fenetre.setBackground(Color.GREEN);
        pan.setPreferredSize(new Dimension(300, 300));
        fenetre.setContentPane(pan);


        Object[][] actionData = {
                {"dg","dsh","dsh", "dsh", "sdg", "sdg"}
        };
        String actionTitle[] = {"Nom", "Valeur", "Poids", "Ticher", "Prix", "Date d'�valuation"};
        JTable tableauAction = new JTable(actionData, actionTitle);
        fenetre.getContentPane().add(new JScrollPane(tableauAction));
        tableauAction.setVisible(true);
        fenetre.setSize(600, 140);





    }
}
